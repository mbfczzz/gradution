package jz.cdgy.auth.service.impl;

import jz.cdgy.common.constant.AuthConstant;
import jz.cdgy.common.exception.ParamException;
import jz.cdgy.auth.domain.ActiveUser;
import jz.cdgy.auth.service.AdminService;
import jz.cdgy.common.model.UserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;

@Service
public class UserServiceImpl implements UserDetailsService {

    @Autowired
    private AdminService adminService;

    @Autowired
    private HttpServletRequest request;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        String clientId = request.getParameter("client_id");
        UserDto userDto=null;
            try {
                System.out.println(445555445);
                userDto = adminService.loadUserByUsername(username);
            }
            catch (Exception e){
                System.out.println(e.getMessage());
            }
        if(userDto==null) {
            throw new ParamException("用戶不存在!");
        }
        userDto.setClientId(clientId);
        ActiveUser activeUser = new ActiveUser(userDto);
        return activeUser;
    }

}
