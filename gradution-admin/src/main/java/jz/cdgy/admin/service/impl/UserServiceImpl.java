package jz.cdgy.admin.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import jz.cdgy.admin.mapper.LoginMapper;
import jz.cdgy.admin.service.RoleService;
import jz.cdgy.admin.service.UserService;
import jz.cdgy.admin.util.AssertsUtil;
import jz.cdgy.mbg.mapper.*;
import jz.cdgy.mbg.pojo.*;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;

import java.util.*;

@Slf4j
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper,User> implements UserService{

    @Autowired
    private UserMapper userMapper;
    @Autowired
    private UserRoleMapper userRoleMapper;
//    @Autowired
//    private PasswordEncoder passwordEncoder;
    @Autowired
    private LoginMapper loginMapper;
    @Autowired
    private RoleMapper roleMapper;
    @Autowired
    private RolePermissionMapper rolePermissionMapper;
    @Autowired
    private RoleService roleService;
    @Autowired
    private PermissionMapper permissionMapper;
    @Autowired
    private PasswordEncoder passwordEncoder;

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
        if(user.getId() == null && loginMapper.queryByUsername(user.getUsername())!=null){
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

    @Override
    public void updateUserByIsValid(User user) {
        AssertsUtil.isTrue(userMapper.updateByPrimaryKeySelective(user)!=1,"更新状态失败");
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
        List<Role> roles =  roleMapper.selectList(new QueryWrapper<>());
        roles.forEach(s->{
            s.setPermission(gerRolePermission(s.getId()));
        });
        return new PageInfo<Role>(roles);
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
            queryWrapper.eq("role_name",role.getRoleName());
            if(role.getId() == null && roleMapper.selectOne(queryWrapper)!=null){
                AssertsUtil.isTrue(true,"当前角色已存在!");
            }
            AssertsUtil.isTrue(roleService.saveOrUpdate(role)==false,"更新失败");
    }

    /**
     * 获取全部权限
     * @param page
     * @param limit
     * @param permission
     * @return
     */
    @Override
    public PageInfo<Permission> getAllPermission(Integer page, Integer limit, Permission permission) {
        QueryWrapper queryWrapper = new QueryWrapper<>();
        if(StringUtils.isNotBlank(permission.getPermissionName())){
            queryWrapper.like("permission_name",permission.getPermissionName());
        }
        if(StringUtils.isNotBlank(permission.getName())){
            queryWrapper.like("name",permission.getName());
        }
        if(permission.getHierarchy()!=null){
            queryWrapper.eq("Hierarchy",permission.getHierarchy());
        }
        if(StringUtils.isNotBlank(permission.getPermissionType())){
            queryWrapper.eq("permission_type",permission.getPermissionType());
        }
        if(StringUtils.isNotBlank(permission.getStrDate())){
            queryWrapper.between("create_time",permission.getStrDate().split(",")[0],permission.getStrDate().split(",")[1]);
        }
        if(permission.getIsValid()!=null){
            queryWrapper.eq("is_valid",permission.getIsValid());
        }
        PageHelper.startPage(page,limit);
        return new PageInfo<Permission>(permissionMapper.selectList(queryWrapper));
    }

    /**
     * 获取树型权限
     * @return
     */
    @Override
    public List<Map> getTreePermission(){
        List<Permission> permissions = permissionMapper.selectList(new QueryWrapper<>());
        List<Map> treeList = new LinkedList<>();
        permissions.forEach(s->{
                    if(s.getHierarchy() == 1){
                        Map<String,Object> map = new HashMap();
                        map.put("id",s.getId().toString());
                        map.put("pid","0");
                        map.put("label",s.getPermissionName());
                        map.put("children",getChildren(s.getId(),permissions));
                        treeList.add(map);
                    }
        });
        return treeList;
    }

    private List<Map> getChildren(Integer id,List<Permission> permissions) {
        List<Map> list = new LinkedList<>();
        permissions.forEach(k->{
            if((k.getHierarchy()!=1 && k.getParentId() == id)){
                Map<String,Object> map  = new HashMap();
                map.put("id",k.getId().toString());
                map.put("pid",k.getParentId().toString());
                map.put("label",k.getPermissionName());
                List<Map> mapList = getChildren(k.getId(),permissions);
                if(!CollectionUtils.isEmpty(mapList)){
                    map.put("children",mapList);
                }
                list.add(map);
            }});
        return list;
    }

    /**
     * 获取角色对应权限
     * @param id
     * @return
     */
    @Override
    public List<Map> gerRolePermission(Integer id) {
        List<Permission> permissions = rolePermissionMapper.getRolePermission(id);
        List<Map> rolePermissionList = new LinkedList<>();
        permissions.forEach(s->{
            if(s.getHierarchy() == 1){
                Map<String,Object> map = new HashMap();
                map.put("id",s.getId().toString());
                map.put("pid","0");
                map.put("label",s.getPermissionName());
                map.put("children",getChildren(s.getId(),permissions));
                rolePermissionList.add(map);
            }
        });
        return rolePermissionList;
    }

    @Override
    @Transactional
    public void updateTreePermission(Role role) {
        System.out.println(role.toString());
        RolePermissionExample  rolePermissionExample  = new RolePermissionExample();
        RolePermissionExample.Criteria criteria = rolePermissionExample.createCriteria();
        criteria.andRidEqualTo(role.getId());
        AssertsUtil.isTrue(rolePermissionMapper.deleteByExample(rolePermissionExample)==-1,"角色权限更新失败");
        AssertsUtil.isTrue(rolePermissionMapper.updateRolePermission(role.getId().toString(),
                 Arrays.asList(role.getRolePermission().split(",")))==0,"更新角色权限失败");
    }

    @Override
    public List<Map> getPermissionType() {
        return permissionMapper.getPermissionType();
    }

    @Override
    public List<Map> getHierarchy() {
        return permissionMapper.getHierarchy();
    }

    @Override
    public void updatePermission(Permission permission) {
        AssertsUtil.isTrue(permissionMapper.updateByPrimaryKeySelective(permission)!=1,"更新失败!");
    }

    @Override
    public void addPermission(Permission permission) {
        AssertsUtil.isTrue(permissionMapper.updateByPrimaryKey(permission)!=1,"更新失败!");
    }
}

