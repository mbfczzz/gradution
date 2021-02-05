package jz.cdgy.gateway.authorization;

import cn.hutool.core.util.StrUtil;
import cn.hutool.json.JSONUtil;
import com.nimbusds.jose.JWSObject;
import jz.cdgy.common.constant.AuthConstant;
import jz.cdgy.common.model.UserDto;
import jz.cdgy.gateway.config.IgnoreUrlConfig;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.security.authorization.AuthorizationDecision;
import org.springframework.security.authorization.ReactiveAuthorizationManager;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.web.server.authorization.AuthorizationContext;
import org.springframework.stereotype.Component;
import org.springframework.util.AntPathMatcher;
import org.springframework.util.PathMatcher;
import reactor.core.publisher.Mono;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;


@Component
public class Authorization implements ReactiveAuthorizationManager<AuthorizationContext> {

    @Autowired
    private IgnoreUrlConfig ignoreUrlConfig;

    @SneakyThrows
    @Override
    public Mono<AuthorizationDecision> check(Mono<Authentication> mono, AuthorizationContext authorizationContext) {
        System.out.println(5545);
        ServerHttpRequest request = authorizationContext.getExchange().getRequest();
        URI uri = request.getURI();
        System.out.println(uri.getPath());
        PathMatcher pathMatcher = new AntPathMatcher();
        List<String> ignoreUrls = ignoreUrlConfig.getUrls();
        System.out.println(ignoreUrls.toString());
        for (String ignoreUrl : ignoreUrls) {
            if (pathMatcher.match(ignoreUrl, uri.getPath())) {
                return Mono.just(new AuthorizationDecision(true));
            }
        }
        String token = request.getHeaders().getFirst(AuthConstant.JWT_TOKEN_HEADER);
        if(StrUtil.isEmpty(token)){
            return Mono.just(new AuthorizationDecision(false));
        }
        String realToken = token.replace(AuthConstant.JWT_TOKEN_PREFIX, "");
        JWSObject jwsObject = JWSObject.parse(realToken);
        String userStr = jwsObject.getPayload().toString();
        UserDto userDto = JSONUtil.toBean(userStr, UserDto.class);

        System.out.println(userDto);

        if (!userDto.getAuthorities().contains(uri.getPath())){
            return Mono.just(new AuthorizationDecision(true));
        }

        //对应跨域的预检请求直接放行
        if(request.getMethod()== HttpMethod.OPTIONS){
            return Mono.just(new AuthorizationDecision(true));
        }
        return mono
                .filter(Authentication::isAuthenticated)
                .flatMapIterable(Authentication::getAuthorities)
                .map(GrantedAuthority::getAuthority)
                .any(userDto.getAuthorities()::contains)
                .map(AuthorizationDecision::new)
                .defaultIfEmpty(new AuthorizationDecision(false));
    }
}
