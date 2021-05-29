package jz.cdgy.admin.controller;

import jz.cdgy.admin.service.ProblemService;
import jz.cdgy.admin.service.RecruitService;
import jz.cdgy.common.annotion.WebLog;
import jz.cdgy.common.api.CommonResult;
import jz.cdgy.mbg.pojo.Problem;
import jz.cdgy.mbg.pojo.Recruit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/problem")
public class ProblemController {
    @Autowired
    private ProblemService problemService;

    @WebLog(OperationModule = "系统管理",OperationTarget = "获取全部问题")
    @RequestMapping(value = "/getAllProblem",method = RequestMethod.POST)
    public CommonResult getAllProblem(@RequestParam(name = "page",defaultValue = "1")Integer page, @RequestParam(name = "limit",defaultValue = "10")Integer limit, Problem problem){
        return CommonResult.SUCCESS("获取招聘信息成功!",problemService.getAllProblem(page,limit,problem));
    }

    @WebLog(OperationModule = "系统管理",OperationTarget = "添加当前系统问题")
    @RequestMapping(value = "/addProblem",method = RequestMethod.POST)
    public CommonResult addProblem(@RequestBody Problem problem){
        problemService.addProblem(problem);
        return CommonResult.SUCCESS("添加招聘信息成功!");
    }

    @WebLog(OperationModule = "系统管理",OperationTarget = "修改系统管理")
    @RequestMapping(value = "/updateProblem",method = RequestMethod.PUT)
    public CommonResult updateProblem(@RequestBody Problem problem){
        problemService.updateProblem(problem);
        return CommonResult.SUCCESS("修改招聘信息成功!");
    }

    @WebLog(OperationModule = "系统管理",OperationTarget = "删除系统管理")
    @RequestMapping(value = "/deleteProblem/{id}",method = RequestMethod.DELETE)
    public CommonResult deleteProblem(@PathVariable(name = "id") List<Integer> id){
        problemService.deleteProblem(id);
        return CommonResult.SUCCESS("删除招聘信息成功!");
    }
}
