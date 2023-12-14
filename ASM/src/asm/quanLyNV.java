/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package asm;

import java.util.ArrayList;

/**
 *
 * @author PC
 */
public class quanLyNV {
    public ArrayList<nhanVien> list;
//    ArrayList<nhanVien> list = new ArrayList<>();
    quanLyNV qlnv = new quanLyNV();
    
    public quanLyNV() {
    }
    public quanLyNV(ArrayList<nhanVien> list) {
        this.list = list;
    }
    public void themNV(nhanVien nv){
        list.add(nv);
    }
    public void xuatNV(){
        for(nhanVien nv: list){
            System.out.println(nv);
        }
    }    
}
