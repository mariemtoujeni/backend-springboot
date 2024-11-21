package com.example.pidev.pidevbackend.services.Implementation;

import com.example.pidev.pidevbackend.entities.Training;
import com.example.pidev.pidevbackend.repositories.TrainingRepository;
import com.example.pidev.pidevbackend.services.ITrainingService;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service

public class TrainingServiceImpl implements ITrainingService {

    private final TrainingRepository trainingRepository;


    public TrainingServiceImpl(TrainingRepository trainingRepository) {
        this.trainingRepository = trainingRepository;
    }

    @Override
    public Training addTraining(Training training) {
        return trainingRepository.save(training);
    }

    @Override
    public void deleteTraining(int trainingId) {
        trainingRepository.deleteById(trainingId);
    }

    @Override
    public void updateTraining(Training training) {

        trainingRepository.save(training);
    }

    @Override
    public Training getTraining(int trainingId) {
        Optional<Training> trainingOptional = trainingRepository.findById(trainingId);
        return trainingOptional.orElse(null);
    }

    @Override
    public List<Training> getAllTraining() {
        return trainingRepository.findAll();
    }
}
