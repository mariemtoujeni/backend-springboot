package com.example.pidev.pidevbackend.controllers;

import com.example.pidev.pidevbackend.entities.Quiz;
import com.example.pidev.pidevbackend.services.IQuizService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Controller
@AllArgsConstructor
@RequestMapping("/quiz")
@CrossOrigin("*")
public class QuizController {
    IQuizService service;
    @GetMapping("/retrieve-all")
    @ResponseBody
    public List<Quiz> getQuizs(){
        return service.retrieveAllQuiz();
    }
    @PostMapping("/add")
    @ResponseBody
    public Quiz addQuiz (@RequestBody Quiz q){
        return service.addQuiz(q);
    }
    @DeleteMapping("/delete/{id}")
    @ResponseBody
    public void deleteQuiz(@PathVariable("id") Long id){
        service.deleteQuiz(id);
    }
    @PutMapping("/update-quiz")
    @ResponseBody
    public Quiz updateQuiz(@RequestBody Quiz q){

        return service.updateQuiz(q);
    }
    @GetMapping("/retrieve-quiz/{id}")
    @ResponseBody
    public Quiz retreiveQuizById(@PathVariable("id") Long id){

        return service.retrieveQuiz(id);
    }
}
