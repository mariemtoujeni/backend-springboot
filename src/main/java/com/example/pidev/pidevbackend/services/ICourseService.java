package com.example.pidev.pidevbackend.services;

import com.example.pidev.pidevbackend.entities.Course;

import java.util.List;

public interface ICourseService {
    List<Course> retrieveAllCourse();

    Course addCourse(Course c);

    void deleteCourse(Long id);

    Course updateCourse(Course c);

    Course retrieveCourse(Long id);
}
