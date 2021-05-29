package jz.cdgy.admin.service;

import com.github.pagehelper.PageInfo;
import jz.cdgy.mbg.pojo.Account;
import jz.cdgy.mbg.pojo.Attendance;

import java.util.List;

public interface AttendanceService {
    PageInfo<Attendance> getAllAttendance(Integer page, Integer limit, Attendance attendance);

    void addAttendance(Attendance attendance);

    void updateAttendance(Attendance attendance);

    void deleteAttendance(List<Integer> ids);
}
