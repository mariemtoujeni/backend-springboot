package com.example.pidev.pidevbackend.services.Implementation;

import com.example.pidev.pidevbackend.entities.Question;
import com.example.pidev.pidevbackend.repositories.QuestionRepository;
import com.example.pidev.pidevbackend.services.IQuestionService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
@AllArgsConstructor
public class QuestionServiceImpl implements IQuestionService {
    QuestionRepository questionRepo;
    @Override
    public List<Question> retrieveAllQuestion() {
        return (List<Question>) questionRepo.findAll();
    }

    @Override
    public Question addQuestion(Question q) {
        return questionRepo.save(q);
    }

    @Override
    public void deleteQuestion(Long id) {
        if(questionRepo.existsById(id))
            questionRepo.deleteById(id);
        else
            System.out.println("No exists");

    }

    @Override
    public Question updateQuestion(Question q) {
         return questionRepo.save(q);
    }

    @Override
    public Question retrieveQuestion(Long id) {
        return questionRepo.findById(id).orElse(new Question());
    }
}
