package jz.cdgy.admin.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import jz.cdgy.admin.service.MoneyService;
import jz.cdgy.admin.util.AssertsUtil;
import jz.cdgy.mbg.mapper.DepartmentMapper;
import jz.cdgy.mbg.mapper.MoneyMapper;
import jz.cdgy.mbg.pojo.Department;
import jz.cdgy.mbg.pojo.Money;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

@Service
public class MoneyServiceImpl  implements MoneyService {
    @Autowired
    private MoneyMapper  moneyMapper;
    @Override
    public PageInfo<Money> getAllMoney(Integer page, Integer limit, Money money) {
        PageHelper.startPage(page,limit);
        return new PageInfo<Money>(moneyMapper.getAllMoney(money));
    }

    @Override
    public void addMoney(Money money) {
        AssertsUtil.isTrue(moneyMapper.insertSelective(money)!=1,"添加失败!");
    }

    @Override
    public void updateMoney(Money money) {
        AssertsUtil.isTrue(moneyMapper.updateByPrimaryKeySelective(money)!=1,"更新失败!");
    }

    @Override
    @Transactional
    public void deleteMoney(List<Integer> ids) {
        AssertsUtil.isTrue(moneyMapper.deleteBatchIds(ids)!=1,"删除失败!");
    }

}
