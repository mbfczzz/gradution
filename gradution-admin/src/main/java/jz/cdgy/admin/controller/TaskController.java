package jz.cdgy.admin.controller;

import jz.cdgy.admin.service.TaskService;
import jz.cdgy.common.annotion.WebLog;
import jz.cdgy.common.api.CommonResult;
import jz.cdgy.mbg.pojo.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/task")
public class TaskController {
    @Autowired
    private TaskService taskService;

    @WebLog(OperationModule = "工作管理",OperationTarget = "获取全部任务")
    @RequestMapping(value = "/getAllTask",method = RequestMethod.POST)
    public CommonResult getAllTask(@RequestParam(name = "page",defaultValue = "1")Integer page, @RequestParam(name = "limit",defaultValue = "10")Integer limit, Task task){
        return CommonResult.SUCCESS("获取部门信息成功!",taskService.getAllTask(page,limit,task));
    }

    @WebLog(OperationModule = "工作管理",OperationTarget = "添加任务")
    @RequestMapping(value = "/addTask",method = RequestMethod.POST)
    public CommonResult addDepartment(@RequestBody Task task){
        taskService.addTask(task);
        return CommonResult.SUCCESS("添加部门成功!");
    }

    @WebLog(OperationModule = "工作管理",OperationTarget = "修改任务")
    @RequestMapping(value = "/updateTask",method = RequestMethod.PUT)
    public CommonResult updateTask(@RequestBody Task task){
        taskService.updateTask(task);
        return CommonResult.SUCCESS("修改部门成功!");
    }

    @WebLog(OperationModule = "工作管理",OperationTarget = "删除任务")
    @RequestMapping(value = "/deleteTask/{id}",method = RequestMethod.DELETE)
    public CommonResult deleteTask(@PathVariable(name = "id") List<Integer> id){
        taskService.deleteTask(id);
        return CommonResult.SUCCESS("删除部门成功!");
    }

    @WebLog(OperationModule = "工作管理",OperationTarget = "获取Map结构task名")
    @RequestMapping(value = "/getTaskMap",method = RequestMethod.GET)
    public CommonResult getTaskMap(){
        return CommonResult.SUCCESS("删除部门成功!",taskService.getTaskMap());
    }
}
