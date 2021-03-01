package jz.cdgy.common.model;

import jz.cdgy.mbg.pojo.User;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
public class UserDto {
    private String user_name;
    private String id;
    private User user;
    private Object head;
    private Object side;
    private String clientId;
    private List<String> authorities;

}
