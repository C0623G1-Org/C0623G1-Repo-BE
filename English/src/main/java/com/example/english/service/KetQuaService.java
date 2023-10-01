package com.example.english.service;

import com.example.english.model.KetQua;
import com.example.english.repository.IKetQuaRepository;
import com.example.english.repository.KetQuaRepository;

import java.util.List;

public class KetQuaService implements IKetQuaService {
    private IKetQuaRepository ketQuaRepository = new KetQuaRepository();
    @Override
    public List<KetQua> getAll() {
        return ketQuaRepository.getAll();
    }

    @Override
    public int score() {
        return ketQuaRepository.score();
    }

    @Override
    public void create(KetQua ketQua) {

    }
}
