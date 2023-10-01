package com.example.case_sudy.repository;

import com.example.case_sudy.model.KetQua;

import java.util.List;

public interface IKetQuaRepository {
    List<KetQua> getAll();
    int score();
    void create(KetQua ketQua);
}
