package com.example.demo.Entity;

public class NhanVien {
    private int id;
    private String maNV;
    private String ten;
    private int tuoi;
    private float luong;
    private int soNamLamViec;
    private String phongBan;

    public NhanVien(int id, String maNV, String ten, int tuoi, float luong, int soNamLamViec, String phongBan) {
        this.id = id;
        setMaNV(maNV);
        setTen(ten);
        setTuoi(tuoi);
        setLuong(luong);
        setSoNamLamViec(soNamLamViec);
        setPhongBan(phongBan);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        if(maNV == null || maNV.isEmpty() || maNV.trim().equals("")){
            throw  new  IllegalArgumentException(
                    "maNv must not be null or empty"
            );
        }
        this.maNV = maNV;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        if(ten == null || ten.isEmpty() || ten.trim().equals("")){
            throw  new  IllegalArgumentException(
                    "ten must not be null or empty"
            );
        }
        this.ten = ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        if(tuoi < 18 || tuoi > 55){
            throw  new  IllegalArgumentException(
                    "tuoi must be between 18 and 55"
            );
        }
        this.tuoi = tuoi;
    }

    public float getLuong() {
        return luong;
    }

    public void setLuong(float luong) {
        if(luong < 0.0){
            throw  new  IllegalArgumentException(
                    "luong must not be negative"
            );
        }
        this.luong = luong;
    }

    public int getSoNamLamViec() {
        return soNamLamViec;
    }

    public void setSoNamLamViec(int soNamLamViec) {
        if(soNamLamViec < 0){
            throw  new  IllegalArgumentException(
                    "soNamLamViec must not be negative"
            );
        }
        this.soNamLamViec = soNamLamViec;
    }

    public String getPhongBan() {
        return phongBan;
    }

    public void setPhongBan(String phongBan) {
        if(phongBan == null || phongBan.isEmpty() || phongBan.trim().equals("")){
            throw  new  IllegalArgumentException(
                    "phongBan must not be null or empty"
            );
        }
        this.phongBan = phongBan;
    }

    @Override
    public String toString() {
        return "NhanVien{" +
                "id=" + id +
                ", maNV='" + maNV + '\'' +
                ", ten='" + ten + '\'' +
                ", tuoi=" + tuoi +
                ", luong=" + luong +
                ", soNamLamViec=" + soNamLamViec +
                ", phongBan='" + phongBan + '\'' +
                '}';
    }
}
