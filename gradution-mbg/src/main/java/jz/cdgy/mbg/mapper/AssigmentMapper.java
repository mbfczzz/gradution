package jz.cdgy.mbg.mapper;

import java.util.List;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import jz.cdgy.mbg.pojo.Assigment;
import jz.cdgy.mbg.pojo.AssigmentExample;
import org.apache.ibatis.annotations.Param;

public interface AssigmentMapper extends BaseMapper<Assigment> {
    long countByExample(AssigmentExample example);

    int deleteByExample(AssigmentExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Assigment record);

    int insertSelective(Assigment record);

    List<Assigment> selectByExample(AssigmentExample example);

    Assigment selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Assigment record, @Param("example") AssigmentExample example);

    int updateByExample(@Param("record") Assigment record, @Param("example") AssigmentExample example);

    int updateByPrimaryKeySelective(Assigment record);

    int updateByPrimaryKey(Assigment record);

    List<Assigment> getAllAssigment(Assigment assigment);
}