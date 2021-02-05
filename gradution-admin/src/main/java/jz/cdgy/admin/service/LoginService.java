package jz.cdgy.admin.service;

import jz.cdgy.common.api.CommonResult;
import jz.cdgy.common.model.UserDto;
import jz.cdgy.mbg.pojo.User;

import java.util.List;
import java.util.Map;

public interface LoginService {
    CommonResult login(User user);
//
//    String register(User user);
//
    UserDto getUserInfo();
//
    List<Map<String,Object>> getChildren(Long id,List<Map> premission);
//
    User queryUserByuserName(String username);

    UserDto loadUserByUsername(String username);
}
