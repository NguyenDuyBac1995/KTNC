package com.example.demo.Service;

import com.example.demo.Entity.NhanVien;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class NhanVienService {
    private List<NhanVien> nhanViens = new ArrayList<>();

    public  void  addNhanVien(NhanVien nhanVien){
        if(nhanVien == null){
            throw new IllegalArgumentException("NhanVien is not null");
        }
        else if(nhanVien.getMaNV() == null||nhanVien.getMaNV().trim().isEmpty()){
            throw new IllegalArgumentException("maNV khong duoc de trong");
        } else if (nhanVien.getTen() == null ||nhanVien.getTen().trim().isEmpty()) {
            throw new IllegalArgumentException("ten khong duoc de trong");
        }else if(nhanVien.getTuoi() < 18 || nhanVien.getTuoi() > 55){
            throw new IllegalArgumentException("tuoi khong duoc nho hon 18 va lon hon 55");
        }
        nhanViens.add(nhanVien);
    }

    public List<NhanVien> getAllSinhVien() {
        return nhanViens;
    }
}
