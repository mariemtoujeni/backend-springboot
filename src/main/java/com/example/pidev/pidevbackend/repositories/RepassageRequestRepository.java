package com.example.pidev.pidevbackend.repositories;

import com.example.pidev.pidevbackend.entities.RepassageRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepassageRequestRepository extends JpaRepository<RepassageRequest,Long> {
}
