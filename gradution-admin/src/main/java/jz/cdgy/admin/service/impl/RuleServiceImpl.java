package jz.cdgy.admin.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import jz.cdgy.admin.service.RuleService;
import jz.cdgy.mbg.mapper.RuleMapper;
import jz.cdgy.mbg.pojo.Rule;
import jz.cdgy.mbg.pojo.Spend;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class RuleServiceImpl implements RuleService {
    @Autowired
    private RuleMapper ruleMapper;

    @Override
    public List<Map<String, Object>> getRulesMapName() {
        QueryWrapper<Rule> queryWrapper = new QueryWrapper();
        queryWrapper.select("id as 'key'","rule_name as 'label'","if(is_valid=1,0,0) as 'disabled'");
        return ruleMapper.selectMaps(queryWrapper);
    }
}
