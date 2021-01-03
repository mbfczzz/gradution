package jz.cdgy.admin.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.github.pagehelper.PageInfo;
import jz.cdgy.mbg.pojo.Role;
import jz.cdgy.mbg.pojo.User;

import java.util.List;
import java.util.Map;

public interface UserService  extends  IService<User>{
    PageInfo<User> getAllUser(Integer page, Integer limit, User user);

    void addUser(User user);

    void deleteUser(List<Integer> ids);

    void updateUser(User user);

    List<Map> gerUserRole(Integer id);

    List<Map> gerRolePermission(Integer id);

    PageInfo<Role> getAllRole(Integer page, Integer limit);

    void addRole(Role role);

    void deleteRole(List<Integer> ids);

    void updateRole(Role role);
}