package jz.cdgy.admin.controller;

import io.swagger.annotations.Api;
import jz.cdgy.admin.service.UserService;
import jz.cdgy.common.annotion.WebLog;
import jz.cdgy.common.api.CommonResult;
import jz.cdgy.mbg.pojo.Permission;
import jz.cdgy.mbg.pojo.Role;
import jz.cdgy.mbg.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author mbfczzz
 */
@RestController
@RequestMapping("/user")
@Api("系统用户管理")
public class UserController {

    @Autowired
    private UserService userService;

    @WebLog(OperationModule = "系统用户管理",OperationTarget = "获取全部用户")
    @RequestMapping(value = "/getAllUser",method = RequestMethod.POST)
    public CommonResult getAllUser(@RequestParam(name = "page",defaultValue = "1")Integer page, @RequestParam(name = "limit",defaultValue = "10")Integer limit, User user){
        return CommonResult.SUCCESS("获取用户信息成功!",userService.getAllUser(page,limit,user));
    }

    @WebLog(OperationModule ="系统用户管理",OperationTarget = "增加用户")
    @RequestMapping(value = "/addUser",method = RequestMethod.POST)
    public CommonResult addUser(User user){
        userService.addUser(user);
        return CommonResult.SUCCESS("增加成功!");
    }


    @WebLog(OperationModule ="系统用户管理",OperationTarget = "改变用户状态")
    @RequestMapping(value = "/updateUserByIsValid",method = RequestMethod.PUT)
    public CommonResult updateUserByIsValid(@RequestBody User user){
        userService.updateUserByIsValid(user);
        return CommonResult.SUCCESS("增加成功!");
    }

    @WebLog(OperationModule ="系统用户管理",OperationTarget = "更新用户")
    @RequestMapping(value = "/updateUser",method = RequestMethod.PUT)
    public CommonResult updateUser(@RequestBody  User user){
        userService.updateUser(user);
        return CommonResult.SUCCESS("操作成功!");
    }

    @WebLog(OperationModule ="系统用户管理",OperationTarget = "删除用户")
    @RequestMapping(value = "/deleteUser/{users}",method = RequestMethod.DELETE)
    public CommonResult deleteUser(@PathVariable(name = "users") List<Integer> id){
        userService.deleteUser(id);
        return CommonResult.SUCCESS("删除成功!");
    }

    @WebLog(OperationModule = "系统用户管理",OperationTarget = "获取用户角色")
    @RequestMapping(value = {"/getUserRole/{id}","/getUserRole"},method = RequestMethod.GET)
    public CommonResult gerUserRole(@PathVariable(name = "id",required = false)Integer id){
       return CommonResult.SUCCESS("获取用户角色成功!",userService.gerUserRole(id));
    }

    @WebLog(OperationModule = "系统系统管理",OperationTarget = "获取全部角色")
    @RequestMapping(value = {"/getAllRole"},method = RequestMethod.GET)
    public CommonResult getAllRole(@RequestParam(name = "page",defaultValue = "1")Integer page, @RequestParam(name = "limit",defaultValue = "10")Integer limit){
        return CommonResult.SUCCESS("获取用户信息成功!",userService.getAllRole(page,limit));
    }

    @WebLog(OperationModule ="系统用户管理",OperationTarget = "增加角色")
    @RequestMapping(value = "/addRole",method = RequestMethod.POST)
    public CommonResult addRole(Role role){
        userService.addRole(role);
        return CommonResult.SUCCESS("增加成功!");
    }

    @WebLog(OperationModule ="系统用户管理",OperationTarget = "更新角色")
    @RequestMapping(value = "/updateRole",method = RequestMethod.PUT)
    public CommonResult updateRole(@RequestBody  Role role){
        userService.updateRole(role);
        return CommonResult.SUCCESS("操作成功!");
    }

    @WebLog(OperationModule ="系统用户管理",OperationTarget = "删除角色")
    @RequestMapping(value = "/deleteRole/{roles}",method = RequestMethod.DELETE)
    public CommonResult deleteRole(@PathVariable(name = "roles") List<Integer> id){
        userService.deleteRole(id);
        return CommonResult.SUCCESS("删除成功!");
    }

    @WebLog(OperationModule ="系统用户管理",OperationTarget = "获取全部权限")
    @RequestMapping(value = "/getAllPermission",method = RequestMethod.POST)
    public CommonResult getAllPermission(@RequestParam(name = "page",defaultValue = "1")Integer page, @RequestParam(name = "limit",defaultValue = "10")Integer limit, Permission permission){
        return CommonResult.SUCCESS("获取权限成功!",userService.getAllPermission(page,limit,permission));
    }

    @WebLog(OperationModule ="系统用户管理",OperationTarget = "获取树型权限结构")
    @RequestMapping(value = "/getTreePermission",method = RequestMethod.GET)
    public CommonResult getTreePermission(){
        return CommonResult.SUCCESS("获取权限成功!",userService.getTreePermission());
    }

    @WebLog(OperationModule ="系统用户管理",OperationTarget = "更新角色权限")
    @RequestMapping(value = "/updateTreePermission",method = RequestMethod.PUT)
    public CommonResult updateTreePermission(@RequestBody  Role role){
        userService.updateTreePermission(role);
        return CommonResult.SUCCESS("更新角色权限成功!");
    }

    @WebLog(OperationModule ="系统用户管理",OperationTarget = "获取权限类型")
    @RequestMapping(value = "/getPermissionType",method = RequestMethod.GET)
    public CommonResult getPermissionType(){
        return CommonResult.SUCCESS("获取成功!",userService.getPermissionType());
    }

    @WebLog(OperationModule ="系统用户管理",OperationTarget = "获取权限层级")
    @RequestMapping(value = "/getHierarchy",method = RequestMethod.GET)
    public CommonResult getHierarchy(){
        return CommonResult.SUCCESS("获取成功!",userService.getHierarchy());
    }

    @WebLog(OperationModule ="系统用户管理",OperationTarget = "更新权限")
    @RequestMapping(value = "/updatePermission",method = RequestMethod.POST)
    public CommonResult updatePermission(@RequestBody  Permission permission){
        userService.updatePermission(permission);
        return CommonResult.SUCCESS("更新成功!");
    }

    @WebLog(OperationModule ="系统用户管理",OperationTarget = "添加权限")
    @RequestMapping(value = "/addPermission",method = RequestMethod.POST)
    public CommonResult addPermission(Permission permission){
        userService.addPermission(permission);
        return CommonResult.SUCCESS("更新成功!");
    }
}

