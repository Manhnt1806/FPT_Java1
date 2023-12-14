/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab3;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Lab3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int luaChon=0;
        do{
            System.out.println("---------------------------------------");
            System.out.println("| 1. Kiểm tra số nguyên tố             |");
            System.out.println("| 2. Bảng cửu chương                   |");
            System.out.println("| 3. Nhập mảng số nguyên từ bàn phím.  |");
            System.out.println("| 4. Họ tên và điểm của sinh viên.     |");
            System.out.println("| 0. Thoát                             |");
            System.out.println("---------------------------------------");
            System.out.println(">>CHỌN CHỨC NĂNG<<");
            luaChon=sc.nextInt();
            switch(luaChon){
            case 1:
                kiemTraSoNguyenTo();
            break;
            case 2:
                bangCuuChuong();
            break;
            case 3:
                mangSoNguyen();
            break;
            case 4:
                SV();
            break;
            case 0:
                System.exit(0);
            break;
            default:
                System.out.println("Vui lòng chọn lại");
            break;
            }
        }while(luaChon>=0&&luaChon<5);
        // TODO code application logic here
    }
    public static void kiemTraSoNguyenTo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Xin mời nhập vào số: ");
        int a = sc.nextInt();
        for(int i=2; i < a-1; i++){ 
            if(a % i == 0){
                System.out.println("Đây không là số nguyên tố");
                break;
            }
            i++;
        }
        System.out.println("Đây là số nguyên tố");
    }
    public static void bangCuuChuong(){
        for(int a=1; a<=9; a++){
            for(int i=1; i<=10; i++){
                System.out.printf("%d x %d = %d", a, i, a*i);
                System.out.println();
            }
            System.out.println("\n");
        }
    }
    public static void mangSoNguyen(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Xin mời nhập số phần tử mảng: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0; i<n; i++){
            System.out.printf("Xin mời nhập vào phần tử thứ %d: ", i+1);
            a[i] = sc.nextInt();
        }
        int Min = a[0];
        Arrays.sort(a);
        System.out.println("Sắp xếp: ");
        for(int i=0; i<n; i++){
            System.out.println(a[i]);
            Min = Math.min(Min, a[i]);
        }
        System.out.println("Số nhỏ nhất là: "+Min);
        int tong = 0;
        int b = 0;
        for (int i=0; i<n; i++){
            if(a[i]%3==0){
            tong += a[i];
            b++;
            }   
        } 
        int TBC = tong/b;
        System.out.println("Trung bình cộng các số chia hết cho 3 là: "+ TBC );
    }
    public static void SV () {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời nhập số sinh viên: ");
        int SV = sc.nextInt();
        sc.nextLine();
        String[] hoTenSV = new String [SV];
        float diemSV[]=new float[SV];
        for(int i=0; i<SV; i++){
            System.out.printf("Mời nhập tên cho sinh viên thứ %d: ", i+1);
            hoTenSV[i]= sc.nextLine();
            System.out.printf("Nhập điểm cho sinh viên thứ %d: ",i+1 );
                diemSV[i]= sc.nextFloat();
                sc.nextLine();
        }
        System.out.println("sinh viên: ");
        for(int i=0; i<SV; i++){
            System.out.println(hoTenSV[i]);
            System.out.println(diemSV[i]);
            if(diemSV[i]<5){
                System.out.println("Yếu");
            } 
            else if (diemSV[i]<6.5){
                System.out.println("Trung Bình");
            }else if (diemSV[i]<7.5){
                System.out.println("Khá");
            }else if (diemSV[i]<9){
                System.out.println("Giỏi");
            }else{
                System.out.println("Xuất sắc");
            }
        }
    }
}
