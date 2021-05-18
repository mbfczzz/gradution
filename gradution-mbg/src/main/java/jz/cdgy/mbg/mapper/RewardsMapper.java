package jz.cdgy.mbg.mapper;

import java.util.List;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import jz.cdgy.mbg.pojo.Position;
import jz.cdgy.mbg.pojo.Rewards;
import jz.cdgy.mbg.pojo.RewardsExample;
import org.apache.ibatis.annotations.Param;

public interface RewardsMapper extends BaseMapper<Rewards> {
    long countByExample(RewardsExample example);

    int deleteByExample(RewardsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Rewards record);

    int insertSelective(Rewards record);

    List<Rewards> selectByExample(RewardsExample example);

    Rewards selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Rewards record, @Param("example") RewardsExample example);

    int updateByExample(@Param("record") Rewards record, @Param("example") RewardsExample example);

    int updateByPrimaryKeySelective(Rewards record);

    int updateByPrimaryKey(Rewards record);

    List<Rewards> getAllRewards(Rewards rewards);
}