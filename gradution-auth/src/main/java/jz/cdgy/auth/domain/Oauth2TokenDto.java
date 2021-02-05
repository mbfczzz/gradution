package jz.cdgy.auth.domain;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
@Builder
public class Oauth2TokenDto {
    private String token;
    private String refreshToken;
    private String tokenHead;
    private int expiresIn;
}