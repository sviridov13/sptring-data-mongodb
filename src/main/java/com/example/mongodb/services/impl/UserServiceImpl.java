package com.example.mongodb.services.impl;

import com.example.mongodb.Utils;
import com.example.mongodb.dto.UserDto;
import com.example.mongodb.entity.UserEntity;
import com.example.mongodb.model.User;
import com.example.mongodb.repositories.UserRepository;
import com.example.mongodb.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository repository;

    @Override
    public List<User> getAllUsers() {
        List<UserEntity> users = repository.findAll();
        return users.stream().map(Utils::toUser).collect(Collectors.toList());
    }

    @Override
    public void createUser(UserDto userDto) {
        repository.save(Utils.toUserEntity(userDto));
    }
}
