package com.example.english.repository;

import com.example.english.model.KetQua;

import java.util.List;

public interface IKetQuaRepository {
    List<KetQua> getAll();
    int score();
    void create(KetQua ketQua);
}
