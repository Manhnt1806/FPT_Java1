/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package asm;

/**
 *
 * @author PC
 */
public class nhanVien {
    public int maNV;
    public String tenNV;
    public int luongNV;

    public nhanVien() {
    }

    public nhanVien(int maNV, String tenNV, int luongNV) {
        this.maNV = maNV;
        this.tenNV = tenNV;
        this.luongNV = luongNV;
    }
    
    public int getMaNV() {
        return maNV;
    }

    public void setMaNV(int maNV) {
        this.maNV = maNV;
    }

    public String getTenNV() {
        return tenNV;
    }

    public void setTenNV(String tenNV) {
        this.tenNV = tenNV;
    }

    public int getLuongNV() {
        return luongNV;
    }

    public void setLuongNV(int luongNV) {
        this.luongNV = luongNV;
    }
    @Override
    public String toString() {
        return "Mã nhân viên: "+maNV+" - Nhân viên: " + tenNV + " - Thu nhập: " +luongNV;
    }

}

