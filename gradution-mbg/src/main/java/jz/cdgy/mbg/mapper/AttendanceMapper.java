package jz.cdgy.mbg.mapper;

import java.util.List;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import jz.cdgy.mbg.pojo.Agency;
import jz.cdgy.mbg.pojo.Attendance;
import jz.cdgy.mbg.pojo.AttendanceExample;
import jz.cdgy.mbg.pojo.Rule;
import org.apache.ibatis.annotations.Param;

public interface AttendanceMapper extends BaseMapper<Attendance> {
    long countByExample(AttendanceExample example);

    int deleteByExample(AttendanceExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Attendance record);

    int insertSelective(Attendance record);

    List<Attendance> selectByExample(AttendanceExample example);

    Attendance selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Attendance record, @Param("example") AttendanceExample example);

    int updateByExample(@Param("record") Attendance record, @Param("example") AttendanceExample example);

    int updateByPrimaryKeySelective(Attendance record);

    int updateByPrimaryKey(Attendance record);

    List<Attendance> getAllAttendance(Attendance attendance);

    List<Agency> getAgencyByid(Integer id);
}