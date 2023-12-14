/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication15;

/**
 *
 * @author PC
 */
public class conNguoi {
    public String hoTen;
    public int namSinh;

    public conNguoi() {
    }

    public conNguoi(String hoTen, int namSinh) {
        this.hoTen = hoTen;
        this.namSinh = namSinh;
    }
    public int tinhTuoi(){
        return 2022-namSinh;
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
    
    public void inThongTin(){
        System.out.print("Họ tên: "+hoTen+" - Tuổi: "+tinhTuoi());
    }
    
}
