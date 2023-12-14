/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication9;

/**
 *
 * @author PC
 */
public class hinhChuNhat {
    public int dai;
    public int rong;
    public hinhChuNhat() {
    }

    public int getDai() {
        return dai;
    }

    public void setDai(int dai) {
        this.dai = dai;
    }

    public int getRong() {
        return rong;
    }

    public void setRong(int rong) {
        this.rong = rong;
    }
    public void show(){
        System.out.println("Chiều dài hcn: "+dai+" - Chiều rộng hcn: "+rong+"\nDiện tích: "+dienTich()+" - Chu vi: "+chuVi());
    }
    public int dienTich(){
        return dai*rong;
    }
    public int chuVi(){
        return (dai+rong)*2;
    }
}
