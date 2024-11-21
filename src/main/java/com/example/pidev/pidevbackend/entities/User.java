package com.example.pidev.pidevbackend.entities;
import com.example.pidev.pidevbackend.entities.enums.AccountStatus;
import com.example.pidev.pidevbackend.entities.enums.UserRoles;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.Date;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class User implements Serializable{
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    private String name;
    private String email;
    private String password;

    @Enumerated(EnumType.STRING)
    @Column(name = "user_role", nullable = false, length = 50, columnDefinition = "varchar(50) default 'ROLE_STUDENT'")
    private UserRoles role;
    private String image;
    private String phone;
    private String address;
    private String Gender;
    private Date dateOfBirth;
    private Date dateOfJoining;
    @Enumerated(EnumType.STRING)
    @Column(name = "account_status", nullable = false, length = 50, columnDefinition = "varchar(50) default 'INVERIFICATION'")
    private AccountStatus accountStatus;
    private String OrganizationName;
    private String OrganizationType;
    private Date dateOfCreation;
    private Date dateOfModification;
    private String documentPath;



}


