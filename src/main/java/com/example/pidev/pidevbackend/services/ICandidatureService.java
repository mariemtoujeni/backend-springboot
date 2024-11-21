package com.example.pidev.pidevbackend.services;

import com.example.pidev.pidevbackend.entities.Candidature;

import java.util.List;

public interface ICandidatureService {
    void addCandidature( Candidature candidature);
    void deleteCandidature(long id);
    void updateCandidature();
    Candidature getCandidature(long id);
    List<Candidature> getAllCandidature();
}
