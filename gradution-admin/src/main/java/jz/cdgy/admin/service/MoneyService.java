package jz.cdgy.admin.service;

import com.github.pagehelper.PageInfo;
import jz.cdgy.mbg.pojo.Emp;
import jz.cdgy.mbg.pojo.Money;

import java.util.List;

public interface MoneyService {
    PageInfo<Money> getAllMoney(Integer page, Integer limit, Money money);

    void addMoney(Money money);

    void updateMoney(Money money);

    void deleteMoney(List<Integer> id);
}
