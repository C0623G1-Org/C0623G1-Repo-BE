package com.example.english.service;

import com.example.english.model.Result;
import com.example.english.repository.IResultRepository;
import com.example.english.repository.ResultRepository;

import java.util.List;

public class ResultService implements IResultService {
    private IResultRepository resultRepository = new ResultRepository();
    @Override
    public List<Result> getAll() {
        return resultRepository.getAll();
    }

    @Override
    public int score() {
        return resultRepository.score();
    }

    @Override
    public void create(Result result) {

    }
}
