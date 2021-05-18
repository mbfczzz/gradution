package jz.cdgy.admin.controller;

import jz.cdgy.admin.service.RuleService;
import jz.cdgy.common.annotion.WebLog;
import jz.cdgy.common.api.CommonResult;
import jz.cdgy.mbg.pojo.Rule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rule")
public class RuleController {

    @Autowired
    private RuleService ruleService;

    @WebLog(OperationModule = "招聘管理",OperationTarget = "获取map要求名")
    @RequestMapping(value = "/getRulesMapName",method = RequestMethod.GET)
    public CommonResult getRulesMapName(){
        return CommonResult.SUCCESS("获取用户信息成功!",ruleService.getRulesMapName());
    }
}
