package jz.cdgy.admin.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import jz.cdgy.admin.service.TransferService;
import jz.cdgy.admin.util.AssertsUtil;
import jz.cdgy.mbg.mapper.EmpMapper;
import jz.cdgy.mbg.mapper.TransferMapper;
import jz.cdgy.mbg.pojo.Emp;
import jz.cdgy.mbg.pojo.Transfer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@Service
public class TransferServiceImpl implements TransferService {
    @Autowired
    private TransferMapper transferMapper;
    @Autowired
    private EmpMapper empMapper;
    @Override
    public PageInfo<Transfer> getAllTransfer(Integer page, Integer limit, Transfer transfer) {
        PageHelper.startPage(page,limit);
        return new PageInfo<Transfer>(transferMapper.getAllTransfer(transfer));
    }

    @Override
    public void addTransfer(Transfer transfer) {
        AssertsUtil.isTrue(transferMapper.insertSelective(transfer)!=1,"添加失败!");
    }

    @Override
    public void updateTransfer(Transfer transfer) {
        QueryWrapper<Emp> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("emp_name",transfer.getEmpName());
        Emp emp = empMapper.selectOne(queryWrapper);
        AssertsUtil.isTrue(emp==null,"该员工不存在");
        transfer.setEmpId(emp.getId());
        AssertsUtil.isTrue(transferMapper.updateByPrimaryKeySelective(transfer)!=1,"更新失败!");
    }

    @Override
    @Transactional
    public void deleteTransfer(List<Integer> ids) {
        AssertsUtil.isTrue(transferMapper.deleteBatchIds(ids)!=1,"删除失败!");
    }

    @Override
    public List<Map<String, Object>> getTransfer(String type) {
        QueryWrapper<Transfer> queryWrapper = new QueryWrapper();
        queryWrapper.select("id as value","position_name as label");
        queryWrapper.eq("type",type);
        return transferMapper.selectMaps(queryWrapper);
    }
}
