package com.cheng.banking.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cheng.banking.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
    User findByEmail(String email);
    User findByUsernameOrEmailOrPhoneNumber(String username, String email, String phoneNumber);
    boolean existsByUsername(String username);
    boolean existsByEmail(String email);

}
