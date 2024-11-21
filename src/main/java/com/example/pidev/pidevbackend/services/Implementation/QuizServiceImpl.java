package com.example.pidev.pidevbackend.services.Implementation;

import com.example.pidev.pidevbackend.entities.Quiz;
import com.example.pidev.pidevbackend.repositories.QuizRepository;
import com.example.pidev.pidevbackend.services.IQuizService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
@Slf4j
public class QuizServiceImpl implements IQuizService {
    QuizRepository quizRepo;
    @Override
    public List<Quiz> retrieveAllQuiz() {
        return (List<Quiz>) quizRepo.findAll();
    }

    @Override
    public Quiz addQuiz(Quiz q) {
        return quizRepo.save(q);
    }

    @Override
    public void deleteQuiz(Long id) {
        if(quizRepo.findById(id).isPresent())
            quizRepo.deleteById(id);
        else
            System.out.println("No exist");

    }

    @Override
    public Quiz updateQuiz(Quiz q) {
        return quizRepo.save(q);
    }

    @Override
    public Quiz retrieveQuiz(Long id) {
        return quizRepo.findById(id).orElse(new Quiz());
    }
}
