package com.example.pidev.pidevbackend.repositories;

import com.example.pidev.pidevbackend.entities.Candidature;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CandidatureRepository  extends JpaRepository<Candidature, Long> {
}
