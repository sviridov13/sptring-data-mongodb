package com.example.mongodb.controller;

import com.example.mongodb.dto.UserDto;
import com.example.mongodb.model.User;
import com.example.mongodb.repositories.UserRepository;
import com.example.mongodb.services.UserService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api(tags = "events")
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping(path = "/create", consumes = "application/json", produces = "application/json")
    public ResponseEntity saveUser(@RequestBody UserDto userDto) {
        userService.createUser(userDto);
        return new ResponseEntity(HttpStatus.CREATED);
    }

    @GetMapping
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }
}
