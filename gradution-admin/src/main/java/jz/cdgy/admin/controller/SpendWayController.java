package jz.cdgy.admin.controller;

import jz.cdgy.admin.service.SpendWayService;
import jz.cdgy.common.annotion.WebLog;
import jz.cdgy.common.api.CommonResult;
import jz.cdgy.mbg.pojo.Rewards;
import jz.cdgy.mbg.pojo.Spend;
import jz.cdgy.mbg.pojo.SpendWay;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/spendway")
public class SpendWayController {
    @Autowired
    private SpendWayService spendWayService;

    @WebLog(OperationModule = "支付方式管理",OperationTarget = "获取map结构支付方式")
    @RequestMapping(value = "/getSpendWay",method = RequestMethod.GET)
    public CommonResult getSpendWay(){
        return CommonResult.SUCCESS("获取支出方式成功!",spendWayService.getSpendWay());
    }


    @WebLog(OperationModule = "支付方式管理",OperationTarget = "获取支付方式")
    @RequestMapping(value = "/getAllSpendWay",method = RequestMethod.POST)
    public CommonResult getAllSpendWay(@RequestParam(name = "page",defaultValue = "1")Integer page, @RequestParam(name = "limit",defaultValue = "10")Integer limit, SpendWay spendWay){
        return CommonResult.SUCCESS("获取全部支出方式成功!",spendWayService.getAllSpendWay(page,limit,spendWay));
    }

    @WebLog(OperationModule = "支付方式管理",OperationTarget = "添加支付方式")
    @RequestMapping(value = "/addSpendWay",method = RequestMethod.POST)
    public CommonResult addRewards(@RequestBody SpendWay spendWay){
        spendWayService.addSpendWay(spendWay);
        return CommonResult.SUCCESS("添加支出方式成功!");
    }

    @WebLog(OperationModule = "支付方式管理",OperationTarget = "修改支付方式")
    @RequestMapping(value = "/updateSpendWay",method = RequestMethod.PUT)
    public CommonResult updateRewards(@RequestBody SpendWay spendWay){
        spendWayService.updateSpendWay(spendWay);
        return CommonResult.SUCCESS("修改支出方式成功!");
    }

    @WebLog(OperationModule = "支付方式管理",OperationTarget = "删除支付方式")
    @RequestMapping(value = "/deleteSpendWay/{id}",method = RequestMethod.DELETE)
    public CommonResult deleteRewards(@PathVariable(name = "id") List<Integer> id){
        spendWayService.deleteSpendWay(id);
        return CommonResult.SUCCESS("删除支出方式成功!");
    }
}
