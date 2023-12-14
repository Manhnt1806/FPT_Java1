/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication10;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class JavaApplication10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Xin mời nhập điểm hệ số 4: ");
        int diem = sc.nextInt();
        if(diem==1){
            System.out.println("Yếu");
        }else if(diem==2){
            System.out.println("Trung Bình");
        }else if(diem==3){
            System.out.println("Khá");
        }else if(diem==4){
            System.out.println("Giỏi");
        }else{
            System.out.println("Điểm không hợp lệ");
        }
        System.out.println("Xin mời nhập tháng");
        int thang = sc.nextInt();
        System.out.println("Xin mời nhập năm");
        int nam = sc.nextInt();
        if(thang==1||thang==3||thang==5||thang==7||thang==8||thang==10||thang==12){
            System.out.println("Tháng " +thang+" năm "+nam+" có 31 ngày");
        }else if(thang==4||thang==6||thang==9||thang==11){
            System.out.println("Tháng " +thang+" năm "+nam+" có 30 ngày");
        }else if(thang==2){
            if((nam%4==0 && nam%100!=0) || (nam%400==0)){
                System.out.println("Tháng " +thang+" năm "+nam+" có 29 ngày");
            }else{
                System.out.println("Tháng " +thang+" năm "+nam+" có 28 ngày");
            }
        }else{
            System.out.println("Tháng không hợp lệ!");
        }
    }    
}
