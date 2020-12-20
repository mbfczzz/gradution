package jz.cdgy.admin.model;

import jz.cdgy.mbg.pojo.User;
import lombok.AllArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;
import java.util.Map;

@AllArgsConstructor
public class ActiceUser implements UserDetails {

    private User user;
    private Collection<? extends GrantedAuthority> authorities;
    private Object head;
    private Object side;

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
