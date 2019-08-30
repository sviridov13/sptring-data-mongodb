package com.example.mongodb.repositories;

import com.example.mongodb.entity.UserEntity;
import com.example.mongodb.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<UserEntity, Long> {
}
