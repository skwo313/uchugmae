package com.spring.uchugmae.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.uchugmae.entity.User;

public interface UserRepositroy extends JpaRepository<User, String> {
    
}
