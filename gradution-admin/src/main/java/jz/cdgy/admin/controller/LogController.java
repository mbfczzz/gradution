package jz.cdgy.admin.controller;

import io.swagger.annotations.ApiOperation;
import jz.cdgy.admin.service.LogService;
import jz.cdgy.common.annotion.WebLog;
import jz.cdgy.common.api.CommonResult;
import jz.cdgy.common.model.esLog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/log")
@ApiOperation("日志管理")
public class LogController {

    @Autowired
    private LogService logService;

    @RequestMapping(value = "/searchAllLog")
    @WebLog(OperationModule = "日志管理",OperationTarget = "查询日志")
    public CommonResult queryAllLog(@RequestParam(name = "page",defaultValue = "1") Integer page,@RequestParam(name = "limit",defaultValue = "100") Integer limit,esLog log){
        return CommonResult.SUCCESS("查询成功!",logService.searchAllLog(page,limit,log));
    }
}
