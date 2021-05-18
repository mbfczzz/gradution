package jz.cdgy.admin.controller;

import jz.cdgy.admin.service.RewardsService;
import jz.cdgy.common.annotion.WebLog;
import jz.cdgy.common.api.CommonResult;
import jz.cdgy.mbg.pojo.Rewards;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rewards")
public class RewardsController {
    @Autowired
    private RewardsService rewardsService;

    @WebLog(OperationModule = "人事管理",OperationTarget = "获取奖惩列表")
    @RequestMapping(value = "/getAllRewards",method = RequestMethod.POST)
    public CommonResult getAllRewards(@RequestParam(name = "page",defaultValue = "1")Integer page, @RequestParam(name = "limit",defaultValue = "10")Integer limit, Rewards rewards){
        return CommonResult.SUCCESS("获取用户信息成功!",rewardsService.getAllRewards(page,limit,rewards));
    }

    @WebLog(OperationModule = "人事管理",OperationTarget = "添加奖惩列表")
    @RequestMapping(value = "/addRewards",method = RequestMethod.POST)
    public CommonResult addRewards(@RequestBody Rewards rewards){
        rewardsService.addRewards(rewards);
        return CommonResult.SUCCESS("添加职位成功!");
    }

    @WebLog(OperationModule = "人事管理",OperationTarget = "修改奖惩列表")
    @RequestMapping(value = "/updateRewards",method = RequestMethod.PUT)
    public CommonResult updateRewards(@RequestBody Rewards rewards){
        rewardsService.updateRewards(rewards);
        return CommonResult.SUCCESS("修改职位成功!");
    }

    @WebLog(OperationModule = "人事管理",OperationTarget = "删除奖惩列表")
    @RequestMapping(value = "/deleteRewards/{id}",method = RequestMethod.DELETE)
    public CommonResult deleteRewards(@PathVariable(name = "id") List<Integer> id){
        rewardsService.deleteRewards(id);
        return CommonResult.SUCCESS("删除职位成功!");
    }
}
