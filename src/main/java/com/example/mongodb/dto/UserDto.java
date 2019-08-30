package com.example.mongodb.dto;

import lombok.Builder;
import lombok.Data;

import java.util.Map;

@Data
@Builder
public class UserDto {
    private String name;
    private String age;
    private Map<String, String> fields;
}
