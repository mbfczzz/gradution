package jz.cdgy.mbg.mapper;

import java.util.List;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import jz.cdgy.mbg.pojo.MsgModel;
import jz.cdgy.mbg.pojo.MsgModelExample;
import org.apache.ibatis.annotations.Param;

public interface MsgModelMapper extends BaseMapper<MsgModel> {
    long countByExample(MsgModelExample example);

    int deleteByExample(MsgModelExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MsgModel record);

    int insertSelective(MsgModel record);

    List<MsgModel> selectByExampleWithBLOBs(MsgModelExample example);

    List<MsgModel> selectByExample(MsgModelExample example);

    MsgModel selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MsgModel record, @Param("example") MsgModelExample example);

    int updateByExampleWithBLOBs(@Param("record") MsgModel record, @Param("example") MsgModelExample example);

    int updateByExample(@Param("record") MsgModel record, @Param("example") MsgModelExample example);

    int updateByPrimaryKeySelective(MsgModel record);

    int updateByPrimaryKeyWithBLOBs(MsgModel record);

    int updateByPrimaryKey(MsgModel record);
}