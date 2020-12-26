package jz.cdgy.common.aop;

import com.fasterxml.jackson.databind.ObjectMapper;
import jz.cdgy.common.Utils.JsonUtil;
import jz.cdgy.common.annotion.WebLog;
import jz.cdgy.common.model.esLog;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

@Aspect
@Component
@Slf4j
public class LogAspect {
    @Autowired
    private RabbitTemplate rabbitTemplate;
    @Autowired
    private ObjectMapper objectMapper;
    @Pointcut("@annotation(jz.cdgy.common.annotion.WebLog)")
    public void logCut(){

    }

    @Around(value = "logCut()")
    public Object around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        log.info("开始记录日志信息");
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();
        esLog es = new esLog();
        Object result = proceedingJoinPoint.proceed();
        Signature signature = proceedingJoinPoint.getSignature();
        MethodSignature methodSignature = (MethodSignature) signature;
        Method method = methodSignature.getMethod();
        if(method.isAnnotationPresent(WebLog.class)){
            WebLog webLog = method.getAnnotation(WebLog.class);
            es.setOperatorModel(webLog.OperationModule());
            es.setOperatorTarget(webLog.OperationTarget());
        }
        es.setRequestUrl(request.getRequestURL().toString());
        es.setRequestUri(request.getRequestURI());
        es.setOperatorIp(request.getRemoteAddr());
        es.setOperatorMethod(request.getMethod());
        es.setOperator(SecurityContextHolder.getContext().getAuthentication().getName());
        es.setOperatorTime(new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date()));
        ArrayList arrayList = new ArrayList();
        Object[] objects = proceedingJoinPoint.getArgs();
        for(int i=0;i<objects.length;i++){
            arrayList.add(objects[i]);
        }
        es.setResult(result);
        es.setParameter(arrayList);
        rabbitTemplate.convertAndSend("admin-log-exchange","admin-log-key",es);
        log.info("{}",es);
        return result;
    }
}
