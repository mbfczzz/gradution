package jz.cdgy.admin.controller;

import jz.cdgy.admin.service.AccountService;
import jz.cdgy.common.annotion.WebLog;
import jz.cdgy.common.api.CommonResult;
import jz.cdgy.mbg.pojo.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/account")
public class AccountController {
    @Autowired
    private AccountService accountService;

    @WebLog(OperationModule = "工资账套管理",OperationTarget = "获取全部工资账套")
    @RequestMapping(value = "/getAllAccount",method = RequestMethod.POST)
    public CommonResult getAllAccount(@RequestParam(name = "page",defaultValue = "1")Integer page, @RequestParam(name = "limit",defaultValue = "10")Integer limit, Account account){
        return CommonResult.SUCCESS("获取用户信息成功!",accountService.getAllAccount(page,limit,account));
    }

    @WebLog(OperationModule = "工资账套管理",OperationTarget = "添加工资账套")
    @RequestMapping(value = "/addAccount",method = RequestMethod.POST)
    public CommonResult addAccount(@RequestBody Account account){
        accountService.addAccount(account);
        return CommonResult.SUCCESS("录入成功!");
    }

    @WebLog(OperationModule = "工资账套管理",OperationTarget = "更新工资账套")
    @RequestMapping(value = "/updateAccount",method = RequestMethod.PUT)
    public CommonResult updateAccount(@RequestBody Account account){
        accountService.updateAccount(account);
        return CommonResult.SUCCESS("修改员工成功!");
    }

    @WebLog(OperationModule = "工资账套管理",OperationTarget = "删除工资账套")
    @RequestMapping(value = "/deleteAccount/{id}",method = RequestMethod.DELETE)
    public CommonResult deleteAccount(@PathVariable(name = "id") List<Integer> id){
        accountService.deleteAccount(id);
        return CommonResult.SUCCESS("删除员工成功!");
    }

    @WebLog(OperationModule = "工资账套管理",OperationTarget = "获取map结构工资账套")
    @RequestMapping(value = "/getAccountByMap",method = RequestMethod.GET)
    public CommonResult getAccountByMap(){
        return CommonResult.SUCCESS("删除员工成功!",accountService.getAccountByMap());
    }
}
