package jz.cdgy.admin.service;

import jz.cdgy.admin.model.ActiceUser;
import jz.cdgy.mbg.pojo.User;

import java.util.List;
import java.util.Map;

public interface LoginService {
    String login(User user);

    String register(User user);

    ActiceUser getUserInfo();

    List<Map<String,Object>> getChildren(Long id,List<Map> premission);

}
