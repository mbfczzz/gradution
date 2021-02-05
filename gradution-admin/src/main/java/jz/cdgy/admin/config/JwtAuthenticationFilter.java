//package jz.cdgy.admin.config;
//
//import jz.cdgy.admin.util.JwtUtil;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
//import org.springframework.security.core.context.SecurityContextHolder;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
//import org.springframework.web.filter.OncePerRequestFilter;
//
//import javax.servlet.FilterChain;
//import javax.servlet.ServletException;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//
//@Slf4j
//public class JwtAuthenticationFilter extends OncePerRequestFilter {
//    @Autowired
//    private JwtUtil jwtUtil;
//    @Autowired
//    private UserDetailsService userDetailsService;
//    @Value("${jwt.tokenHeader}")
//    private String tokenHeader;
//    @Value("${jwt.tokenHead}")
//    private String tokenHead;
//
//    @Override
//    protected void doFilterInternal(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, FilterChain filterChain) throws ServletException, IOException {
//        String authHeader = httpServletRequest.getHeader(tokenHeader);
//        log.info(tokenHead);
//        if (authHeader != null && authHeader.startsWith(this.tokenHead)) {
//            String authToken = authHeader.substring(this.tokenHead.length());// The part after "Bearer "
//            log.info(this.tokenHead);
//            String username = jwtUtil.getUserNameFromToken(authToken);
//            log.info("checking username:{}", username);
//            if (username != null && SecurityContextHolder.getContext().getAuthentication() == null) {
//                UserDetails userDetails = userDetailsService.loadUserByUsername(username);
//                if (jwtUtil.validateToken(authToken, userDetails)) {
//                    UsernamePasswordAuthenticationToken authentication = new UsernamePasswordAuthenticationToken(userDetails, null, userDetails.getAuthorities());
//                    authentication.setDetails(new WebAuthenticationDetailsSource().buildDetails(httpServletRequest));
//                    log.info("authenticated user:{}", username);
//                    SecurityContextHolder.getContext().setAuthentication(authentication);
//                }
//            }
//        }
//        filterChain.doFilter(httpServletRequest, httpServletResponse);
//    }
//}
