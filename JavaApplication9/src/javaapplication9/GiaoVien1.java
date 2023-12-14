/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication9;

/**
 *
 * @author PC
 */
public class GiaoVien1 {
    public int maGV;
    public String tenGV;
    public int namSinh; 
    public int luongCB;
    public int soGioDay;
    public GiaoVien1(int maGV, String tenGV, int namSinh, int luongCB, int soGioDay) {
        this.maGV = maGV;
        this.tenGV = tenGV;
        this.namSinh = namSinh;
        this.luongCB = luongCB;
        this.soGioDay = soGioDay;
    }

    public GiaoVien1() {
    }

    public int getMaGV() {
        return maGV;
    }

    public void setMaGV(int maGV) {
        this.maGV = maGV;
    }

    public String getTenGV() {
        return tenGV;
    }

    public void setTenGV(String tenGV) {
        this.tenGV = tenGV;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public int getLuongCB() {
        return luongCB;
    }

    public void setLuongCB(int luongCB) {
        this.luongCB = luongCB;
    }

    public int getSoGioDay() {
        return soGioDay;
    }

    public void setSoGioDay(int soGioDay) {
        this.soGioDay = soGioDay;
    }
    
    public void hienThiThongTin(){
        System.out.println("Mã GV: "+maGV+" - Tên GV: "+tenGV+" - Tuổi: "+tinhTuoi()+" - Tổng lương: "+tinhLuong());
    }
    public int tinhTuoi(){
        return 2022 - namSinh;
    }
    public int tinhLuong(){
        return luongCB*soGioDay;
    }    
}
