package jz.cdgy.admin.controller;

import jz.cdgy.admin.service.RecruitService;
import jz.cdgy.common.annotion.WebLog;
import jz.cdgy.common.api.CommonResult;
import jz.cdgy.mbg.pojo.Recruit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/recruit")
public class RecruitController {
    @Autowired
    private RecruitService recruitService;

    @WebLog(OperationModule = "招聘管理",OperationTarget = "获取全部招聘")
    @RequestMapping(value = "/getAllRecruit",method = RequestMethod.POST)
    public CommonResult getAllRecruit(@RequestParam(name = "page",defaultValue = "1")Integer page, @RequestParam(name = "limit",defaultValue = "10")Integer limit, Recruit recruit){
        return CommonResult.SUCCESS("获取招聘信息成功!",recruitService.getAllRecruit(page,limit,recruit));
    }

    @WebLog(OperationModule = "招聘管理",OperationTarget = "添加招聘")
    @RequestMapping(value = "/addRecruit",method = RequestMethod.POST)
    public CommonResult addRecruit(@RequestBody Recruit recruit){
        recruitService.addRecruit(recruit);
        return CommonResult.SUCCESS("添加招聘信息成功!");
    }

    @WebLog(OperationModule = "招聘管理",OperationTarget = "修改招聘")
    @RequestMapping(value = "/updateRecruit",method = RequestMethod.PUT)
    public CommonResult updateRecruit(@RequestBody Recruit recruit){
        recruitService.updateRecruit(recruit);
        return CommonResult.SUCCESS("修改招聘信息成功!");
    }

    @WebLog(OperationModule = "招聘管理",OperationTarget = "删除招聘")
    @RequestMapping(value = "/deleteRecruit/{id}",method = RequestMethod.DELETE)
    public CommonResult deleteRecruit(@PathVariable(name = "id") List<Integer> id){
        recruitService.deleteRecruit(id);
        return CommonResult.SUCCESS("删除招聘信息成功!");
    }
}
