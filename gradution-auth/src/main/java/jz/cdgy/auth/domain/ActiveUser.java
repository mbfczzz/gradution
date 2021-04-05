package jz.cdgy.auth.domain;

import jz.cdgy.common.model.UserDto;
import jz.cdgy.mbg.pojo.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayList;
import java.util.Collection;

@AllArgsConstructor
@Data
@NoArgsConstructor
public class ActiveUser implements UserDetails {

    private String clientId;
    private User user;
    private Collection<SimpleGrantedAuthority> authorities;
    private Object head;
    private Object side;

    public ActiveUser(UserDto userDto){
        this.clientId = userDto.getClientId();
        this.user = userDto.getUser();
        this.head = userDto.getHead();
        this.side = userDto.getSide();
//        if (userDto.getAuthorities() != null) {
//            authorities = new ArrayList<>();
//            userDto.getAuthorities().forEach(item -> authorities.add(new SimpleGrantedAuthority(item)));
//        }
    }

    public User getUser() {
        return user;
    }

    public Object getHead() {
        return head;
    }


    public Object getSide() {
        return side;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return this.authorities;
    }

    @Override
    public String getPassword() {
        return this.user.getPassword();
    }

    @Override
    public String getUsername() {
        return this.user.getUsername();
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
