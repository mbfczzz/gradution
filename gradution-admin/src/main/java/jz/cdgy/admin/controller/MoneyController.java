package jz.cdgy.admin.controller;

import jz.cdgy.admin.service.AccountService;
import jz.cdgy.admin.service.MoneyService;
import jz.cdgy.common.annotion.WebLog;
import jz.cdgy.common.api.CommonResult;
import jz.cdgy.mbg.pojo.Account;
import jz.cdgy.mbg.pojo.Money;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/money")
public class MoneyController {
    @Autowired
    private MoneyService moneyService;

    @WebLog(OperationModule = "工资管理",OperationTarget = "获取全部工资")
    @RequestMapping(value = "/getAllMoney",method = RequestMethod.POST)
    public CommonResult getAllMoney(@RequestParam(name = "page",defaultValue = "1")Integer page, @RequestParam(name = "limit",defaultValue = "10")Integer limit, Money money){
        return CommonResult.SUCCESS("获取用户信息成功!",moneyService.getAllMoney(page,limit,money));
    }

    @WebLog(OperationModule = "工资管理",OperationTarget = "添加工资")
    @RequestMapping(value = "/addMoney",method = RequestMethod.POST)
    public CommonResult addMoney(@RequestBody Money money){
        moneyService.addMoney(money);
        return CommonResult.SUCCESS("录入成功!");
    }

    @WebLog(OperationModule = "工资管理",OperationTarget = "更新工资")
    @RequestMapping(value = "/updateMoney",method = RequestMethod.PUT)
    public CommonResult updateAccount(@RequestBody Money money){
        moneyService.updateMoney(money);
        return CommonResult.SUCCESS("修改员工成功!");
    }

    @WebLog(OperationModule = "工资管理",OperationTarget = "删除工资")
    @RequestMapping(value = "/deleteMoney/{id}",method = RequestMethod.DELETE)
    public CommonResult deleteMoney(@PathVariable(name = "id") List<Integer> id){
        moneyService.deleteMoney(id);
        return CommonResult.SUCCESS("删除员工成功!");
    }
}
