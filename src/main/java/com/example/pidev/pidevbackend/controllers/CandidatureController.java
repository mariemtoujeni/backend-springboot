package com.example.pidev.pidevbackend.controllers;

import com.example.pidev.pidevbackend.entities.Candidature;
import com.example.pidev.pidevbackend.services.ICandidatureService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/candidature")
@AllArgsConstructor
public class CandidatureController {
    private  final ICandidatureService iCandidatureService;


    @PostMapping("/add")
    public void addCandidature(@RequestBody Candidature candidature) {
        iCandidatureService.addCandidature(candidature);
    }
    @GetMapping("/get")
    public Candidature getCandidature(@RequestParam long id) {
       return  iCandidatureService.getCandidature(id);
    }

    @GetMapping("/getAll")
    public List<Candidature> getAllCandidature() {
       return  iCandidatureService.getAllCandidature();
    }



}
