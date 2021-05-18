package jz.cdgy.admin.service;

import com.github.pagehelper.PageInfo;
import jz.cdgy.mbg.pojo.Emp;
import jz.cdgy.mbg.pojo.Spend;

import java.util.List;
import java.util.Map;

public interface ExpenditureService {
    PageInfo<Spend> getAllSpend(Integer page, Integer limit, Spend spend);

    void addSpend(Spend spend);

    void updateSpend(Spend spend);

    void deleteSpend(List<Integer> id);

    List<Map<String,Object>> getSpendItem();
}
