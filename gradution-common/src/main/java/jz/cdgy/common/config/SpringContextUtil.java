package jz.cdgy.common.config;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class SpringContextUtil implements ApplicationContextAware {


    private static ApplicationContext context;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext)
            throws BeansException {
        // TODO Auto-generated method stub
        context = applicationContext;
    }
    //获得applicationContext
    public static ApplicationContext getApplicationContext() {
        return context;
    }
    public static void clearHolder(){
        context=null;
    }
    //获取Bean
    public static <T> T getBean(Class<T> requiredType){
        //assertContextInjected();
        return (T) getApplicationContext().getBean(requiredType);
    }
    @SuppressWarnings("unchecked")
    public static <T> T getBean(String name){
        return (T) getApplicationContext().getBean(name);
    }
}
