package com.example.pidev.pidevbackend.services.Implementation;

import com.example.pidev.pidevbackend.entities.RepassageRequest;
import com.example.pidev.pidevbackend.repositories.RepassageRequestRepository;
import com.example.pidev.pidevbackend.services.IRepassageRequestService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RepassageRequestImpl implements IRepassageRequestService {
    RepassageRequestRepository requestRepo;
    @Override
    public List<RepassageRequest> retrieveAllRequests() {
        return (List<RepassageRequest>) requestRepo.findAll();
    }

    @Override
    public RepassageRequest addRequest(RepassageRequest c) {
        return requestRepo.save(c);
    }

    @Override
    public void deleteRequest(Long id) {
        requestRepo.deleteById(id);

    }

    @Override
    public RepassageRequest updateRequest(RepassageRequest c) {
        return requestRepo.save(c);
    }

    @Override
    public RepassageRequest retrieveRequest(Long id) {
        return requestRepo.findById(id).orElse(new RepassageRequest());
    }
}
