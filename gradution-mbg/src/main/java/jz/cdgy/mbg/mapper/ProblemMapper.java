package jz.cdgy.mbg.mapper;

import java.util.List;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import jz.cdgy.mbg.pojo.Problem;
import jz.cdgy.mbg.pojo.ProblemExample;
import org.apache.ibatis.annotations.Param;

public interface ProblemMapper  extends BaseMapper<Problem> {
    long countByExample(ProblemExample example);

    int deleteByExample(ProblemExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Problem record);

    int insertSelective(Problem record);

    List<Problem> selectByExample(ProblemExample example);

    Problem selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Problem record, @Param("example") ProblemExample example);

    int updateByExample(@Param("record") Problem record, @Param("example") ProblemExample example);

    int updateByPrimaryKeySelective(Problem record);

    int updateByPrimaryKey(Problem record);
}