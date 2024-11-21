package com.example.pidev.pidevbackend.controllers;

import com.example.pidev.pidevbackend.entities.Course;
import com.example.pidev.pidevbackend.entities.Question;
import com.example.pidev.pidevbackend.services.IQuestionService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Controller
@AllArgsConstructor
@RequestMapping("/question")
@CrossOrigin("*")
public class QuestionService {
    IQuestionService service;

    @GetMapping("/retrieve-all")
    @ResponseBody
    public List<Question> getQuestions(){
        return service.retrieveAllQuestion();
    }
    @PostMapping("/add")
    @ResponseBody
    public Question addQuestion (@RequestBody Question q){
        return service.addQuestion(q);
    }
    @DeleteMapping("/delete/{id}")
    @ResponseBody
    public void deleteQuestion(@PathVariable("id") Long id){
        service.deleteQuestion(id);
    }
    @PutMapping("/update-question")
    @ResponseBody
    public Question updateQuestion(@RequestBody Question q){

        return service.updateQuestion(q);
    }
    @GetMapping("/retrieve-question/{id}")
    @ResponseBody
    public Question retreiveQuestionById(@PathVariable("id") Long id){

        return service.retrieveQuestion(id);
    }
}
