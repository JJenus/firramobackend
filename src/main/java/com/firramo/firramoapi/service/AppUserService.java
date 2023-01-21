package com.firramo.firramoapi.service;

import com.firramo.firramoapi.model.*;
import com.firramo.firramoapi.repository.AppUserRepo;
import com.firramo.firramoapi.repository.KYCRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class AppUserService implements UserDetailsService {
    @Autowired
    AppUserRepo userRepo;
    @Autowired
    private KYCRepo kYCRepo;

    public AppUser getUser(Long id){
        return userRepo.findById(id).orElse(null);
    }

    public List<AppUser> getUsers(){
        return userRepo.findAll();
    }

    public AppUser update(AppUser user){
        Optional<AppUser> optionalAppUser = userRepo.findById(user.getId());
        if (!optionalAppUser.isPresent()) {
            return null;
        }
        return userRepo.save(user);
    }

    public void delUser(Long id){
        userRepo.deleteById(id);
    }

    public AppUser getUserByEmail(String email) {
        return userRepo.findByEmail(email).orElse(null);
    }

    public AppUser save(AppUser user) {
        return userRepo.save(user);
    }

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        Optional<AppUser> userRes = userRepo.findByEmail(email);
        if(!userRes.isPresent())
            throw new UsernameNotFoundException("Could not findUser with email = " + email);
        AppUser user = userRes.get();

        List<SimpleGrantedAuthority> roles = new ArrayList<>();

        for (Role role: user.getRoles()){
            roles.add(new SimpleGrantedAuthority(role.getName()));
        }

        return new User(email, user.getPassword(), roles);
    }

    public FirramoResponse verify(KYC userKyc) {
        AppUser user = userRepo.findById(userKyc.getUserId()).orElse(null);

        if (user == null){
            return FirramoResponse.builder()
                    .status("error")
                    .message("User does not exist")
                    .build();
        }

//        KYC userKyc = kYCRepo.findByUserId(user.getId()).orElse(null);

//        if (userKyc == null){
//            return FirramoResponse.builder()
//                    .status("error")
//                    .message("Pending fee payment")
//                    .build();
//        }
        kYCRepo.save(userKyc);
        user.setStatus("pending");
        userRepo.save(user);

        return FirramoResponse.builder()
                .status("ok")
                .message("Verification success")
                .build();
    }

    public void deleteUser(Long id) {
        if (userRepo.findById(id).isPresent()){
            userRepo.deleteById(id);
        }else {
            throw new UsernameNotFoundException("User doesn't exist");
        }
    }
}
