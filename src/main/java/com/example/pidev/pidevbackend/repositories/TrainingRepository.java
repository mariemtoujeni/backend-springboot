package com.example.pidev.pidevbackend.repositories;

import com.example.pidev.pidevbackend.entities.Exemple;
import com.example.pidev.pidevbackend.entities.Training;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TrainingRepository  extends JpaRepository<Training, Integer> {
}