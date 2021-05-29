package jz.cdgy.admin.controller;

import jz.cdgy.admin.service.AgencyService;
import jz.cdgy.common.annotion.WebLog;
import jz.cdgy.common.api.CommonResult;
import jz.cdgy.mbg.pojo.Agency;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/agency")
public class AgencyController {
    @Autowired
    private AgencyService agencyService;

    @WebLog(OperationModule = "待办管理",OperationTarget = "获取全部待办")
    @RequestMapping(value = "/getAllAgency",method = RequestMethod.POST)
    public CommonResult getAllAgency(@RequestParam(name = "page",defaultValue = "1")Integer page, @RequestParam(name = "limit",defaultValue = "10")Integer limit, Agency agency){
        return CommonResult.SUCCESS("获取用户信息成功!",agencyService.getAllAgency(page,limit,agency));
    }

    @WebLog(OperationModule = "待办管理",OperationTarget = "添加待办")
    @RequestMapping(value = "/addAgency",method = RequestMethod.POST)
    public CommonResult addAgency(@RequestBody Agency agency){
        agencyService.addAgency(agency);
        return CommonResult.SUCCESS("录入成功!");
    }

    @WebLog(OperationModule = "待办管理",OperationTarget = "更新待办")
    @RequestMapping(value = "/updateAgency",method = RequestMethod.PUT)
    public CommonResult updateAgency(@RequestBody Agency agency){
        agencyService.updateAgency(agency);
        return CommonResult.SUCCESS("修改员工成功!");
    }

    @WebLog(OperationModule = "待办管理",OperationTarget = "删除待办")
    @RequestMapping(value = "/deleteAgency/{id}",method = RequestMethod.DELETE)
    public CommonResult deleteAgency(@PathVariable(name = "id") List<Integer> id){
        agencyService.deleteAgency(id);
        return CommonResult.SUCCESS("删除员工成功!");
    }

    @WebLog(OperationModule = "工资账套管理",OperationTarget = "获取map结构待办")
    @RequestMapping(value = "/getAgencyByMap",method = RequestMethod.GET)
    public CommonResult getAgencyByMap(){
        return CommonResult.SUCCESS("删除员工成功!",agencyService.getAgencyByMap());
    }
}
