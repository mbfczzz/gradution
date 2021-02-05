package jz.cdgy.msg.util;

import jz.cdgy.common.exception.ParamException;

public class AssertsUtil {
    public static void isTrue(boolean flag,Integer code,String message){
        if(flag){
            throw new ParamException(code,message);
        }
    }

    public static void isTrue(boolean flag){
        if(flag){
            throw new ParamException();
        }
    }
    public static void isTrue(boolean flag,String message){
        if(flag){
            throw new ParamException(message);
        }
    }
    public static void isTrue(boolean flag,Integer code){
        if(flag){
            throw new ParamException(code);
        }
    }
}
