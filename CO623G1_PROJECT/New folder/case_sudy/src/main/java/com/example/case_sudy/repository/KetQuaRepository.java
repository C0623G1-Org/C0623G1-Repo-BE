package com.example.case_sudy.repository;

import com.example.case_sudy.model.KetQua;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class KetQuaRepository implements IKetQuaRepository {
    private static final String SELECT = "SELECT \n" +
            "ch.ten_cau_hoi,\n" +
            "kq.dap_an_chon,\n" +
            "kq.dap_an_dung,\n" +
            "kq.diem\n" +
            "FROM ket_qua kq\n" +
            "JOIN cau_hoi ch ON kq.ma_cau_hoi=ch.ma_cau_hoi\n" +
            "WHERE kq.ma_lich_su=1;";

    @Override
    public List<KetQua> getAll() {
        Connection connection = BaseRepository.getConnection();
        List<KetQua> dsKetQua = new ArrayList<>();
        KetQua ketQua = null;
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(SELECT);
            while (resultSet.next()) {
                String tenCauHoi = resultSet.getNString("ten_cau_hoi");
                String dapAnChon = resultSet.getNString("dap_an_chon");
                String dapAnDung = resultSet.getNString("dap_an_dung");
                int diem = resultSet.getInt("diem");
                ketQua = new KetQua(tenCauHoi, dapAnChon, dapAnDung, diem);
                dsKetQua.add(ketQua);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return dsKetQua;
    }

    @Override
    public int score() {
        int score = 0;
        for (KetQua ketQua : getAll()) {
            score += ketQua.getDiem();
        }
        return score;
    }

    @Override
    public void create(KetQua ketQua) {

    }
}
