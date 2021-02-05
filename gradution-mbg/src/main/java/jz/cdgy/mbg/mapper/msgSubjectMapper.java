package jz.cdgy.mbg.mapper;

import jz.cdgy.mbg.pojo.msgSubject;
import jz.cdgy.mbg.pojo.msgSubjectExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface msgSubjectMapper {
    long countByExample(msgSubjectExample example);

    int deleteByExample(msgSubjectExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(msgSubject record);

    int insertSelective(msgSubject record);

    List<msgSubject> selectByExample(msgSubjectExample example);

    msgSubject selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") msgSubject record, @Param("example") msgSubjectExample example);

    int updateByExample(@Param("record") msgSubject record, @Param("example") msgSubjectExample example);

    int updateByPrimaryKeySelective(msgSubject record);

    int updateByPrimaryKey(msgSubject record);
}