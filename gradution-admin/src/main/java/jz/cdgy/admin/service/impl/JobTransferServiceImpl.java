package jz.cdgy.admin.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import jz.cdgy.admin.service.JobTransferService;
import jz.cdgy.admin.util.AssertsUtil;
import jz.cdgy.mbg.mapper.EmpMapper;
import jz.cdgy.mbg.mapper.JobTransferMapper;
import jz.cdgy.mbg.pojo.Emp;
import jz.cdgy.mbg.pojo.JobTransfer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class JobTransferServiceImpl implements JobTransferService {
    @Autowired
    private JobTransferMapper jobTransferMapper;
    @Autowired
    private EmpMapper empMapper;
    @Override
    public PageInfo<JobTransfer> getAllJobTransfer(Integer page, Integer limit, JobTransfer jobTransfer) {
        PageHelper.startPage(page,limit);
        return new PageInfo<JobTransfer>(jobTransferMapper.getAllJobTransfer(jobTransfer));
    }

    @Override
    public void addJobTransfer(JobTransfer jobTransfer) {
        AssertsUtil.isTrue(jobTransferMapper.insertSelective(jobTransfer)!=1,"添加失败!");
    }

    @Override
    public void updateJobTransfer(JobTransfer jobTransfer) {
        AssertsUtil.isTrue(jobTransferMapper.updateByPrimaryKeySelective(jobTransfer)!=1,"更新失败!");
    }

    @Override
    @Transactional
    public void deleteJobTransfer(List<Integer> ids) {
        AssertsUtil.isTrue(jobTransferMapper.deleteBatchIds(ids)!=1,"删除失败!");
    }

}
