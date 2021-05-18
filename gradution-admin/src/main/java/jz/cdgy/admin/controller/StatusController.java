package jz.cdgy.admin.controller;

import jz.cdgy.admin.service.StatusService;
import jz.cdgy.common.annotion.WebLog;
import jz.cdgy.common.api.CommonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/status")
public class StatusController {
    @Autowired
    private StatusService statusService;

    @WebLog(OperationModule = "状态管理",OperationTarget = "获取状态")
    @RequestMapping(value = "/getStatus",method = RequestMethod.POST)
    public CommonResult getStatus(@RequestParam(name = "type")String type){
        return CommonResult.SUCCESS("获取状态成功!",statusService.getStatus(type));
    }
}
