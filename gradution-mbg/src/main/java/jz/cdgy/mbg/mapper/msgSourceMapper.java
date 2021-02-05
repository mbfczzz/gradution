package jz.cdgy.mbg.mapper;

import jz.cdgy.mbg.pojo.msgSource;
import jz.cdgy.mbg.pojo.msgSourceExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface msgSourceMapper {
    long countByExample(msgSourceExample example);

    int deleteByExample(msgSourceExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(msgSource record);

    int insertSelective(msgSource record);

    List<msgSource> selectByExample(msgSourceExample example);

    msgSource selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") msgSource record, @Param("example") msgSourceExample example);

    int updateByExample(@Param("record") msgSource record, @Param("example") msgSourceExample example);

    int updateByPrimaryKeySelective(msgSource record);

    int updateByPrimaryKey(msgSource record);
}