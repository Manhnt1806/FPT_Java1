/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication15;

/**
 *
 * @author PC
 */
public class sinhVien extends conNguoi {
    public String maSV;

    public sinhVien() {
    }

    public sinhVien(String maSV) {
        this.maSV = maSV;
    }

    public sinhVien(String maSV, String hoTen, int namSinh) {
        super(hoTen, namSinh);
        this.maSV = maSV;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }
    
    public void inThongTinSV(){
        inThongTin();
        System.out.println(" - Mã Sinh viên: "+maSV);
    }
}
