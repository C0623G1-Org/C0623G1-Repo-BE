package com.example.case_sudy.service;

import com.example.case_sudy.model.KetQua;

import java.util.List;

public interface IKetQuaService {
    List<KetQua> getAll();
    int score();
    void create(KetQua ketQua);
}
