package jz.cdgy.common.aop;

import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public aspect LogAspect {

    @Pointcut(value = "@annotation(jz.cdgy.common.annotion.WebLog)")
    public void logCut(){};

    @Around("logCut()")
    public Object around(){
        return null;
    }
}
