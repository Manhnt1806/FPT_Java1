/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication12;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class JavaApplication12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.print("Xin mời nhập vào số n: ");
        int n = sc.nextInt();
        int i = 1;
        while(i<=n){
            if(i%2==0){
                System.out.println(i);
            }
            i++;
        }
//        System.out.print("Xin mời nhập a: ");
//        int a = sc.nextInt();
//        int i = 0;
//        System.out.println("Số chẵn nhỏ hơn a: ");
//        while(i<=a){
//            if(i%2==0){
//                System.out.println(i);
//            }
//            i++;
//        }
//        System.out.println("Xin mời nhập b: ");
//        int b = sc.nextInt();
//        int i = 0;
//        while(i<=b){
//            int c=0;
//            if(c%2==0){
//                System.out.println(c);
//            }
//            i++;
//        }
    }    
}
