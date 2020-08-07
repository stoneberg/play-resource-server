package com.stone.oauth2.play.user.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stone.oauth2.play.user.domain.User;
import com.stone.oauth2.play.user.service.UserService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
@RequestMapping(value = "/v1")
public class UserController {

    private final UserService userService;

    @GetMapping(value = "/users")
    public List<User> findAllUser() {
        return userService.findAll();
    }
}

