package jz.cdgy.common.constant;

public enum  StatusCode {
    SUCCESS_CODE(200,"返回成功"),
    FAILED_CODE(400,"未知错误"),
    PERMISSION_UNDIFINE(401,"权限未定义"),
    REFUND_VISIT(403,"拒绝访问"),
    PAGE_UNDIFINE(404,"页面未定义"),
    REQUEST_OVERTIME(408,"请求超时"),
    SERVER_INNERERROR(500,"服务器内部错误"),
    UN_LOGIN(203,"请登录访问");


    private Integer code;
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    private StatusCode(Integer code, String message){
        this.code = code;
        this.message =message;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}
