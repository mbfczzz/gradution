package jz.cdgy.mbg.mapper;

import java.util.List;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import jz.cdgy.mbg.pojo.JobTransfer;
import jz.cdgy.mbg.pojo.JobTransferExample;
import org.apache.ibatis.annotations.Param;

public interface JobTransferMapper extends BaseMapper<JobTransfer> {
    long countByExample(JobTransferExample example);

    int deleteByExample(JobTransferExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(JobTransfer record);

    int insertSelective(JobTransfer record);

    List<JobTransfer> selectByExample(JobTransferExample example);

    JobTransfer selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") JobTransfer record, @Param("example") JobTransferExample example);

    int updateByExample(@Param("record") JobTransfer record, @Param("example") JobTransferExample example);

    int updateByPrimaryKeySelective(JobTransfer record);

    int updateByPrimaryKey(JobTransfer record);

    List<JobTransfer> getAllJobTransfer(JobTransfer jobTransfer);
}