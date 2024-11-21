package com.example.pidev.pidevbackend.services;

import com.example.pidev.pidevbackend.entities.Question;
import com.example.pidev.pidevbackend.entities.Quiz;

import java.util.List;

public interface IQuizService {
    List<Quiz> retrieveAllQuiz();

    Quiz addQuiz(Quiz q);

    void deleteQuiz(Long id);

    Quiz updateQuiz(Quiz q);

    Quiz retrieveQuiz(Long id);
}
