/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication13;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class JavaApplication13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);   
        menu();
        int luaChon = sc.nextInt();
        switch(luaChon){
            case 1:
                chanLe();
            break;
            case 2:
                tinhTong();
            break;
            case 3:
                soHoanHao();
            break;
            case 0:
                System.exit(0);
            break;
            default:
                System.out.println("Vui lòng chọn lại");
            break;
            }     
    }
    public static void menu(){
        System.out.println("---------------------------");
        System.out.println("| 1. Kiểm tra chẵn lẻ      |");
        System.out.println("| 2. Tính tổng             |");
        System.out.println("| 3. Kiểm tra số hoàn hảo  |");
        System.out.println("| 0. Thoát                 |");
        System.out.println("---------------------------");
        System.out.println(">>CHỌN CHỨC NĂNG<<");
}
    public static void chanLe(){
        System.out.println("Xin mời nhập số: ");
        Scanner sc = new Scanner(System.in); 
        int a = sc.nextInt();
        if(a%2==0){
            System.out.println("Đây là số chẵn");
        }else{
            System.out.println("Đây là số lẻ");
        }
    }
    public static void tinhTong(){
        System.out.println("Xin mời nhập a: ");
        Scanner sc = new Scanner(System.in); 
        int a = sc.nextInt();
        System.out.println("Xin mời nhập b: ");
        int b = sc.nextInt();
        int tong = a+b;
        System.out.println("Tổng là: "+tong);
    }
    public static void soHoanHao(){
        System.out.println("Xin mời nhập số: ");
        Scanner sc = new Scanner(System.in); 
        double a = sc.nextDouble();
        double tong = 0;
        for(int i=0; i<a; i++){
            if(a%i==0){
                tong += i;
            }
        }
        if(tong==a){
            System.out.println("Đây là số hoàn hảo");
        }else{
            System.out.println("Đây không là số hoàn hảo");
        }
    }
}
