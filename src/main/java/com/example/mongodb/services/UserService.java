package com.example.mongodb.services;

import com.example.mongodb.dto.UserDto;
import com.example.mongodb.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    List<User> getAllUsers();
    void createUser(UserDto dto);
}
