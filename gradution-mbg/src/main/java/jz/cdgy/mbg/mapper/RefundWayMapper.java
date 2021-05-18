package jz.cdgy.mbg.mapper;

import java.util.List;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import jz.cdgy.mbg.pojo.RefundWay;
import jz.cdgy.mbg.pojo.RefundWayExample;
import org.apache.ibatis.annotations.Param;

public interface RefundWayMapper extends BaseMapper<RefundWay> {
    long countByExample(RefundWayExample example);

    int deleteByExample(RefundWayExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(RefundWay record);

    int insertSelective(RefundWay record);

    List<RefundWay> selectByExample(RefundWayExample example);

    RefundWay selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") RefundWay record, @Param("example") RefundWayExample example);

    int updateByExample(@Param("record") RefundWay record, @Param("example") RefundWayExample example);

    int updateByPrimaryKeySelective(RefundWay record);

    int updateByPrimaryKey(RefundWay record);
}