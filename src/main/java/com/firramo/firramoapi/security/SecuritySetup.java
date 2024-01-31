package com.firramo.firramoapi.security;

import com.firramo.firramoapi.model.RoleType;
import com.firramo.firramoapi.model.evergreen.EvergreenRoleType;
import com.firramo.firramoapi.model.firramo.Role;
import com.firramo.firramoapi.model.firramo.Setting;
import com.firramo.firramoapi.repository.evergreen.EvergreenRoleRepo;
import com.firramo.firramoapi.repository.firramo.AppUserRepo;

import com.firramo.firramoapi.repository.firramo.RoleRepo;
import com.firramo.firramoapi.service.firramo.AppUserService;
import com.firramo.firramoapi.service.firramo.SettingsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;


@Configuration
@EnableWebSecurity
public class SecuritySetup {
    @Autowired
    private AppUserRepo userRepo;

    @Autowired
    private AppUserService appUserService;
    @Autowired
    RoleRepo roleRepo;
    @Autowired
    private SettingsService settingsService;

    @Autowired
    EvergreenRoleRepo evergreenRoleRepo;

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
            Setting setting = settingsService.getSettings();
            if (setting == null){
                setting = Setting.builder()
                        .language("EN")
                        .currency("USD")
                        .currencySymbol("$")
                        .build();
                settingsService.saveSetting(setting);
            }

            if (!roleRepo.findByName(RoleType.ADMIN.name()).isPresent())
                roleRepo.save(new Role(RoleType.ADMIN.name()));

            if (!roleRepo.findByName(RoleType.USER.name()).isPresent())
                roleRepo.save(new Role(RoleType.USER.name()));

        }catch (Exception err){
            // pass
            err.printStackTrace();
        }

        try{
            evergreenRoleRepo.save(
                    new com.firramo.firramoapi.model.evergreen.Role(
                            EvergreenRoleType.ADMIN.name()
                    ));
            evergreenRoleRepo.save(
                    new com.firramo.firramoapi.model.evergreen.Role(
                            EvergreenRoleType.PUNTER.name()
                    ));
        }catch (Exception err){
            // pass
        }
    }

    @Bean
    protected SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .csrf()
                .disable()
                .cors().disable()
                .authorizeHttpRequests()
                .antMatchers("*")
                .permitAll();

        return http.build();
    }
}
