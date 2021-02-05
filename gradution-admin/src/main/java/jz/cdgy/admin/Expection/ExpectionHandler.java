//package jz.cdgy.admin.Expection;
//
//import jz.cdgy.common.api.CommonResult;
//import jz.cdgy.common.constant.StatusCode;
//import jz.cdgy.common.exception.ParamException;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.security.authentication.BadCredentialsException;
//import org.springframework.web.bind.annotation.ExceptionHandler;
//import org.springframework.web.bind.annotation.RestControllerAdvice;
//
//@Slf4j
//@RestControllerAdvice
//public class ExpectionHandler {
//
//    @ExceptionHandler(ParamException.class)
//    public CommonResult handParamExpection(ParamException ex){
//        log.error("{}",ex.getMessage()+ex.fillInStackTrace()+ex.getCause()+ex.getStackTrace());
//        return CommonResult.FAILED(ex.getMessage());
//    }
//
//    @ExceptionHandler(BadCredentialsException.class)
//    public CommonResult  handBadCredentialsException(BadCredentialsException ex){
//        log.error("{}",ex.getMessage()+ex.fillInStackTrace()+ex.getCause()+ex.getStackTrace());
//        return CommonResult.FAILED("用户名密码错误!");
//    }
//
////    @ExceptionHandler(Exception.class)
////     public CommonResult handExpection(Exception ex){
////        log.error("{}",ex.getMessage()+ex.fillInStackTrace()+ex.getCause()+ex.getStackTrace());
////        return CommonResult.FAILED(StatusCode.FAILED_CODE.getMessage());
////     }
//}
