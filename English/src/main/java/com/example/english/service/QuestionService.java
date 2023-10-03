package com.example.english.service;

import com.example.english.model.Question;
import com.example.english.repository.IQuestionRepository;
import com.example.english.repository.QuestionRepository;

import java.util.List;

public class QuestionService implements IQuestionService{
    private final IQuestionRepository questionRepository = new QuestionRepository();
    @Override
    public List<Question> findAllQuestion() {
        return questionRepository.findAllQuestion();
    }

    @Override
    public List<Question> createPracticeList() {
        return questionRepository.createPracticeList();
    }
}
