package jz.cdgy.mbg.mapper;

import java.util.List;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import jz.cdgy.mbg.pojo.Recruit;
import jz.cdgy.mbg.pojo.RecruitExample;
import jz.cdgy.mbg.pojo.Rule;
import org.apache.ibatis.annotations.Param;

public interface RecruitMapper extends BaseMapper<Recruit> {
    long countByExample(RecruitExample example);

    int deleteByExample(RecruitExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Recruit record);

    int insertSelective(Recruit record);

    List<Recruit> selectByExample(RecruitExample example);

    Recruit selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Recruit record, @Param("example") RecruitExample example);

    int updateByExample(@Param("record") Recruit record, @Param("example") RecruitExample example);

    int updateByPrimaryKeySelective(Recruit record);

    int updateByPrimaryKey(Recruit record);

    List<Recruit>getAllRecruit(Recruit recruit);

    List<Rule> getRulesByRid(Integer id);
}