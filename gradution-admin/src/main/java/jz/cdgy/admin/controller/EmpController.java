package jz.cdgy.admin.controller;

import jz.cdgy.admin.service.EmpService;
import jz.cdgy.common.annotion.WebLog;
import jz.cdgy.common.api.CommonResult;
import jz.cdgy.mbg.pojo.Emp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/emp")
public class EmpController {
    @Autowired
    private EmpService empService;

    @WebLog(OperationModule = "人事管理",OperationTarget = "获取全部员工")
    @RequestMapping(value = "/getAllEmp",method = RequestMethod.POST)
    public CommonResult getAllEmp(@RequestParam(name = "page",defaultValue = "1")Integer page, @RequestParam(name = "limit",defaultValue = "10")Integer limit, Emp emp){
        return CommonResult.SUCCESS("获取用户信息成功!",empService.getAllEmp(page,limit,emp));
    }

    @WebLog(OperationModule = "人事管理",OperationTarget = "录入员工")
    @RequestMapping(value = "/addEmp",method = RequestMethod.POST)
    public CommonResult addEmp(@RequestBody Emp emp){
        empService.addEmp(emp);
        return CommonResult.SUCCESS("录入成功!");
    }

    @WebLog(OperationModule = "人事管理",OperationTarget = "修改员工")
    @RequestMapping(value = "/updateEmp",method = RequestMethod.PUT)
    public CommonResult updateEmp(@RequestBody Emp emp){
        empService.updateEmp(emp);
        return CommonResult.SUCCESS("修改员工成功!");
    }

    @WebLog(OperationModule = "人事管理",OperationTarget = "删除员工")
    @RequestMapping(value = "/deleteEmp/{id}",method = RequestMethod.DELETE)
    public CommonResult deleteEmp(@PathVariable(name = "id") List<Integer> id){
        empService.deleteEmp(id);
        return CommonResult.SUCCESS("删除员工成功!");
    }

    @WebLog(OperationModule = "人事管理",OperationTarget = "获取map结构员工名")
    @RequestMapping(value = "/getEmpByName/{name}",method = RequestMethod.GET)
    public CommonResult getEmpByName(@PathVariable(name = "name") String name){
        return CommonResult.SUCCESS("获取map结构员工名",empService.getEmpByName(name));
    }

    @WebLog(OperationModule = "人事管理",OperationTarget = "根据员工名获取员工")
    @RequestMapping(value = "/getOneEmpByName/{name}",method = RequestMethod.GET)
    public CommonResult getOneEmpByName(@PathVariable(name = "name") String name){
        return CommonResult.SUCCESS("获取map结构员工名",empService.getOneEmpByName(name));
    }

    @WebLog(OperationModule = "人事管理",OperationTarget = "根据ID获取员工")
    @RequestMapping(value = "/getOneEmpById/{id}",method = RequestMethod.GET)
    public CommonResult getOneEmpById(@PathVariable(name = "id") String id){
        return CommonResult.SUCCESS("获取map结构员工名",empService.getOneEmpById(id));
    }
}
