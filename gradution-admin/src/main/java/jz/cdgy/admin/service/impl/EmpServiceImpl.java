package jz.cdgy.admin.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import jz.cdgy.admin.service.EmpService;
import jz.cdgy.admin.util.AssertsUtil;
import jz.cdgy.mbg.mapper.EmpMapper;
import jz.cdgy.mbg.pojo.Emp;
import jz.cdgy.mbg.pojo.Transfer;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;
import java.util.Queue;

@Service
public class EmpServiceImpl extends ServiceImpl<EmpMapper, Emp> implements EmpService {

    @Autowired
    private EmpMapper empMapper;
    @Override
    public PageInfo<Emp> getAllEmp(Integer page, Integer limit, Emp emp) {
        QueryWrapper<Emp> queryWrapper = new QueryWrapper();
        if(StringUtils.isNotBlank(emp.getEmpName())){
            queryWrapper.like("emp_name",emp.getEmpName());
        }
        if(StringUtils.isNotBlank(emp.getEmpWx())){
            queryWrapper.like("emp_wx",emp.getEmpWx());
        }
        if(StringUtils.isNotBlank(emp.getEmpEmail())){
            queryWrapper.like("emp_email",emp.getEmpEmail());
        }
        if(StringUtils.isNotBlank(emp.getEmpAddress())){
            queryWrapper.like("emp_address",emp.getEmpAddress());
        }
        if(StringUtils.isNotBlank(emp.getEmpPhone())){
            queryWrapper.like("emp_phone",emp.getEmpPhone());
        }
        if(emp.getIsLeave()!=null){
            queryWrapper.eq("is_leave",emp.getIsLeave());
        }
        if(StringUtils.isNotBlank(emp.getCreateTimeStr())){
            queryWrapper.between("create_time",emp.getCreateTimeStr().split(",")[0],emp.getCreateTimeStr().split(",")[1]);
        }
        if(StringUtils.isNotBlank(emp.getUpdateTimeStr())){
            queryWrapper.between("update_time",emp.getUpdateTimeStr().split(",")[0],emp.getCreateTimeStr().split(",")[1]);
        }
        if(StringUtils.isNotBlank(emp.getLeaveTimeStr())){
            queryWrapper.between("leave_time",emp.getLeaveTimeStr().split(",")[0],emp.getCreateTimeStr().split(",")[1]);
        }
        PageHelper.startPage(page,limit);
        return new PageInfo<Emp>(empMapper.selectList(queryWrapper));
    }

    @Override
    public void addEmp(Emp emp) {
        AssertsUtil.isTrue(empMapper.insertSelective(emp)!=1,"添加失败!");
    }

    @Override
    public void updateEmp(Emp emp) {
        AssertsUtil.isTrue(empMapper.updateByPrimaryKeySelective(emp)!=1,"更新失败!");
    }

    @Override
    @Transactional
    public void deleteEmp(List<Integer> ids) {
    AssertsUtil.isTrue(empMapper.deleteBatchIds(ids)!=1,"删除失败!");
    }

    @Override
    public List<Map<String, Object>> getEmpByName(String name) {
        QueryWrapper<Emp> queryWrapper = new QueryWrapper();
        queryWrapper.select("id as value","emp_name as label");
        if(StringUtils.isNotBlank(name)){
            queryWrapper.like("emp_name",name);
        }
        return empMapper.selectMaps(queryWrapper);
    }

    @Override
    public Emp getOneEmpByName(String name) {
        QueryWrapper<Emp> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("emp_name",name);
        return empMapper.selectOne(queryWrapper);
    }

    @Override
    public Emp getOneEmpById(String id) {
        return empMapper.getOneEmpById(id);
    }
}
