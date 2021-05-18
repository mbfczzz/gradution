package jz.cdgy.admin.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import jz.cdgy.admin.service.AccountService;
import jz.cdgy.admin.util.AssertsUtil;
import jz.cdgy.mbg.mapper.AccountMapper;
import jz.cdgy.mbg.pojo.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;

@Service
public class AccountServiceImpl  implements AccountService {
    @Autowired
    private AccountMapper accountMapper;

    @Override
    public PageInfo<Account> getAllAccount(Integer page, Integer limit, Account account) {
        PageHelper.startPage(page, limit);
        return new PageInfo<Account>(accountMapper.selectList(new QueryWrapper<>()));
    }

    @Override
    public void addAccount(Account account) {
        AssertsUtil.isTrue(accountMapper.insertSelective(account) != 1, "添加失败!");
    }

    @Override
    public void updateAccount(Account account) {
        AssertsUtil.isTrue(accountMapper.updateByPrimaryKeySelective(account) != 1, "更新失败!");
    }

    @Override
    @Transactional
    public void deleteAccount(List<Integer> ids) {
        AssertsUtil.isTrue(accountMapper.deleteBatchIds(ids) != 1, "删除失败!");
    }

    @Override
    public List<Map<String, Object>> getAccountByMap() {
        QueryWrapper<Account> queryWrapper = new QueryWrapper();
        queryWrapper.select("id as value","account_name as label");
        queryWrapper.eq("is_valid",1);
        HashMap hashMap = new LinkedHashMap(2);
        hashMap.put("value",0);
        hashMap.put("label","未使用账套");
        List<Map<String, Object>> mapList = accountMapper.selectMaps(queryWrapper);
        mapList.add(hashMap);
        return mapList;
    }
}
