package com.example.pidev.pidevbackend.services;

import com.example.pidev.pidevbackend.entities.Course;
import com.example.pidev.pidevbackend.entities.Question;

import java.util.List;

public interface IQuestionService {
    List<Question> retrieveAllQuestion();

    Question addQuestion(Question q);

    void deleteQuestion(Long id);

    Question updateQuestion(Question q);

    Question retrieveQuestion(Long id);
}
