package jz.cdgy.admin.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import jz.cdgy.admin.service.RoleService;
import jz.cdgy.mbg.mapper.RoleMapper;
import jz.cdgy.mbg.pojo.Role;
import org.springframework.stereotype.Service;

@Service
public class RoleServiceImpl extends ServiceImpl<RoleMapper, Role> implements RoleService {

}
