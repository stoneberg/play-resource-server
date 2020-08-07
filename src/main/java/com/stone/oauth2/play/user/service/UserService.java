package com.stone.oauth2.play.user.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.stone.oauth2.play.user.domain.User;
import com.stone.oauth2.play.user.repository.UserRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class UserService {

    private final UserRepository userRepository;

    public List<User> findAll() {
        return userRepository.findAll();
    }

}
