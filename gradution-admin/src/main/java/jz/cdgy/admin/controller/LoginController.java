package jz.cdgy.admin.controller;

import io.swagger.annotations.ApiOperation;
import jz.cdgy.admin.model.ActiceUser;
import jz.cdgy.admin.service.LoginService;
import jz.cdgy.common.annotion.WebLog;
import jz.cdgy.common.api.CommonResult;
import jz.cdgy.mbg.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@ApiOperation("登录接口")
@RestController
public class LoginController {

    @Autowired
    LoginService loginService;

    @WebLog(OperationModule = "系统登录",OperationTarget = "用户登录")
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public CommonResult login(@RequestBody  User user) {
        String token = loginService.login(user);
        Map<String,String> map = new HashMap<>();
        map.put("token",token);
        return CommonResult.SUCCESS("登陆成功!",map);
    }

    @WebLog(OperationModule = "系统登录",OperationTarget = "获取用户信息")
    @RequestMapping(value = "/getUserInfo",method = RequestMethod.GET)
    public CommonResult getUserInfo(){
        ActiceUser acticeUser = loginService.getUserInfo();
        return CommonResult.SUCCESS("获取当前用户成功!",acticeUser);
    }

    @WebLog(OperationModule = "系统登录",OperationTarget = "用户注册")
    @RequestMapping(value = "/register",method = RequestMethod.POST)
    public CommonResult register(@RequestBody  User user){
        return CommonResult.SUCCESS(loginService.register(user));
    }

}
