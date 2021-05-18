package jz.cdgy.admin.controller;

import jz.cdgy.admin.service.ExpenditureService;
import jz.cdgy.common.annotion.WebLog;
import jz.cdgy.common.api.CommonResult;
import jz.cdgy.mbg.pojo.Spend;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value ="/expenditure")
public class ExpenditureController {
    @Autowired
    private ExpenditureService expenditureService;

    @WebLog(OperationModule = "支出管理",OperationTarget = "获取全部支出")
    @RequestMapping(value = "/getAllExpenditure",method = RequestMethod.POST)
    public CommonResult getAllSpend(@RequestParam(name = "page",defaultValue = "1")Integer page, @RequestParam(name = "limit",defaultValue = "10")Integer limit, Spend spend){
        return CommonResult.SUCCESS("获取用户信息成功!",expenditureService.getAllSpend(page,limit,spend));
    }

    @WebLog(OperationModule = "支出管理",OperationTarget = "添加支出")
    @RequestMapping(value = "/addExpenditure",method = RequestMethod.POST)
    public CommonResult addSpend(@RequestBody Spend spend){
        expenditureService.addSpend(spend);
        return CommonResult.SUCCESS("录入成功!");
    }

    @WebLog(OperationModule = "支出管理",OperationTarget = "修改支出")
    @RequestMapping(value = "/updateExpenditure",method = RequestMethod.PUT)
    public CommonResult updateSpend(@RequestBody Spend spend){
        expenditureService.updateSpend(spend);
        return CommonResult.SUCCESS("修改员工成功!");
    }

    @WebLog(OperationModule = "支出管理",OperationTarget = "删除支出")
    @RequestMapping(value = "/deleteExpenditure/{id}",method = RequestMethod.DELETE)
    public CommonResult deleteSpend(@PathVariable(name = "id") List<Integer> id){
        expenditureService.deleteSpend(id);
        return CommonResult.SUCCESS("删除员工成功!");
    }

//    @WebLog(OperationModule = "支出管理",OperationTarget = "获取map结构项目名")
//    @RequestMapping(value = "/getSpendItem",method = RequestMethod.GET)
//    public CommonResult getSpendItem(){
//        return CommonResult.SUCCESS("获取map结构员工名",expenditureService.getSpendItem());
//    }
}
