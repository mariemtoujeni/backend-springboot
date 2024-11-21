package com.example.pidev.pidevbackend.repositories;

import com.example.pidev.pidevbackend.entities.User;
import com.example.pidev.pidevbackend.entities.enums.UserRoles;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository  extends JpaRepository<User, Long> {

    List<User>  findByRole (UserRoles role);
    User findByEmailAndPassword(String email, String password);
}
