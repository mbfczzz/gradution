package jz.cdgy.admin.controller;

import jz.cdgy.admin.service.AssigmentService;
import jz.cdgy.admin.service.DepartmentService;
import jz.cdgy.common.annotion.WebLog;
import jz.cdgy.common.api.CommonResult;
import jz.cdgy.mbg.pojo.Assigment;
import jz.cdgy.mbg.pojo.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/assigment")
public class AssigmentController {
    @Autowired
    private AssigmentService assigmentService;

    @WebLog(OperationModule = "工作管理",OperationTarget = "获取全部任务分配")
    @RequestMapping(value = "/getAllAssigment",method = RequestMethod.POST)
    public CommonResult getAllAssigment(@RequestParam(name = "page",defaultValue = "1")Integer page, @RequestParam(name = "limit",defaultValue = "10")Integer limit, Assigment assigment){
        return CommonResult.SUCCESS("获取部门信息成功!",assigmentService.getAllAssigment(page,limit,assigment));
    }

    @WebLog(OperationModule = "工作管理",OperationTarget = "添加任务分配")
    @RequestMapping(value = "/addAssigment",method = RequestMethod.POST)
    public CommonResult addDepartment(@RequestBody Assigment assigment){
        assigmentService.addAssigment(assigment);
        return CommonResult.SUCCESS("添加部门成功!");
    }

    @WebLog(OperationModule = "工作管理",OperationTarget = "修改任务分配")
    @RequestMapping(value = "/updateAssigment",method = RequestMethod.PUT)
    public CommonResult updateEmp(@RequestBody Assigment assigment){
        assigmentService.updateAssigment(assigment);
        return CommonResult.SUCCESS("修改部门成功!");
    }

    @WebLog(OperationModule = "工作管理",OperationTarget = "删除任务分配")
    @RequestMapping(value = "/deleteAssigment/{id}",method = RequestMethod.DELETE)
    public CommonResult deleteEmp(@PathVariable(name = "id") List<Integer> id){
        assigmentService.deleteAssigment(id);
        return CommonResult.SUCCESS("删除部门成功!");
    }
}
