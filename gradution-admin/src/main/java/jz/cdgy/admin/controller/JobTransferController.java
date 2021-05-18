package jz.cdgy.admin.controller;

import jz.cdgy.admin.service.JobTransferService;
import jz.cdgy.admin.service.TransferService;
import jz.cdgy.common.annotion.WebLog;
import jz.cdgy.common.api.CommonResult;
import jz.cdgy.mbg.pojo.JobTransfer;
import jz.cdgy.mbg.pojo.Transfer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/jobtransfer")
public class JobTransferController {
    @Autowired
    private JobTransferService jobTransferService;

    @WebLog(OperationModule = "工作调动管理",OperationTarget = "获取员工调动列表")
    @RequestMapping(value = "/getAllJobTransfer",method = RequestMethod.POST)
    public CommonResult getAllJobTransfer(@RequestParam(name = "page",defaultValue = "1")Integer page, @RequestParam(name = "limit",defaultValue = "10")Integer limit, JobTransfer jobTransfer){
        return CommonResult.SUCCESS("获取员工调动列表成功!",jobTransferService.getAllJobTransfer(page,limit,jobTransfer));
    }

    @WebLog(OperationModule = "工作调动管理",OperationTarget = "添加员工调动")
    @RequestMapping(value = "/addJobTransfer",method = RequestMethod.POST)
    public CommonResult addJobTransfer(@RequestBody JobTransfer jobTransfer){
        jobTransferService.addJobTransfer(jobTransfer);
        return CommonResult.SUCCESS("添加员工调动成功!");
    }

    @WebLog(OperationModule = "工作调动管理",OperationTarget = "修改员工调动")
    @RequestMapping(value = "/updateJobTransfer",method = RequestMethod.PUT)
    public CommonResult updateJobTransfer(@RequestBody JobTransfer jobTransfer){
        jobTransferService.updateJobTransfer(jobTransfer);
        return CommonResult.SUCCESS("修改员工调动列表成功!");
    }

    @WebLog(OperationModule = "工作调动管理",OperationTarget = "删除员工调动")
    @RequestMapping(value = "/deleteJobTransfer/{id}",method = RequestMethod.DELETE)
    public CommonResult deleteJobTransfer(@PathVariable(name = "id") List<Integer> id){
        jobTransferService.deleteJobTransfer(id);
        return CommonResult.SUCCESS("删除职位成功!");
    }
}
