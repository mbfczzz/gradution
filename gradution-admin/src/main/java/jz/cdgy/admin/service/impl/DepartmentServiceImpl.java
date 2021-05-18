package jz.cdgy.admin.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import jz.cdgy.admin.service.DepartmentService;
import jz.cdgy.admin.util.AssertsUtil;
import jz.cdgy.mbg.mapper.DepartmentMapper;
import jz.cdgy.mbg.pojo.Department;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

@Service
public class DepartmentServiceImpl implements DepartmentService {
    @Autowired
    private DepartmentMapper departmentMapper;
    @Override
    public PageInfo<Department> getAllDepartment(Integer page, Integer limit,Department department) {
        QueryWrapper<Department> queryWrapper = new QueryWrapper();
        if(StringUtils.isNotBlank(department.getDepartmentName())){
            queryWrapper.in("id", Arrays.asList(department.getDepartmentName().split(",")));
        }
        if(StringUtils.isNotBlank(department.getDepartmentMark())){
            queryWrapper.like("department_mark",department.getDepartmentMark());
        }
        if(department.getIsValid()!=null){
            queryWrapper.eq("is_valid",department.getIsValid());
        }
        if(StringUtils.isNotBlank(department.getCreateTimeStr())){
            queryWrapper.between("create_time",department.getCreateTimeStr().split(",")[0],department.getCreateTimeStr().split(",")[1]);
        }
        PageHelper.startPage(page,limit);
        return new PageInfo<Department>(departmentMapper.selectList(queryWrapper));
    }

    @Override
    public void addDepartment(Department department) {
        AssertsUtil.isTrue(departmentMapper.insertSelective(department)!=1,"添加失败!");
    }

    @Override
    public void updateDepartment(Department department) {
        AssertsUtil.isTrue(departmentMapper.updateByPrimaryKeySelective(department)!=1,"更新失败!");
    }

    @Override
    @Transactional
    public void deleteDepartment(List<Integer> ids) {
        AssertsUtil.isTrue(departmentMapper.deleteBatchIds(ids)!=1,"删除失败!");
    }

    @Override
    public List<Map<String, Object>> getDepartmentName() {
        QueryWrapper<Department> queryWrapper = new QueryWrapper<>();
        queryWrapper.select("id as value","department_name as label");
        return departmentMapper.selectMaps(queryWrapper);
    }
}
