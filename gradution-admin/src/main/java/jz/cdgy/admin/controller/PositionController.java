package jz.cdgy.admin.controller;

import jz.cdgy.admin.service.EmpService;
import jz.cdgy.admin.service.PositionService;
import jz.cdgy.common.annotion.WebLog;
import jz.cdgy.common.api.CommonResult;
import jz.cdgy.mbg.pojo.Emp;
import jz.cdgy.mbg.pojo.Position;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/position")
public class PositionController {
    @Autowired
    private PositionService positionService;

    @WebLog(OperationModule = "人事管理",OperationTarget = "获取全部职位")
    @RequestMapping(value = "/getAllPosition",method = RequestMethod.POST)
    public CommonResult getAllPosition(@RequestParam(name = "page",defaultValue = "1")Integer page, @RequestParam(name = "limit",defaultValue = "10")Integer limit, Position position){
        return CommonResult.SUCCESS("获取用户信息成功!",positionService.getAllPosition(page,limit,position));
    }

    @WebLog(OperationModule = "人事管理",OperationTarget = "添加职位")
    @RequestMapping(value = "/addPosition",method = RequestMethod.POST)
    public CommonResult addPosition(@RequestBody Position position){
        positionService.addPosition(position);
        return CommonResult.SUCCESS("添加职位成功!");
    }

    @WebLog(OperationModule = "人事管理",OperationTarget = "修改职位")
    @RequestMapping(value = "/updatePosition",method = RequestMethod.PUT)
    public CommonResult updatePosition(@RequestBody Position position){
        positionService.updatePosition(position);
        return CommonResult.SUCCESS("修改职位成功!");
    }

    @WebLog(OperationModule = "人事管理",OperationTarget = "删除职位")
    @RequestMapping(value = "/deletePosition/{id}",method = RequestMethod.DELETE)
    public CommonResult deletePosition(@PathVariable(name = "id") List<Integer> id){
        positionService.deletePosition(id);
        return CommonResult.SUCCESS("删除职位成功!");
    }

    @WebLog(OperationModule = "人事管理",OperationTarget = "获取职位名")
    @RequestMapping(value = "/getPositionName",method = RequestMethod.GET)
    public CommonResult getPositionName(){
        return CommonResult.SUCCESS("获取部门名成功!",positionService.getPositionName());
    }
}
