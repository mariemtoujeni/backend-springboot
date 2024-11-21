package com.example.pidev.pidevbackend.services.Implementation;

import com.example.pidev.pidevbackend.entities.Candidature;
import com.example.pidev.pidevbackend.repositories.CandidatureRepository;
import com.example.pidev.pidevbackend.services.ICandidatureService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ICandidatureServiceImpl  implements ICandidatureService {
    private  final CandidatureRepository candidatureRepository;
     ICandidatureServiceImpl(CandidatureRepository candidatureRepository) {
        this.candidatureRepository = candidatureRepository;
    }
    @Override
    public void addCandidature(Candidature candidature) {
         candidatureRepository.save(candidature);

    }

    @Override
    public void deleteCandidature(long id) {
         if (candidatureRepository.existsById(id)) {
             candidatureRepository.deleteById(id);
         } else {
             throw new RuntimeException("Candidature not found");
         }

    }

    @Override
    public void updateCandidature() {

    }

    @Override
    public Candidature getCandidature(long id) {
        return  candidatureRepository.findById(id).orElseThrow(() -> new RuntimeException("Candidature not found"));
    }

    @Override
    public List<Candidature> getAllCandidature() {
         return  candidatureRepository.findAll();

    }
}
