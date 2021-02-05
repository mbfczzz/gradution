package jz.cdgy.common.api;

import jz.cdgy.common.constant.StatusCode;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {
    private Integer code;
    private String  message;
    private T result;

    public static CommonResult SUCCESS(String message){
        CommonResult commonResult = new CommonResult();
        commonResult.setCode(StatusCode.SUCCESS_CODE.getCode());
        commonResult.setMessage(message);
        return commonResult;
    }

    public T getResult() {
        return result;
    }

    public void setResult(T result) {
        this.result = result;
    }

    public static <T>CommonResult SUCCESS(String message, T result){
        CommonResult commonResult = new CommonResult();
        commonResult.setCode(StatusCode.SUCCESS_CODE.getCode());
        commonResult.setMessage(message);
        commonResult.setResult(result);
        return commonResult;
    }

    public static <T>CommonResult SUCCESS(T result){
        CommonResult commonResult = new CommonResult();
        commonResult.setCode(StatusCode.SUCCESS_CODE.getCode());
        commonResult.setMessage("返回成功!");
        commonResult.setResult(result);
        return commonResult;
    }

    public static CommonResult FAILED(String message){
        CommonResult commonResult = new CommonResult();
        commonResult.setCode(StatusCode.FAILED_CODE.getCode());
        commonResult.setMessage(message);
        return commonResult;
    }
    public static CommonResult FAILED(){
        CommonResult commonResult = new CommonResult();
        commonResult.setCode(StatusCode.FAILED_CODE.getCode());
        return commonResult;
    }

    @Override
    public String toString() {
        return "CommonResult{" +
                "code=" + code +
                ", message='" + message + '\'' +
                ", result=" + result +
                '}';
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
