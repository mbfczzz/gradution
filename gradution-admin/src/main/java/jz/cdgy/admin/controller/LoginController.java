package jz.cdgy.admin.controller;

import io.swagger.annotations.ApiOperation;
import jz.cdgy.admin.service.LoginService;
import jz.cdgy.common.annotion.WebLog;
import jz.cdgy.common.api.CommonResult;
import jz.cdgy.common.model.UserDto;
import jz.cdgy.mbg.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author mbfczzz
 */
@ApiOperation("登录接口")
@RestController
public class LoginController {

    @Autowired
    private LoginService loginService;

    @WebLog(OperationModule = "系统登录",OperationTarget = "用户登录")
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public CommonResult login(@RequestBody  User user) {
        return loginService.login(user);
    }

    @RequestMapping(value = "/loadByUsername",method = RequestMethod.GET)
    public UserDto loadByUsername(@RequestParam String username) {
        return loginService.loadUserByUsername(username);
    }

    @WebLog(OperationModule = "系统登录",OperationTarget = "获取用户信息")
    @RequestMapping(value = "/getUserInfo",method = RequestMethod.GET)
    public CommonResult getUserInfo(){
        return CommonResult.SUCCESS("获取当前用户成功!",loginService.getUserInfo());
    }

    @WebLog(OperationModule = "系统登录",OperationTarget = "用户注册")
    @RequestMapping(value = "/register",method = RequestMethod.POST)
    public CommonResult register(@RequestBody  User user){
        return CommonResult.SUCCESS(loginService.register(user));
    }
}
