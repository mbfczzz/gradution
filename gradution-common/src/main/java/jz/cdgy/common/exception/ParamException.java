package jz.cdgy.common.exception;

import jz.cdgy.common.constant.StatusCode;

public class ParamException extends RuntimeException {
        private Integer code = StatusCode.FAILED_CODE.getCode();
        private String message = StatusCode.FAILED_CODE.getMessage();

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ParamException(Integer code,String msg){
        super(msg);
        this.code = code;
        this.message = msg;
    }

    public ParamException (Integer code){
        super(StatusCode.FAILED_CODE.getMessage());
        this.code = code;
    }

    public ParamException (String msg){
        super(msg);
        this.message = msg;
    }

    public ParamException(){
        super(StatusCode.FAILED_CODE.getMessage());
    }
}
