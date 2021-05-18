package jz.cdgy.admin.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import jz.cdgy.admin.service.AssigmentService;
import jz.cdgy.admin.util.AssertsUtil;
import jz.cdgy.mbg.mapper.AssigmentMapper;
import jz.cdgy.mbg.pojo.Assigment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class AssigmentServiceImpl implements AssigmentService {
    @Autowired
    private AssigmentMapper assigmentMapper;

    @Override
    public PageInfo<Assigment> getAllAssigment(Integer page, Integer limit, Assigment Assigment) {
        PageHelper.startPage(page, limit);
        return new PageInfo<Assigment>(assigmentMapper.getAllAssigment(Assigment));
    }

    @Override
    public void addAssigment(Assigment assigment) {
        AssertsUtil.isTrue(assigmentMapper.insertSelective(assigment) != 1, "添加失败!");
    }

    @Override
    public void updateAssigment(Assigment assigment) {
        AssertsUtil.isTrue(assigmentMapper.updateByPrimaryKeySelective(assigment) != 1, "更新失败!");
    }

    @Override
    @Transactional
    public void deleteAssigment(List<Integer> ids) {
        AssertsUtil.isTrue(assigmentMapper.deleteBatchIds(ids) != 1, "删除失败!");
    }
}
