/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication9;

import static java.lang.Math.sqrt;

/**
 *
 * @author PC
 */
public class PTB2 {
    public int a;
    public int b;
    public int c;
    public PTB2() {
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }
    public void show1(){
        System.out.printf("PT bậc 2: %dx^2 + %dx + %d = 0\n",a,b,c);
        System.out.println(tinhNghiem());
    }
    public double tinhNghiem(){
        double x = 0;
        int delta = b*b-4*a*c;
        if(delta<0){
            System.out.println("Phương trình vô nghiệm");
        }else if(delta==0){
            x = -b/(2*a);
            System.out.println("Phương trình có nghiệm duy nhất: ");
            
        }else{
            double canDelta = Math.sqrt(delta);
            double nghiem1 = (-b-canDelta)/2*a;
            double nghiem2 = (-b+canDelta)/2*a;
            System.out.println("Phương trình có 2 nghiệm phân biệt: x1 = "+nghiem1+", x2 = "+nghiem2);
        }
        return x;
    }
    
