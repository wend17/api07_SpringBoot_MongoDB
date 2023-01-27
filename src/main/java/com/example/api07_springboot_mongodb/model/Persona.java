package com.example.api07_springboot_mongodb.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(value = "Personas")
@Data
public class Persona {

    @Id
    private String id;
    private String nombres;
    private String apellidos;
    private String email;
    private Integer edad;
}
