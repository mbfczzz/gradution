package jz.cdgy.mbg.mapper;

import jz.cdgy.mbg.pojo.Msg;
import jz.cdgy.mbg.pojo.MsgExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MsgMapper {
    long countByExample(MsgExample example);

    int deleteByExample(MsgExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Msg record);

    int insertSelective(Msg record);

    List<Msg> selectByExample(MsgExample example);

    Msg selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Msg record, @Param("example") MsgExample example);

    int updateByExample(@Param("record") Msg record, @Param("example") MsgExample example);

    int updateByPrimaryKeySelective(Msg record);

    int updateByPrimaryKey(Msg record);
}