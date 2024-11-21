package com.example.pidev.pidevbackend.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Exemple implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    private Long id;
    private String name;
    private String description;




}
