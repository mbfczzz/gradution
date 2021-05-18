package jz.cdgy.admin.service;

import com.github.pagehelper.PageInfo;
import jz.cdgy.mbg.pojo.JobTransfer;
import jz.cdgy.mbg.pojo.Transfer;

import java.util.List;
import java.util.Map;

public interface JobTransferService {
    PageInfo<JobTransfer> getAllJobTransfer(Integer page, Integer limit, JobTransfer jobTransfer);

    void addJobTransfer(JobTransfer transfer);

    void updateJobTransfer(JobTransfer transfer);

    void deleteJobTransfer(List<Integer> id);
}
