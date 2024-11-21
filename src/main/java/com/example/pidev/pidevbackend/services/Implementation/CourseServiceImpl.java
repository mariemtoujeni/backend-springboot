package com.example.pidev.pidevbackend.services.Implementation;

import com.example.pidev.pidevbackend.entities.Course;
import com.example.pidev.pidevbackend.repositories.CourseRepository;
import com.example.pidev.pidevbackend.services.ICourseService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@AllArgsConstructor
@Service
public class CourseServiceImpl implements ICourseService {
    CourseRepository courseRepo;
    @Override
    public List<Course> retrieveAllCourse() {
        return (List<Course>) courseRepo.findAll();
    }

    @Override
    public Course addCourse(Course c) {
        return courseRepo.save(c);
    }

    @Override
    public void deleteCourse(Long id) {
        courseRepo.deleteById(id);

    }

    @Override
    public Course updateCourse(Course c) {
        return courseRepo.save(c);
    }

    @Override
    public Course retrieveCourse(Long id) {
        return courseRepo.findById(id).orElse(new Course());
    }
}
