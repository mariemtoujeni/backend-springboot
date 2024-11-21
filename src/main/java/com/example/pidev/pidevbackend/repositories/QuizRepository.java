package com.example.pidev.pidevbackend.repositories;

import com.example.pidev.pidevbackend.entities.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuizRepository extends JpaRepository<Quiz,Long> {
}
