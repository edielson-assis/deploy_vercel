package br.com.edielsonassis.model;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity(name = "books")
public class Book {

    @Id
    @GeneratedValue(generator = "UUID")
    private UUID id;
    private String code;
    private String description;
    private String name;
}