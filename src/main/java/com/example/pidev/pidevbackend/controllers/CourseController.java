package com.example.pidev.pidevbackend.controllers;

import com.example.pidev.pidevbackend.entities.Course;
import com.example.pidev.pidevbackend.services.ICourseService;
import com.example.pidev.pidevbackend.services.IUserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Controller
@AllArgsConstructor
@RequestMapping("/course")
@CrossOrigin("*")
public class CourseController {
    ICourseService service;
    IUserService userService;
    @GetMapping("/retrieve-all")
    @ResponseBody
    public List<Course> getCourses(){
        return service.retrieveAllCourse();
    }
    @PostMapping("/add")
    @ResponseBody
    public Course addCourse (@RequestBody Course c){
        return service.addCourse(c);
    }
    @DeleteMapping("/delete/{id}")
    @ResponseBody
    public void deleteClient(@PathVariable("id") Long id){
        service.deleteCourse(id);
    }
    @PutMapping("/update-course")
    @ResponseBody
    public Course updateCourse(@RequestBody Course c){

        return service.updateCourse(c);
    }
    @GetMapping("/retrieve-course/{id}")
    @ResponseBody
    public Course retreiveCourseById(@PathVariable("id") Long id){
        return service.retrieveCourse(id);
    }
}
