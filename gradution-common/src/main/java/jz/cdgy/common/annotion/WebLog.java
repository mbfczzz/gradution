package jz.cdgy.common.annotion;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Documented
@Target(ElementType.METHOD)
public @interface WebLog {
    //操作模块
    String OperationModule();

    //操作目的
    String OperationTarget();
}
