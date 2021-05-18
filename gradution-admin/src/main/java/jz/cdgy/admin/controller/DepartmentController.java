package jz.cdgy.admin.controller;

import jz.cdgy.admin.service.DepartmentService;
import jz.cdgy.admin.service.PositionService;
import jz.cdgy.common.annotion.WebLog;
import jz.cdgy.common.api.CommonResult;
import jz.cdgy.mbg.pojo.Department;
import jz.cdgy.mbg.pojo.Position;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/department")
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;

    @WebLog(OperationModule = "人事管理",OperationTarget = "获取全部部门")
    @RequestMapping(value = "/getAllDepartment",method = RequestMethod.POST)
    public CommonResult getAllDepartment(@RequestParam(name = "page",defaultValue = "1")Integer page, @RequestParam(name = "limit",defaultValue = "10")Integer limit, Department department){
        return CommonResult.SUCCESS("获取部门信息成功!",departmentService.getAllDepartment(page,limit,department));
    }

    @WebLog(OperationModule = "人事管理",OperationTarget = "添加部门")
    @RequestMapping(value = "/addDepartment",method = RequestMethod.POST)
    public CommonResult addDepartment(@RequestBody Department department){
        departmentService.addDepartment(department);
        return CommonResult.SUCCESS("添加部门成功!");
    }

    @WebLog(OperationModule = "人事管理",OperationTarget = "修改部门")
    @RequestMapping(value = "/updateDepartment",method = RequestMethod.PUT)
    public CommonResult updateEmp(@RequestBody Department department){
        departmentService.updateDepartment(department);
        return CommonResult.SUCCESS("修改部门成功!");
    }

    @WebLog(OperationModule = "人事管理",OperationTarget = "删除部门")
    @RequestMapping(value = "/deleteDepartment/{id}",method = RequestMethod.DELETE)
    public CommonResult deleteEmp(@PathVariable(name = "id") List<Integer> id){
        departmentService.deleteDepartment(id);
        return CommonResult.SUCCESS("删除部门成功!");
    }

    @WebLog(OperationModule = "人事管理",OperationTarget = "获取部门名")
    @RequestMapping(value = "/getDepartmentName",method = RequestMethod.GET)
    public CommonResult getDepartmentName(){
        return CommonResult.SUCCESS("获取部门名成功!",departmentService.getDepartmentName());
    }
}
