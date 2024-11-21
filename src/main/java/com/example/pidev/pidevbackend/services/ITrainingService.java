package com.example.pidev.pidevbackend.services;

import com.example.pidev.pidevbackend.entities.Training;

import java.util.List;

public interface ITrainingService {
    public Training addTraining(Training training);
    public void deleteTraining(int training);
    public void updateTraining(Training training);
    public Training getTraining(int trainingId );
    public List<Training> getAllTraining();
}
