package jz.cdgy.admin.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import jz.cdgy.mbg.pojo.User;

import java.util.List;
import java.util.Map;

public interface LoginMapper extends BaseMapper<User> {

    User queryByUsername(String username);

    List<Map> queryPermissionByRoleId(List<String> rid);

    List<String> queryRoleByUserId(Integer uid);
}
