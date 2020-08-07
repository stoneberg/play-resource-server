package com.stone.oauth2.play.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.stone.oauth2.play.user.domain.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
