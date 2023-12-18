package com.realtimechatapplication.usermanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.realtimechatapplication.usermanagement.bean.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> { 
    User findByUsername(String username);
    
}
