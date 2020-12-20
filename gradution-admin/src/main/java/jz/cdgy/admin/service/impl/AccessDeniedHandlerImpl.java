package jz.cdgy.admin.service.impl;

import cn.hutool.json.JSONUtil;
import jz.cdgy.common.api.CommonResult;
import jz.cdgy.common.constant.StatusCode;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.web.access.AccessDeniedHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@Slf4j
public class AccessDeniedHandlerImpl implements AccessDeniedHandler {
    @Override
    public void handle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, AccessDeniedException e) throws IOException, ServletException, IOException {
        httpServletResponse.setCharacterEncoding("UTF-8");
        httpServletResponse.setContentType("application/json");
        httpServletResponse.getWriter().println(JSONUtil.parse(new CommonResult(StatusCode.UN_LOGIN.getCode(),StatusCode.UN_LOGIN.getMessage(),null)));
        log.info("{}","用户认证失败!");
        httpServletResponse.getWriter().flush();
    }
}
