package com.login_page.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<com.login_page.domain.user.User, String> {

    Optional<com.login_page.domain.user.User> findByEmail(String email);
}