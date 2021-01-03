package jz.cdgy.admin.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import jz.cdgy.mbg.pojo.User;

import java.util.List;
import java.util.Map;

public interface LoginMapper extends BaseMapper {

    User queryByUsername(String username);

    List<Map> queryPermissionByRoleId(List<Integer> rid);

    List<Integer> queryRoleByUserId(Integer uid);
}
