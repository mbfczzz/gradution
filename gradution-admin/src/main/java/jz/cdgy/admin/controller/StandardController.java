package jz.cdgy.admin.controller;

import jz.cdgy.admin.service.StandardService;
import jz.cdgy.common.annotion.WebLog;
import jz.cdgy.common.api.CommonResult;
import jz.cdgy.mbg.pojo.Standard;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/standard")
public class StandardController {
    @Autowired
    private StandardService standardService;

    @WebLog(OperationModule = "人事管理",OperationTarget = "获取全部奖惩规则")
    @RequestMapping(value = "/getAllStandard",method = RequestMethod.POST)
    public CommonResult getAllStandard(@RequestParam(name = "page",defaultValue = "1")Integer page, @RequestParam(name = "limit",defaultValue = "10")Integer limit, Standard standard){
        return CommonResult.SUCCESS("获取用户信息成功!",standardService.getAllStandard(page,limit,standard));
    }

    @WebLog(OperationModule = "人事管理",OperationTarget = "添加规则")
    @RequestMapping(value = "/addStandard",method = RequestMethod.POST)
    public CommonResult addStandard(@RequestBody Standard standard){
        standardService.addStandard(standard);
        return CommonResult.SUCCESS("录入成功!");
    }

    @WebLog(OperationModule = "人事管理",OperationTarget = "修改规则")
    @RequestMapping(value = "/updateStandard",method = RequestMethod.PUT)
    public CommonResult updateStandard(@RequestBody Standard standard){
        standardService.updateStandard(standard);
        return CommonResult.SUCCESS("修改员工成功!");
    }

    @WebLog(OperationModule = "人事管理",OperationTarget = "删除规则")
    @RequestMapping(value = "/deleteStandard/{id}",method = RequestMethod.GET)
    public CommonResult deleteStandard(@PathVariable(name = "id") List<Integer> id){
        standardService.deleteStandard(id);
        return CommonResult.SUCCESS("删除员工成功!");
    }

    @WebLog(OperationModule = "人事管理",OperationTarget = "获取奖惩类型")
    @RequestMapping(value = "/getStandardType",method = RequestMethod.GET)
    public CommonResult getStandardType(){
        return CommonResult.SUCCESS("获取奖惩类型成功!",standardService.getStandardType());
    }

    @WebLog(OperationModule = "人事管理",OperationTarget = "获取奖惩描述")
    @RequestMapping(value = "/getStandardDescribe",method = RequestMethod.GET)
    public CommonResult getStandardDescribe(){
        return CommonResult.SUCCESS("获取奖惩描述成功!",standardService.getStandardDescribe());
    }

    @WebLog(OperationModule = "人事管理",OperationTarget = "获取奖惩名")
    @RequestMapping(value = "/getStandardName",method = RequestMethod.GET)
    public CommonResult getStandardName(){
        return CommonResult.SUCCESS("获取奖惩描述成功!",standardService.getStandardName());
    }

    @WebLog(OperationModule = "人事管理",OperationTarget = "根据奖惩名获取奖惩")
    @RequestMapping(value = "/getStandardByStandardName/{name}",method = RequestMethod.GET)
    public CommonResult getStandardByStandardName(@PathVariable(name = "name") String name){
        return CommonResult.SUCCESS("获取奖惩描述成功!",standardService.getStandardByStandardName(name));
    }

    @WebLog(OperationModule = "人事管理",OperationTarget = "根据ID获取奖惩")
    @RequestMapping(value = "/getStandardByStandardId/{id}",method = RequestMethod.GET)
    public CommonResult getStandardByStandardId(@PathVariable(name = "id") String id){
        return CommonResult.SUCCESS("获取奖惩描述成功!",standardService.getStandardByStandardId(id));
    }
}
