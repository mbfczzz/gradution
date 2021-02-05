//package jz.cdgy.admin.service.impl;
//
//import cn.hutool.json.JSONUtil;
//import jz.cdgy.common.api.CommonResult;
//import jz.cdgy.common.constant.StatusCode;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.security.core.AuthenticationException;
//import org.springframework.security.web.AuthenticationEntryPoint;
//
//import javax.servlet.ServletException;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//
//@Slf4j
//public class AuthenticationEntryPointImpl implements AuthenticationEntryPoint {
//    @Override
//    public void commence(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, AuthenticationException e) throws IOException, ServletException {
//        httpServletResponse.setCharacterEncoding("UTF-8");
//        httpServletResponse.setContentType("application/json");
//        httpServletResponse.getWriter().println(JSONUtil.parse(new CommonResult(StatusCode.PERMISSION_UNDIFINE.getCode(),StatusCode.PERMISSION_UNDIFINE.getMessage(),null)));
//        log.info("{}","用户没有权限登录!");
//        httpServletResponse.getWriter().flush();
//    }
//}
