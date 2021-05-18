package jz.cdgy.admin.controller;

import jz.cdgy.admin.service.SpendItemService;
import jz.cdgy.admin.service.SpendWayService;
import jz.cdgy.common.annotion.WebLog;
import jz.cdgy.common.api.CommonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/spenditem")
public class SpendItemController {
    @Autowired
    private SpendItemService spendItemService;

    @WebLog(OperationModule = "状态管理",OperationTarget = "获取状态")
    @RequestMapping(value = "/getSpendItem",method = RequestMethod.GET)
    public CommonResult getSpendItem(){
        return CommonResult.SUCCESS("获取支出方式成功!",spendItemService.getSpendItem());
    }
}
