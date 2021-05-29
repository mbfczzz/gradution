package jz.cdgy.admin.controller;

import jz.cdgy.admin.service.AccountService;
import jz.cdgy.admin.service.AttendanceService;
import jz.cdgy.common.annotion.WebLog;
import jz.cdgy.common.api.CommonResult;
import jz.cdgy.mbg.pojo.Account;
import jz.cdgy.mbg.pojo.Attendance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/attendance")
public class AttendanceController {
    @Autowired
    private AttendanceService attendanceService;

    @WebLog(OperationModule = "考勤管理",OperationTarget = "获取全部考勤信息")
    @RequestMapping(value = "/getAllAttendance",method = RequestMethod.POST)
    public CommonResult getAllAttendance(@RequestParam(name = "page",defaultValue = "1")Integer page, @RequestParam(name = "limit",defaultValue = "10")Integer limit, Attendance attendance){
        return CommonResult.SUCCESS("获取用户信息成功!",attendanceService.getAllAttendance(page,limit,attendance));
    }

    @WebLog(OperationModule = "考勤管理",OperationTarget = "添加考勤信息")
    @RequestMapping(value = "/addAttendance",method = RequestMethod.POST)
    public CommonResult addAttendance(@RequestBody Attendance attendance){
        attendanceService.addAttendance(attendance);
        return CommonResult.SUCCESS("录入成功!");
    }

    @WebLog(OperationModule = "考勤管理",OperationTarget = "更新考勤信息")
    @RequestMapping(value = "/updateAttendance",method = RequestMethod.PUT)
    public CommonResult updateAttendance(@RequestBody Attendance attendance){
        attendanceService.updateAttendance(attendance);
        return CommonResult.SUCCESS("修改员工成功!");
    }

    @WebLog(OperationModule = "考勤管理",OperationTarget = "删除考勤信息")
    @RequestMapping(value = "/deleteAttendance/{id}",method = RequestMethod.DELETE)
    public CommonResult deleteAttendance(@PathVariable(name = "id") List<Integer> id){
        attendanceService.deleteAttendance(id);
        return CommonResult.SUCCESS("删除员工成功!");
    }
}
