package com.example.springsecurity.dto;

import com.example.springsecurity.entity.UserEntity;
import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class UserDto {
    private int userId;

    private String userEmail;

    private String userName;

    private String userPassword;

    static public UserEntity toEntity(UserDto userDto) {
        return UserEntity
                .builder()
                .userId(userDto.getUserId())
                .userEmail(userDto.getUserEmail())
                .userName(userDto.getUserName())
                .userPassword(userDto.getUserPassword())
                .build();
    }
}
