package jz.cdgy.admin.service;

import com.github.pagehelper.PageInfo;
import jz.cdgy.mbg.pojo.Account;
import java.util.List;
import java.util.Map;

public interface AccountService {
    PageInfo<Account> getAllAccount(Integer page, Integer limit, Account account);

    void addAccount(Account account);

    void updateAccount(Account account);

    void deleteAccount(List<Integer> ids);

    List<Map<String, Object>> getAccountByMap();
}
