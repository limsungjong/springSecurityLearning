package com.example.springsecurity.User.controller;

import com.example.springsecurity.User.domain.dto.UserJoinReqBody;
import com.example.springsecurity.User.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/user")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @PostMapping("/join")
    public ResponseEntity<String> userJoin(UserJoinReqBody DTO) {
        
        return ResponseEntity.ok("success");
    }
}