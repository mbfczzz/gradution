package jz.cdgy.admin.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import jz.cdgy.admin.mapper.LoginMapper;
import jz.cdgy.admin.service.RoleService;
import jz.cdgy.admin.service.UserService;
import jz.cdgy.admin.util.AssertsUtil;
import jz.cdgy.mbg.mapper.RoleMapper;
import jz.cdgy.mbg.mapper.RolePermissionMapper;
import jz.cdgy.mbg.mapper.UserMapper;
import jz.cdgy.mbg.mapper.UserRoleMapper;
import jz.cdgy.mbg.pojo.*;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

@Slf4j
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper,User> implements UserService{

    @Autowired
    private UserMapper userMapper;
    @Autowired
    private UserRoleMapper userRoleMapper;
    @Autowired
    private PasswordEncoder passwordEncoder;
    @Autowired
    private LoginMapper loginMapper;
    @Autowired
    private RoleMapper roleMapper;
    @Autowired
    private RolePermissionMapper rolePermissionMapper;
    @Autowired
    private RoleService roleService;

    /**
     * 获取所有用户
     * @param page
     * @param limit
     * @param user
     * @return
     */
    @Override
    public PageInfo getAllUser(Integer page, Integer limit, User user) {
        PageHelper.startPage(page,limit);
        return new PageInfo<>(userMapper.getAllUser(user));
    }

    @Override
    public void addUser(User user) {
        AssertsUtil.isTrue(userMapper.insert(user)!=1,"用户添加失败!");
    }

    /**
     * 批量删除用户
     * @param ids
     */
    @Override
    @Transactional
    public void deleteUser(List<Integer> ids) {
        ids.forEach(id->{
            AssertsUtil.isTrue(userMapper.deleteByPrimaryKey(id)!=1,"删除失败!");
            QueryWrapper<UserRole> queryWrapper = new QueryWrapper<>();
            queryWrapper.eq("uid",id);
            AssertsUtil.isTrue(userRoleMapper.
                    delete(queryWrapper)==0,"删除失败!");
        });
    }

    /**
     * 有id就更新,没用就添加
     * @param user
     */
    @Transactional
    @Override
    public void updateUser(User user) {
        log.info(user.toString());
        if(user.getId() == null && loginMapper.queryByUsername(user.getUsername())!=null){
            log.info("123");
            AssertsUtil.isTrue(true,"当前用户已存在!");
        }
        String result = "添加";
            if(user.getId() != null){
                UserRoleExample userRoleExample = new UserRoleExample();
                UserRoleExample.Criteria criteria = userRoleExample.createCriteria();
                criteria.andUidEqualTo(user.getId());
                AssertsUtil.isTrue(userRoleMapper.deleteByExample(userRoleExample)==0,"用户更新失败");
                result = "更新";
            }
           if(StringUtils.isNotBlank(user.getPassword())){
            user.setPassword(passwordEncoder.encode(user.getPassword()));
            }
            AssertsUtil.isTrue(saveOrUpdate(user)==false,result+"失败");
            user.setId(loginMapper.queryByUsername(user.getUsername()).getId());
            AssertsUtil.isTrue(userRoleMapper.updateUserRole(user.getId().toString(),
                Arrays.asList(user.getUserole().split(",")))==0,result+"失败");
    }

    /**
     * 获取用户对应角色,没有id就获取所有角色
     * @param id
     * @return
     */
    @Override
    public List<Map> gerUserRole(Integer id) {
        return userMapper.gerUserRole(id);
    }

    /**
     * 获取所有角色
     * @param page
     * @param limit
     * @return
     */
    @Override
    public PageInfo<Role> getAllRole(Integer page, Integer limit) {
        PageHelper.startPage(page,limit);
        return new PageInfo<Role>(roleMapper.selectList(new QueryWrapper<>()));
    }

    /**
     * 添加角色
     * @param role
     */
    @Override
    public void addRole(Role role) {
            AssertsUtil.isTrue(roleMapper.insert(role)!=1,"用户添加失败!");
    }

    /**
     * 批量删除角色
     * @param ids
     */
    @Override
    public void deleteRole(List<Integer> ids) {
            ids.forEach(id->{
                AssertsUtil.isTrue(roleMapper.deleteByPrimaryKey(id)!=1,"删除失败!");
                QueryWrapper<RolePermission> queryWrapper = new QueryWrapper<>();
                queryWrapper.eq("rid",id);
                AssertsUtil.isTrue(rolePermissionMapper.
                        delete(queryWrapper)==0,"删除失败!");
            });
    }

    /**
     * 添加更新角色
     * @param role
     */
    @Override
    public void updateRole(Role role) {
            QueryWrapper queryWrapper = new QueryWrapper();
            queryWrapper.eq("name",role.getRoleName());
            if(role.getId() == null && roleMapper.selectOne(queryWrapper)!=null){
                AssertsUtil.isTrue(true,"当前角色已存在!");
            }
            String result = "添加";
            if(role.getId() != null){
                RolePermissionExample  rolePermissionExample  = new RolePermissionExample();
                RolePermissionExample.Criteria criteria = rolePermissionExample.createCriteria();
                criteria.andIdEqualTo(role.getId());
                AssertsUtil.isTrue(rolePermissionMapper.deleteByExample(rolePermissionExample)==0,"用户更新失败");
                result = "更新";
            }
            AssertsUtil.isTrue(roleService.saveOrUpdate(role)==false,result+"失败");
            role.setId(roleMapper.selectOne(queryWrapper).getId());
            AssertsUtil.isTrue(rolePermissionMapper.updateRolePermission(role.getId().toString(),
                Arrays.asList(role.getRolePermission().split(",")))==0,result+"失败");
    }

    /**
     * 获取角色对应权限
     * @param id
     * @return
     */
    @Override
    public List<Map> gerRolePermission(Integer id) {
        return rolePermissionMapper.getRolePermission(id);
    }
}

