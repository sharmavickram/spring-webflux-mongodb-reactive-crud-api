package com.example.springwebfluxmongodbreactivecrudapi.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.Data;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document
public class Invoice {

    @Id
    private Integer id;
    private String name;
    private String number;
    private Double amount;
}