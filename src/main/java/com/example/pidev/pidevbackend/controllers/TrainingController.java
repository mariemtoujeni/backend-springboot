package com.example.pidev.pidevbackend.controllers;

import com.example.pidev.pidevbackend.entities.Offer;
import com.example.pidev.pidevbackend.entities.Training;
import com.example.pidev.pidevbackend.services.ITrainingService;
import lombok.AllArgsConstructor;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@CrossOrigin("*")
@RequestMapping("/trainings")
public class TrainingController {

    private final ITrainingService trainingService;

    @PostMapping("/add")
    public Training addTraining(@RequestBody Training training) {

        return trainingService.addTraining(training);
    }

    @PutMapping("/update")
    public ResponseEntity<Void> updateTraining(@RequestBody Training training) {
        try {
            trainingService.updateTraining(training);
            return ResponseEntity.ok().build(); // Retourne une réponse vide avec un statut HTTP 200 (OK)
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build(); // Retourne une réponse avec un statut HTTP 500 (Internal Server Error)
        }
    }


    @DeleteMapping("/delete/{id}")
    public void deleteTraining(@PathVariable("id") int trainingId) {
        trainingService.deleteTraining(trainingId);
    }


    @GetMapping("/{id}")
    public Training getTraining(@PathVariable int id) {
        return trainingService.getTraining(id);
    }

    @GetMapping("/all")
    public List<Training> getAllTraining() {
        return trainingService.getAllTraining();
    }
}
