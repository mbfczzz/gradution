package jz.cdgy.admin.service.impl;

import jz.cdgy.admin.mapper.LoginMapper;
import jz.cdgy.admin.model.ActiceUser;
import jz.cdgy.mbg.pojo.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.util.CollectionUtils;

import java.util.*;

@Slf4j
public class UserDetailServiceImpl implements UserDetailsService {
    @Autowired
    LoginMapper loginMapper;
    @Autowired
    LoginServiceImpl loginService;
    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        log.info("{}","授权开始!");
        User user = loginMapper.queryByUsername(s);
        if(user == null){
            throw new UsernameNotFoundException("用户不存在!");
        }
        List<Integer> roleId  = loginMapper.queryRoleByUserId(user.getId());
        List<Map> permission =  loginMapper.queryPermissionByRoleId(roleId);
        Map map = getAuthorities(permission);
        log.info("{}","获取信息完成!");
        return  new ActiceUser(user, (Collection<? extends GrantedAuthority>) map.get("authList"),map.get("head"),map.get("side"));
    }


    private Map<String, Object> getAuthorities(List<Map> permission) {
        Map<String ,Object> map =  new HashMap<>();
        List<Map<String,Object>> head = new LinkedList<>();
        List<Map<String,Object>> side = new LinkedList<>();
        List<GrantedAuthority> authList = new ArrayList<>();
        permission.forEach(s->{
            if((int)s.get("module") == 1){
                    Map tmap = new HashMap();
                    tmap.put("title",s.get("title"));
                    tmap.put("path",s.get("path"));
                    tmap.put("parentId",s.get("parentId"));
                    tmap.put("name",s.get("name"));
                    tmap.put("component",s.get("component"));
                    head.add(tmap);
            }
            authList.add(new SimpleGrantedAuthority((String) s.get("path")));
        });
        head.forEach(s->{
            permission.forEach(k->{
                if((int)k.get("module")!=1 && k.get("parentId") == s.get("parentId")){
                    Map<String,Object> smap  = new HashMap();
                    smap.put("title",k.get("title"));
                    smap.put("path",k.get("path"));
                    smap.put("name",k.get("name"));
                    smap.put("component",k.get("component"));
                    smap.put("parentId",k.get("parentId"));
                    List<Map<String,Object>> child =  loginService.getChildren((Long) k.get("id"),permission);
                    if(!CollectionUtils.isEmpty(child)){
                        smap.put("children",child);
                    }
                    side.add(smap);
                }
            });
        });
        map.put("head",head);
        map.put("side",side);
        map.put("authority",authList);
        return map;
    }
}
