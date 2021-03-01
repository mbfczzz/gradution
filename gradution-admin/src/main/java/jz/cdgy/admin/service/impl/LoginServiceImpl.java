package jz.cdgy.admin.service.impl;

import cn.hutool.core.util.StrUtil;
import cn.hutool.json.JSONUtil;
import jz.cdgy.admin.mapper.LoginMapper;
import jz.cdgy.admin.service.AuthService;
import jz.cdgy.common.api.CommonResult;
import jz.cdgy.common.constant.AuthConstant;
import jz.cdgy.common.constant.StatusCode;
import jz.cdgy.common.exception.ParamException;
import jz.cdgy.common.model.UserDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jz.cdgy.admin.service.LoginService;
import jz.cdgy.mbg.pojo.User;
import org.springframework.util.CollectionUtils;

import javax.servlet.http.HttpServletRequest;
import java.util.*;
import java.util.stream.Collectors;

//
@Slf4j
@Service
public class LoginServiceImpl implements LoginService {
    @Autowired
    private AuthService authService;
    @Autowired
    private LoginMapper loginMapper;
    @Autowired
    private HttpServletRequest request;
//
////    @Autowired
////    private AuthenticationManager authenticationManager;
////    @Autowired
////    private UserDetailsService userDetailsService;
////    @Autowired
////    private PasswordEncoder passwordEncoder;
////    @Autowired
////    private UserMapper userMapper;
//        @Autowired
//        private JwtUtil jwtUtil;
//      @Autowired
//      private LoginService loginService;
//      @Autowired
//      private RabbitTemplate rabbitTemplate;
//
////    @Override
////    public String login(User user) {
////                UsernamePasswordAuthenticationToken usernamePasswordAuthenticationToken = new UsernamePasswordAuthenticationToken(user.getUsername(),user.getPassword());
////                Authentication authentication = authenticationManager.authenticate(usernamePasswordAuthenticationToken);
////                SecurityContextHolder.getContext().setAuthentication(authentication);
////                UserDetails userDetails = userDetailsService.loadUserByUsername(user.getUsername());
////        return jwtUtil.generateToken(userDetails);
////    }
//
    @Override
    public CommonResult login(User user) {
        if(StrUtil.isEmpty(user.getUsername())||StrUtil.isEmpty(user.getPassword())){
        throw new ParamException("用户名或密码不能为空！");
        }
        Map<String, String> params = new HashMap<>();
        params.put("client_id", AuthConstant.ADMIN_CLIENT_ID);
        params.put("client_secret","123456");
        params.put("grant_type","password");
        params.put("username",user.getUsername());
        params.put("password",user.getPassword());
        CommonResult restResult = authService.getAccessToken(params);
        return restResult;
    }

        private Map<String, Object> getAuthorities(List<Map> permission) {
        Map<String ,Object> map =  new HashMap<>();
        List<Map<String,Object>> head = new LinkedList<>();
        List<Map<String,Object>> side = new LinkedList<>();
        List<String> authList = new ArrayList<>();
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
            authList.add(s.get("path").toString());
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
                    List<Map<String,Object>> child =  getChildren((Long) k.get("id"),permission);
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

    @Override
    public UserDto loadUserByUsername(String username) {
        User user = queryUserByuserName(username);
        List<String> role  = loginMapper.queryRoleByUserId(user.getId());
        List<Map> permission =  loginMapper.queryPermissionByRoleId(role);
        Map map = getAuthorities(permission);
        System.out.println(map.toString());
        List<String> head = (List<String>) map.get("head");
        List<String> side = (List<String>) map.get("side");
        UserDto userDto = new UserDto();
        if (user != null) {
            userDto.setHead(head);
            userDto.setSide(side);
            userDto.setUser(user);
            userDto.setUser_name(user.getUsername());
            userDto.setId(user.getId().toString());
            userDto.setAuthorities((List<String>) map.get("authority"));
            return userDto;
        }
        log.info("{}","获取信息完成!");
        return null;
    }

//    @Override
//    public String register(User user) {
//        if(loginService.queryUserByuserName(user.getUsername())!=null){
//            AssertsUtil.isTrue(true,"当前用户已存在!");
//        }
//            String password = user.getPassword();
//            String encodePassword = passwordEncoder.encode(password);
//            user.setPassword(encodePassword);
//            if(userMapper.insert(user)==1){
//                List<Integer> list = new ArrayList<>(1);
//                list.add(user.getId());
//                rabbitTemplate.convertAndSend("admin-register-exchange","admin-register-key",list);
//                return  "注册成功!";
//            }
//            return "注册失败!";
//    }
//
    @Override
    public UserDto getUserInfo() {
        String userStr = request.getHeader(AuthConstant.USER_TOKEN_HEADER);
        if(StrUtil.isEmpty(userStr)){
            throw  new ParamException(StatusCode.PERMISSION_UNDIFINE.getMessage());
        }
        UserDto userDto = JSONUtil.toBean(userStr, UserDto.class);
        return loadUserByUsername(userDto.getUser_name());
    }

    @Override
    public List<Map<String,Object>> getChildren(Long id,List<Map> permission) {
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

    @Override
    public User queryUserByuserName(String username) {
        return loginMapper.queryByUsername(username);
    }
}
