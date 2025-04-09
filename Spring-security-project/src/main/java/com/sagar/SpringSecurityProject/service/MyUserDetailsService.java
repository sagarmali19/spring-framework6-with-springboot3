package com.sagar.SpringSecurityProject.service;

import com.sagar.SpringSecurityProject.model.MyUser;
import com.sagar.SpringSecurityProject.model.UserPrincipal;
import com.sagar.SpringSecurityProject.repository.MyUserDetailsRepo;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class MyUserDetailsService implements UserDetailsService {

    @Autowired
    private MyUserDetailsRepo myUserDetailsRepo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        MyUser user = myUserDetailsRepo.findByUsername(username);
        if(user == null){
            System.out.println("User 404 not found");
            throw new UsernameNotFoundException("User404");
        }
        return new UserPrincipal(user);
    }
}
