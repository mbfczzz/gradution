package jz.cdgy.mbg.mapper;

import java.util.List;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import jz.cdgy.mbg.pojo.SpendWay;
import jz.cdgy.mbg.pojo.SpendWayExample;
import org.apache.ibatis.annotations.Param;

public interface SpendWayMapper extends BaseMapper<SpendWay> {
    long countByExample(SpendWayExample example);

    int deleteByExample(SpendWayExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SpendWay record);

    int insertSelective(SpendWay record);

    List<SpendWay> selectByExample(SpendWayExample example);

    SpendWay selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SpendWay record, @Param("example") SpendWayExample example);

    int updateByExample(@Param("record") SpendWay record, @Param("example") SpendWayExample example);

    int updateByPrimaryKeySelective(SpendWay record);

    int updateByPrimaryKey(SpendWay record);
}