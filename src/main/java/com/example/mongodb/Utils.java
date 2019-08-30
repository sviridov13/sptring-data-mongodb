package com.example.mongodb;

import com.example.mongodb.dto.UserDto;
import com.example.mongodb.entity.UserEntity;
import com.example.mongodb.model.User;
import lombok.experimental.UtilityClass;

@UtilityClass
public class Utils {
    public UserEntity toUserEntity(UserDto userDto) {
        return UserEntity.builder()
                .age(userDto.getAge())
                .name(userDto.getName())
                .fields(userDto.getFields())
                .build();
    }

    public User toUser(UserEntity user) {
        return User.builder()
                .age(user.getAge())
                .name(user.getName())
                .fields(user.getFields())
                .build();
    }
}
