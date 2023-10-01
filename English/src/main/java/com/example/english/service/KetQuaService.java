package com.example.case_sudy.service;

import com.example.case_sudy.model.KetQua;
import com.example.case_sudy.repository.IKetQuaRepository;
import com.example.case_sudy.repository.KetQuaRepository;

import java.util.List;

public class KetQuaService implements IKetQuaService{
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
