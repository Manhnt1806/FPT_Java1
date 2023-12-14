/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lad1;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Lad1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Xin mời nhập họ tên: ");
        String hoTen = sc.nextLine();
        System.out.print("Xin mời nhập điểm tb: ");        
        double diemTB = sc.nextDouble();
        System.out.println("Sinh viên: "+hoTen+" "+diemTB+" Điểm");
        System.out.print("Xin mời nhập chiều dài: ");
        int chieuDai = sc.nextInt();
        System.out.print("Xin mời nhập chiều rộng: ");
        int chieuRong = sc.nextInt();
        int chuVi = (chieuDai+chieuRong)*2;
        int dienTich = chieuDai*chieuRong;
        double canhNho = Math.min(chieuDai,chieuRong);
        System.out.println("Chu Vi HCN = "+chuVi+" - Diện Tích HCN = "+dienTich+" - Cạnh nhỏ nhất: "+canhNho);
        System.out.print("Xin mời nhập cạnh khối lập phương: ");
        int canh = sc.nextInt();
        double theTich = Math.pow(canh, 3);
        System.out.println("Thể tích là: "+theTich);
        System.out.println("Phương trình: ax^2+bx+c = 0");
        System.out.print("Xin mời nhập vào a: ");
        int a = sc.nextInt();
        System.out.print("Xin mời nhập vào b: ");
        int b = sc.nextInt();
        System.out.print("Xin mời nhập vào c: ");
        int c = sc.nextInt();
        double delta = Math.pow(b,2) - 4*a*c;
        double can2 = Math.sqrt(delta);
        System.out.println("Delta của phương trình bằng: "+delta+" - Căn Delta là: "+can2);   
    }    
}
