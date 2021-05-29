package jz.cdgy.mbg.mapper;

import java.util.List;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import jz.cdgy.mbg.pojo.EmpAgency;
import jz.cdgy.mbg.pojo.EmpAgencyExample;
import org.apache.ibatis.annotations.Param;

public interface EmpAgencyMapper extends BaseMapper<EmpAgency> {
    long countByExample(EmpAgencyExample example);

    int deleteByExample(EmpAgencyExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(EmpAgency record);

    int insertSelective(EmpAgency record);

    List<EmpAgency> selectByExample(EmpAgencyExample example);

    EmpAgency selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") EmpAgency record, @Param("example") EmpAgencyExample example);

    int updateByExample(@Param("record") EmpAgency record, @Param("example") EmpAgencyExample example);

    int updateByPrimaryKeySelective(EmpAgency record);

    int updateByPrimaryKey(EmpAgency record);

    int insertAgency(Integer cardPeople, String agencyStr);
}