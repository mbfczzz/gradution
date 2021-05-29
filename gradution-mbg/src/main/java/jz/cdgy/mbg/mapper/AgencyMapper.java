package jz.cdgy.mbg.mapper;

import java.util.List;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import jz.cdgy.mbg.pojo.Agency;
import jz.cdgy.mbg.pojo.AgencyExample;
import org.apache.ibatis.annotations.Param;

public interface AgencyMapper extends BaseMapper<Agency> {
    long countByExample(AgencyExample example);

    int deleteByExample(AgencyExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Agency record);

    int insertSelective(Agency record);

    List<Agency> selectByExample(AgencyExample example);

    Agency selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Agency record, @Param("example") AgencyExample example);

    int updateByExample(@Param("record") Agency record, @Param("example") AgencyExample example);

    int updateByPrimaryKeySelective(Agency record);

    int updateByPrimaryKey(Agency record);
}