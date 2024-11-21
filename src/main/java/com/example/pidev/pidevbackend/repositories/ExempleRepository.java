package com.example.pidev.pidevbackend.repositories;

import com.example.pidev.pidevbackend.entities.Exemple;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ExempleRepository extends JpaRepository<Exemple, Long> {
}
