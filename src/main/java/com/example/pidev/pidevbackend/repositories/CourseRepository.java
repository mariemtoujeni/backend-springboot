package com.example.pidev.pidevbackend.repositories;

import com.example.pidev.pidevbackend.entities.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {
}
