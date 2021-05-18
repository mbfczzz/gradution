package jz.cdgy.admin.controller;

import jz.cdgy.admin.service.TransferService;
import jz.cdgy.common.annotion.WebLog;
import jz.cdgy.common.api.CommonResult;
import jz.cdgy.mbg.pojo.Transfer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/transfer")
public class TransferController {
    @Autowired
    private TransferService transferService;

    @WebLog(OperationModule = "人事管理",OperationTarget = "获取全部员工调动列表")
    @RequestMapping(value = "/getAllTransfer",method = RequestMethod.POST)
    public CommonResult getAllTransfer(@RequestParam(name = "page",defaultValue = "1")Integer page, @RequestParam(name = "limit",defaultValue = "10")Integer limit, Transfer transfer){
        return CommonResult.SUCCESS("获取员工调动列表成功!",transferService.getAllTransfer(page,limit,transfer));
    }

    @WebLog(OperationModule = "人事管理",OperationTarget = "添加员工调动")
    @RequestMapping(value = "/addTransfer",method = RequestMethod.POST)
    public CommonResult addTransfer(@RequestBody Transfer transfer){
        transferService.addTransfer(transfer);
        return CommonResult.SUCCESS("添加员工调动成功!");
    }

    @WebLog(OperationModule = "人事管理",OperationTarget = "修改员工调动")
    @RequestMapping(value = "/updateTransfer",method = RequestMethod.PUT)
    public CommonResult updateTransfer(@RequestBody Transfer transfer){
        transferService.updateTransfer(transfer);
        return CommonResult.SUCCESS("修改员工调动列表成功!");
    }

    @WebLog(OperationModule = "人事管理",OperationTarget = "删除员工调动")
    @RequestMapping(value = "/deleteTransfer/{id}",method = RequestMethod.DELETE)
    public CommonResult deleteTransfer(@PathVariable(name = "id") List<Integer> id){
        transferService.deleteTransfer(id);
        return CommonResult.SUCCESS("删除职位成功!");
    }
}
