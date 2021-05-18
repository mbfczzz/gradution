package jz.cdgy.admin.controller;

import jz.cdgy.admin.service.RefundWayService;
import jz.cdgy.admin.service.SpendWayService;
import jz.cdgy.common.annotion.WebLog;
import jz.cdgy.common.api.CommonResult;
import jz.cdgy.mbg.pojo.RefundWay;
import jz.cdgy.mbg.pojo.SpendWay;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/refundway")
public class RefundWayController {
    @Autowired
    private RefundWayService refundWayService;

    @WebLog(OperationModule = "支付方式管理",OperationTarget = "获取map结构支付方式")
    @RequestMapping(value = "/getRefundWay",method = RequestMethod.GET)
    public CommonResult getRefundWay(){
        return CommonResult.SUCCESS("获取支出方式成功!",refundWayService.getRefundWay());
    }


    @WebLog(OperationModule = "支付方式管理",OperationTarget = "获取支付方式")
    @RequestMapping(value = "/getAllRefundWay",method = RequestMethod.POST)
    public CommonResult getAllRefundWay(@RequestParam(name = "page",defaultValue = "1")Integer page, @RequestParam(name = "limit",defaultValue = "10")Integer limit, RefundWay refundWay){
        return CommonResult.SUCCESS("获取全部支出方式成功!",refundWayService.getAllRefundWay(page,limit,refundWay));
    }

    @WebLog(OperationModule = "支付方式管理",OperationTarget = "添加支付方式")
    @RequestMapping(value = "/addRefundWay",method = RequestMethod.POST)
    public CommonResult addRewards(@RequestBody RefundWay refundWay){
        refundWayService.addRefundWay(refundWay);
        return CommonResult.SUCCESS("添加支出方式成功!");
    }

    @WebLog(OperationModule = "支付方式管理",OperationTarget = "修改支付方式")
    @RequestMapping(value = "/updateRefundWay",method = RequestMethod.PUT)
    public CommonResult updateRefundWay(@RequestBody RefundWay refundWay){
        refundWayService.updateRefundWay(refundWay);
        return CommonResult.SUCCESS("修改支出方式成功!");
    }

    @WebLog(OperationModule = "支付方式管理",OperationTarget = "删除支付方式")
    @RequestMapping(value = "/deleteRefundWay/{id}",method = RequestMethod.DELETE)
    public CommonResult deleteRefundWay(@PathVariable(name = "id") List<Integer> id){
        refundWayService.deleteRefundWay(id);
        return CommonResult.SUCCESS("删除支出方式成功!");
    }
}
