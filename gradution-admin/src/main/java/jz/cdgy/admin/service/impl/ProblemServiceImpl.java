package jz.cdgy.admin.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import jz.cdgy.admin.service.ProblemService;
import jz.cdgy.admin.util.AssertsUtil;
import jz.cdgy.mbg.mapper.ProblemMapper;
import jz.cdgy.mbg.mapper.RecruitMapper;
import jz.cdgy.mbg.mapper.RecruitRuleMapper;
import jz.cdgy.mbg.pojo.Problem;
import jz.cdgy.mbg.pojo.Recruit;
import jz.cdgy.mbg.pojo.RecruitRule;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ProblemServiceImpl implements ProblemService {
    @Autowired
    private ProblemMapper problemMapper;

    @Override
    public PageInfo<Problem> getAllProblem(Integer page, Integer limit, Problem problem) {
        PageHelper.startPage(page,limit);
        return new PageInfo<Problem>(problemMapper.selectList(new QueryWrapper<Problem>()));
    }

    @Override
    public void addProblem(Problem problem) {
        AssertsUtil.isTrue(problemMapper.insertSelective(problem)!=1,"添加失败!");
    }

    @Override
    public void updateProblem(Problem problem) {
        AssertsUtil.isTrue(problemMapper.updateByPrimaryKeySelective(problem)!=1,"更新失败!");
    }

    @Override
    @Transactional
    public void deleteProblem(List<Integer> ids) {
        AssertsUtil.isTrue(problemMapper.deleteBatchIds(ids)!=1,"删除失败!");
    }
}
