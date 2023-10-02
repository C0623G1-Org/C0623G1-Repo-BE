package com.example.english.service;

import com.example.english.model.KetQua;

import java.util.List;

public interface IKetQuaService {
    List<KetQua> getAll();
    int score();
    void create(KetQua ketQua);
}
