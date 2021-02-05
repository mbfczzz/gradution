package jz.cdgy.mbg.mapper;

import java.util.List;
import jz.cdgy.mbg.pojo.MsgWay;
import jz.cdgy.mbg.pojo.MsgWayExample;
import org.apache.ibatis.annotations.Param;

public interface MsgWayMapper {
    long countByExample(MsgWayExample example);

    int deleteByExample(MsgWayExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MsgWay record);

    int insertSelective(MsgWay record);

    List<MsgWay> selectByExample(MsgWayExample example);

    MsgWay selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MsgWay record, @Param("example") MsgWayExample example);

    int updateByExample(@Param("record") MsgWay record, @Param("example") MsgWayExample example);

    int updateByPrimaryKeySelective(MsgWay record);

    int updateByPrimaryKey(MsgWay record);
}