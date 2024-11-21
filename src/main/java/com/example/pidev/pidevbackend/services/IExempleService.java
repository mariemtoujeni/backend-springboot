package com.example.pidev.pidevbackend.services;

import com.example.pidev.pidevbackend.entities.Exemple;

import java.util.List;

public interface IExempleService {
    public void addExemple();
    public void deleteExemple();
    public void updateExemple();
    public Exemple getExemple();
    public List<Exemple> getAllExemple();
}
