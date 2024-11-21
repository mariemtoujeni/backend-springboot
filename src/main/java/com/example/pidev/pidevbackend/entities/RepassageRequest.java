package com.example.pidev.pidevbackend.entities;

import com.example.pidev.pidevbackend.entities.enumerations.Status;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.io.Serializable;
import java.util.Date;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class RepassageRequest implements Serializable {
    static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long Id;
    Boolean withJustification;
    @Enumerated(EnumType.STRING)
    Status status;
    Date requestDate;
    String course;





}
