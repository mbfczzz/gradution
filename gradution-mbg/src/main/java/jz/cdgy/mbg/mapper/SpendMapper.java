package jz.cdgy.mbg.mapper;

import java.util.List;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import jz.cdgy.mbg.pojo.Position;
import jz.cdgy.mbg.pojo.Spend;
import jz.cdgy.mbg.pojo.SpendExample;
import org.apache.ibatis.annotations.Param;

public interface SpendMapper extends BaseMapper<Spend> {
    long countByExample(SpendExample example);

    int deleteByExample(SpendExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Spend record);

    int insertSelective(Spend record);

    List<Spend> selectByExample(SpendExample example);

    Spend selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Spend record, @Param("example") SpendExample example);

    int updateByExample(@Param("record") Spend record, @Param("example") SpendExample example);

    int updateByPrimaryKeySelective(Spend record);

    int updateByPrimaryKey(Spend record);

    List<Spend> getAllSpend(Spend spend);
}