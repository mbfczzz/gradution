package jz.cdgy.admin.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import jz.cdgy.admin.service.RecruitService;
import jz.cdgy.admin.util.AssertsUtil;
import jz.cdgy.mbg.mapper.RecruitMapper;
import jz.cdgy.mbg.mapper.RecruitRuleMapper;
import jz.cdgy.mbg.pojo.Recruit;
import jz.cdgy.mbg.pojo.RecruitRule;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class RecruitServiceImpl implements RecruitService {
    @Autowired
    private RecruitMapper recruitMapper;

    @Autowired
    private RecruitRuleMapper recruitRuleMapper;

    @Override
    public PageInfo<Recruit> getAllRecruit(Integer page, Integer limit, Recruit recruit) {
        PageHelper.startPage(page,limit);
        return new PageInfo<Recruit>(recruitMapper.getAllRecruit(recruit));
    }

    @Override
    @Transactional
    public void addRecruit(Recruit recruit) {
       int flag =  recruitMapper.insertSelective(recruit);
        recruitRuleMapper.insertRecruit(recruit.getId(),recruit.getRuleStr());
        AssertsUtil.isTrue(flag!=1,"添加失败!");
    }

    @Override
    @Transactional
    public void updateRecruit(Recruit recruit) {
        if(StringUtils.isNoneBlank(recruit.getRuleStr())){
            LambdaQueryWrapper<RecruitRule> lambdaQueryWrapper = Wrappers.lambdaQuery();
            lambdaQueryWrapper.eq(RecruitRule::getRecruitId,recruit.getId());
            recruitRuleMapper.delete(lambdaQueryWrapper);
            recruitRuleMapper.insertRecruit(recruit.getId(),recruit.getRuleStr());
        }
        AssertsUtil.isTrue(recruitMapper.updateByPrimaryKeySelective(recruit)!=1,"更新失败!");
    }

    @Override
    @Transactional
    public void deleteRecruit(List<Integer> ids) {
        AssertsUtil.isTrue(recruitMapper.deleteBatchIds(ids)!=1,"删除失败!");
    }
}
