package com.example.pidev.pidevbackend.services;

import com.example.pidev.pidevbackend.entities.RepassageRequest;

import java.util.List;

public interface IRepassageRequestService {
    List<RepassageRequest> retrieveAllRequests();

    RepassageRequest addRequest(RepassageRequest c);

    void deleteRequest(Long id);

    RepassageRequest updateRequest(RepassageRequest c);

    RepassageRequest retrieveRequest(Long id);
}
