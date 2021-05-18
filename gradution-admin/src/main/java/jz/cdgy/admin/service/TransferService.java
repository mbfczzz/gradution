package jz.cdgy.admin.service;

import com.github.pagehelper.PageInfo;
import jz.cdgy.mbg.pojo.Transfer;

import java.util.List;
import java.util.Map;

public interface TransferService {
    PageInfo<Transfer> getAllTransfer(Integer page, Integer limit, Transfer transfer);

    void addTransfer(Transfer transfer);

    void updateTransfer(Transfer transfer);

    void deleteTransfer(List<Integer> id);

    List<Map<String, Object>> getTransfer(String type);
}
