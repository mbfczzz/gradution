package jz.cdgy.admin.service;

import com.github.pagehelper.PageInfo;
import jz.cdgy.mbg.pojo.Rewards;
import jz.cdgy.mbg.pojo.SpendWay;

import java.util.List;
import java.util.Map;

public interface SpendWayService {
    List<Map<String,Object>> getSpendWay() ;

    PageInfo<SpendWay> getAllSpendWay(Integer page, Integer limit, SpendWay spendWay);

    void addSpendWay(SpendWay spendWay);

    void updateSpendWay(SpendWay spendWay);

    void deleteSpendWay(List<Integer> id);
}
