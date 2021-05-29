package jz.cdgy.admin.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import jz.cdgy.admin.service.AttendanceService;
import jz.cdgy.admin.util.AssertsUtil;
import jz.cdgy.mbg.mapper.AttendanceMapper;
import jz.cdgy.mbg.mapper.EmpAgencyMapper;
import jz.cdgy.mbg.pojo.Account;
import jz.cdgy.mbg.pojo.Attendance;
import jz.cdgy.mbg.pojo.EmpAgency;
import jz.cdgy.mbg.pojo.RecruitRule;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class AttendanceServiceImpl  implements AttendanceService {
    @Autowired
    private AttendanceMapper attendanceMapper;
    @Autowired
    private EmpAgencyMapper empAgencyMapper;

    @Override
    public PageInfo<Attendance> getAllAttendance(Integer page, Integer limit, Attendance attendance) {
        PageHelper.startPage(page, limit);
        return new PageInfo<Attendance>(attendanceMapper.getAllAttendance(attendance));
    }

    @Override
    @Transactional
    public void addAttendance(Attendance attendance) {
        AssertsUtil.isTrue(attendanceMapper.insertSelective(attendance)!=1,"添加失败!");
        empAgencyMapper.insertAgency(attendance.getCardPeople(),attendance.getAgencyStr());
    }

    @Override
    public void updateAttendance(Attendance attendance) {
        if(StringUtils.isNoneBlank(attendance.getAgencyStr())){
            LambdaQueryWrapper<EmpAgency> lambdaQueryWrapper = Wrappers.lambdaQuery();
            lambdaQueryWrapper.eq(EmpAgency::getEmpId,attendance.getCardPeople());
            empAgencyMapper.delete(lambdaQueryWrapper);
            empAgencyMapper.insertAgency(attendance.getCardPeople(), attendance.getAgencyStr());
        }
        AssertsUtil.isTrue(attendanceMapper.updateByPrimaryKeySelective(attendance)!=1,"更新失败!");
    }

    @Override
    public void deleteAttendance(List<Integer> ids) {
        AssertsUtil.isTrue(attendanceMapper.deleteBatchIds(ids) != 1, "删除失败!");
    }
}
