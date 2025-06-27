package com.example.demo.Service;

import com.example.demo.Entity.NhanVien;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NhanVienServiceTest {

    private NhanVienService nhanVienService;

    @BeforeEach
    void setUp() {
        nhanVienService = new NhanVienService();
    }


    @Test
    void addNhanVienWithValidNV() {
        NhanVien nhanVien = new NhanVien(1,"0012","Bac",24 , 200000.0F,10,"IT");
        nhanVienService.addNhanVien(nhanVien);
        assertEquals(1,nhanVienService.getAllSinhVien().size());
    }

    @Test
    void addNhanVienWithNull() {
        Exception exception = assertThrows(
                IllegalArgumentException.class, () -> nhanVienService.addNhanVien(null));
        assertEquals("NhanVien is not null", exception.getMessage());
    }


    @Test
    void addNhanVienWithInvalidMaNV() {
        Exception exception = assertThrows(
                IllegalArgumentException.class, () -> nhanVienService.addNhanVien(new NhanVien(1,"","Bac",24 , 200000.0F,10,"IT")));
        assertEquals("maNv must not be null or empty", exception.getMessage());
    }

    @Test
    void addNhanVienWithInvalidTen() {
        Exception exception = assertThrows(
                IllegalArgumentException.class, () -> nhanVienService.addNhanVien(new NhanVien(1,"0012","",24 , 200000.0F,10,"IT")));
        assertEquals("ten must not be null or empty", exception.getMessage());
    }

    @Test
    void addNhanVienWithInvalidAge(){
        Exception exception = assertThrows(
                IllegalArgumentException.class, () -> nhanVienService.addNhanVien(new NhanVien(1,"0012","Bac",10 , 200000.0F,10,"IT"))
        );
        assertEquals("tuoi must be between 18 and 55", exception.getMessage());
    }

    @Test
    void addSinhVienWithInvalidNamLamViec(){
        Exception exception = assertThrows(
                IllegalArgumentException.class, () -> nhanVienService.addNhanVien(new NhanVien(1,"0012","Bac",20 , 20000.0F,-10,"IT"))
        );
        assertEquals("soNamLamViec must not be negative", exception.getMessage());
    }

    @Test
    void addSinhVienWithInvalidPhongBan(){
        Exception exception = assertThrows(
                IllegalArgumentException.class, () -> nhanVienService.addNhanVien(new NhanVien(1,"0012","Bac",20 , 20000.0F,10,""))
        );
        assertEquals("phongBan must not be null or empty", exception.getMessage());
    }
}