package com.example.pidev.pidevbackend.repositories;

import com.example.pidev.pidevbackend.entities.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuestionRepository extends JpaRepository<Question,Long> {
}
