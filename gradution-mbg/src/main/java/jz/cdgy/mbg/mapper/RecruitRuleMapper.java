package jz.cdgy.mbg.mapper;

import java.util.List;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import jz.cdgy.mbg.pojo.RecruitRule;
import jz.cdgy.mbg.pojo.RecruitRuleExample;
import org.apache.ibatis.annotations.Param;

public interface RecruitRuleMapper  extends BaseMapper<RecruitRule> {
    long countByExample(RecruitRuleExample example);

    int deleteByExample(RecruitRuleExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(RecruitRule record);

    int insertSelective(RecruitRule record);

    List<RecruitRule> selectByExample(RecruitRuleExample example);

    RecruitRule selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") RecruitRule record, @Param("example") RecruitRuleExample example);

    int updateByExample(@Param("record") RecruitRule record, @Param("example") RecruitRuleExample example);

    int updateByPrimaryKeySelective(RecruitRule record);

    int updateByPrimaryKey(RecruitRule record);

    void insertRecruit(Integer id, String ruleStr);
}