package com.sagar.SpringSecurityProject.repository;

import com.sagar.SpringSecurityProject.model.MyUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MyUserDetailsRepo extends JpaRepository<MyUser, Integer> {
    MyUser findByUsername(String username);
}
