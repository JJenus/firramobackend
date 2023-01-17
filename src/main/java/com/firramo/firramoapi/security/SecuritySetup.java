package com.firramo.firramoapi.security;

import com.firramo.firramoapi.model.ROLE;
import com.firramo.firramoapi.model.Role;
import com.firramo.firramoapi.model.Setting;
import com.firramo.firramoapi.repository.AppUserRepo;
import com.firramo.firramoapi.repository.RoleRepo;
import com.firramo.firramoapi.repository.SettingsRepo;
import com.firramo.firramoapi.service.AppUserService;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

@Configuration
@EnableWebSecurity
public class SecuritySetup {
    @Autowired
    private AppUserRepo userRepo;
    @Autowired
    private JWTFilter filter;
    @Autowired
    private AppUserService appUserService;
    @Autowired
    RoleRepo roleRepo;
    @Autowired
    private SettingsRepo settingsRepo;

    @Bean
    protected SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .csrf()
                .disable()
                .cors().disable()
                .authorizeHttpRequests()
                .antMatchers("/auth/**").permitAll()
                .antMatchers("/faqs/**").permitAll()
                .antMatchers("/users/**").permitAll()
                .antMatchers("/testimonials/**").permitAll()
                .antMatchers(HttpMethod.GET, "/settings/**").permitAll()
                .antMatchers(HttpMethod.POST,"/settings/**").hasRole(ROLE.ADMIN.name())
                .antMatchers("/transactions/**")
                .permitAll()
                .anyRequest()
                .authenticated()
                .and()
                .sessionManagement()
                .sessionCreationPolicy(SessionCreationPolicy.STATELESS)
                .and()
                .userDetailsService(appUserService)
                .exceptionHandling()
                .authenticationEntryPoint(
                        (request, response, authException) -> response.sendError(
                                HttpServletResponse.SC_UNAUTHORIZED, "Unauthorized"
                        )
                )
                .and()
                .addFilterBefore(filter, UsernamePasswordAuthenticationFilter.class);

        return http.build();
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public AuthenticationManager authenticationManager(AuthenticationConfiguration config) throws Exception {
        return config.getAuthenticationManager();
    }

    @Bean
    public void createRoles(){
        try{
            if (settingsRepo.findAll().size() < 1){
                Setting setting = Setting.builder()
                        .language("EN")
                        .currency("USD")
                        .currencySymbol("$")
                        .build();
                settingsRepo.save(setting);
            }

            if (!roleRepo.findByName(ROLE.ADMIN.name()).isPresent())
                roleRepo.save(new Role(ROLE.ADMIN.name()));

            if (!roleRepo.findByName(ROLE.USER.name()).isPresent())
                roleRepo.save(new Role(ROLE.USER.name()));
        }catch (Exception err){
            // pass
        }
    }


//    http.csrf().disable()
//                .sessionManagement()
//                .sessionCreationPolicy(SessionCreationPolicy.STATELESS)
//                .and()
//                .cors().disable()
//                .authorizeHttpRequests()
//                .antMatchers("/auth/**").permitAll()
//                .antMatchers("/faqs/**").permitAll()
//                .antMatchers("/users/**").permitAll()
//                .antMatchers("/interact/**").permitAll()
//                .antMatchers(HttpMethod.GET, "/predictions/**").permitAll()
//                .antMatchers(HttpMethod.GET, "/subscriptions/**").permitAll()
//                .antMatchers("/testimonials/**").permitAll()
//                .antMatchers(HttpMethod.GET, "/settings/**").permitAll()
//                .antMatchers(HttpMethod.POST,"/settings/**").hasRole(ROLE.ADMIN.name())
//            .antMatchers("*").permitAll()
////                .anyRequest().authenticated()
//                .and()
//                .userDetailsService(appUserService)
//                .exceptionHandling()
//                .authenticationEntryPoint(
//                        (request, response, authException) ->
//            response.sendError(HttpServletResponse.SC_UNAUTHORIZED, "Unauthorized")
//            );
//
//        http.addFilterBefore(filter, UsernamePasswordAuthenticationFilter.class);

}
