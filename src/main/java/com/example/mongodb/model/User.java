package com.example.mongodb.model;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.Map;

@Data
@Builder
@Document(collection = "user")
public class User {
    @Indexed
    private String name;
    private String age;
    private Map<String, String> fields;
}
