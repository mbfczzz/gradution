package jz.cdgy.admin.service.impl;

import jz.cdgy.admin.model.ActiceUser;
import jz.cdgy.admin.service.LoginService;
import jz.cdgy.admin.util.AssertsUtil;
import jz.cdgy.admin.util.JwtUtil;
import jz.cdgy.mbg.mapper.UserMapper;
import jz.cdgy.mbg.pojo.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

@Slf4j
@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    AuthenticationManager authenticationManager;
    @Autowired
    UserDetailsService userDetailsService;
    @Autowired
    PasswordEncoder passwordEncoder;
    @Autowired
    UserMapper userMapper;
    @Autowired
    JwtUtil jwtUtil;

    @Override
    public String login(User user) {
                UsernamePasswordAuthenticationToken usernamePasswordAuthenticationToken = new UsernamePasswordAuthenticationToken(user.getUsername(),user.getPassword());
                Authentication authentication = authenticationManager.authenticate(usernamePasswordAuthenticationToken);
                SecurityContextHolder.getContext().setAuthentication(authentication);
                UserDetails userDetails = userDetailsService.loadUserByUsername(user.getUsername());
        System.out.println(456);
        return jwtUtil.generateToken(userDetails);
    }

    @Override
    public String register(User user) {
        System.out.println(userMapper);
            String password = user.getPassword();
            String encodePassword = passwordEncoder.encode(password);
            user.setPassword(encodePassword);
        return userMapper.insert(user)==1?"注册成功!":"注册失败!";
    }

    @Override
    public ActiceUser getUserInfo() {
        log.info("获取用户信息");
        ActiceUser acticeUser = null;
        Object obj= SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        if(obj instanceof ActiceUser){
            acticeUser = (ActiceUser) obj;
        }
        AssertsUtil.isTrue(acticeUser==null,"当前用户不存在,当前用户已经过期!");
        return acticeUser;
    }

    @Override
    public List<Map<String, Object>> getChildren(Long id,List<Map> permission) {
        List<Map<String,Object>> list = new LinkedList<>();
        permission.forEach(k->{
            if((int)k.get("module") !=1 && k.get("parentId").toString().equals(id.toString())){
                Map<String,Object> map  = new HashMap();
                map.put("title",k.get("title"));
                map.put("path",k.get("path"));
                map.put("name",k.get("name"));
                map.put("component",k.get("component"));
                map.put("parentId",k.get("parentId"));
                List<Map<String,Object>> child =  getChildren((Long) k.get("id"),permission);
                if(!CollectionUtils.isEmpty(child)){
                    map.put("children",child);
                }
                list.add(map);
        }});
        return list;
    }
}
