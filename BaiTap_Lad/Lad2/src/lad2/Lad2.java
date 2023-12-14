/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lad2;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Lad2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        menu();
        int luaChon = sc.nextInt();
        switch(luaChon){
            case 1:
                PTbac1();
            break;
            case 2:
                PTbac2();
            break;
            case 3:
                tienDien();
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
        System.out.println("---------------------------------");
        System.out.println("| 1. Giải phương trình bậc nhất  |");
        System.out.println("| 2. Giải phương trình bậc hai   |");
        System.out.println("| 3. Tính tiền điện              |");
        System.out.println("| 0. Thoát                       |");
        System.out.println("---------------------------------");
        System.out.println(">>CHỌN CHỨC NĂNG<<");
    }
    public static void PTbac1(){
        System.out.println("Phương trình: ax + b = 0");
        Scanner sc = new Scanner(System.in);
        System.out.println("Xin mời nhập a: ");
        float a = sc.nextFloat();
        System.out.println("Xin mời nhập b: ");
        float b = sc.nextFloat();
        if(a==0){
            System.out.println("Phương trình vô nghiệm");
        }else{
            if(b==0){
                System.out.println("Phương trình có vô số nghiệm");
            }else{
                float nghiem = -b/a;
                System.out.println("Phương trình có nghiệm là: "+nghiem);
            }
        }
    }
    public static void PTbac2(){
        System.out.println("Phương trình: ax^2 + bx + c = 0");
        Scanner sc = new Scanner(System.in);
        System.out.println("Xin mời nhập a: ");
        float a = sc.nextFloat();
        System.out.println("Xin mời nhập b: ");
        float b = sc.nextFloat();
        System.out.println("Xin mời nhập c: ");
        float c = sc.nextFloat();
        float delta = b*b - 4*a*c;
        if(delta==0){
            float nghiem = -b/(2*a);
            System.out.println("Phương trình có nghiệm duy nhất: "+nghiem);
        }else if(delta<0){
            System.out.println("Phương trình vô nghiệm!");
        }else{
            float canDelta = (float) Math.sqrt(delta);
            float nghiem1 = (-b - canDelta)/(2*a);
            float nghiem2 = (-b + canDelta)/(2*a);
            System.out.println("Phương trình có 2 nghiệm phân biệt x1 = "+nghiem1+"; x2 = "+nghiem2);
        }    
    }
    public static void tienDien(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Xin mời nhập số điện: ");
        float soDien = sc.nextFloat();
        float tienDien = 0;
        if(soDien<0){
            System.out.println("Số điện không đúng");
        }if(soDien>=0&&soDien<=50){
            tienDien = soDien*1000;
        }else{
            tienDien = 50*1000 + (soDien - 50)*1200;
        }
    }    
}
