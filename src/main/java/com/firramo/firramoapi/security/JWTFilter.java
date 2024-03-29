package com.firramo.firramoapi.security;

import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Component
public class JWTFilter extends OncePerRequestFilter{
//    @Autowired
//    private AppUserService userDetailsService;
//    @Autowired private JWTUtil<?> jwtUtil;

//    @Override/////
    protected void doFilterInternal(HttpServletRequest request,
                                    HttpServletResponse response,
                                    FilterChain filterChain) throws ServletException, IOException {
        String authHeader = request.getHeader("Authorization");
//        if(authHeader != null && !authHeader.isEmpty() && authHeader.startsWith("Bearer ")){
//            String jwt = authHeader.substring(7);
//            if(jwt.isEmpty()){
//                response.sendError(HttpServletResponse.SC_BAD_REQUEST, "Invalid JWT RefreshToken in Bearer Header");
//            }else {
//                try{
//                    String email = jwtUtil.verifyToken(jwt);
//                    UserDetails userDetails = userDetailsService.loadUserByUsername(email);
//                    UsernamePasswordAuthenticationToken authToken =
//                            new UsernamePasswordAuthenticationToken(
//                                    email, userDetails.getPassword(),
//                                    userDetails.getAuthorities()
//                            );
//                    if(SecurityContextHolder.getContext().getAuthentication() == null){
//                        SecurityContextHolder.getContext().setAuthentication(authToken);
//                    }
//                }catch(JWTVerificationException exc){
//                    response.sendError(HttpServletResponse.SC_UNAUTHORIZED, "Invalid JWT RefreshToken");
//                }
//            }
//        }

        filterChain.doFilter(request, response);
    }
}
