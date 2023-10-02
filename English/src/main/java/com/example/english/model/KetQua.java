package com.example.english.model;

public class KetQua {
    private String tenCauHoi;
    private String dapAnChon ;
    private String dapAnDung;
    private int diem;

    public KetQua(String tenCauHoi, String dapAnChon, String dapAnDung, int diem) {
        this.tenCauHoi = tenCauHoi;
        this.dapAnDung = dapAnDung;
        this.dapAnChon = dapAnChon;
        this.diem = diem;
    }


    public String getTenCauHoi() {
        return tenCauHoi;
    }

    public void setTenCauHoi(String tenCauHoi) {
        this.tenCauHoi = tenCauHoi;
    }

    public String getDapAnDung() {
        return dapAnDung;
    }

    public void setDapAnDung(String dapAnDung) {
        this.dapAnDung = dapAnDung;
    }

    public String getDapAnChon() {
        return dapAnChon;
    }

    public void setDapAnChon(String dapAnChon) {
        this.dapAnChon = dapAnChon;
    }

    public int getDiem() {
        return diem;
    }

    public void setDiem(int diem) {
        this.diem = diem;
    }
}
