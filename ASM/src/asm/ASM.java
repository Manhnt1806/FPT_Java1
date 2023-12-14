/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package asm;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author PC
 */
public class ASM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ASM a = new ASM();
        a.menu();
    }
    ArrayList<nhanVien> listNV = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    public void menu() {
        int luaChon = 0;
        do {
            System.out.println("-----------------------------------------------------------");
            System.out.println("| 1. Nhập danh sách nhân viên từ bàn phím.                 |");
            System.out.println("| 2. Xuất danh sách nhân viên ra màn hình.                 |");
            System.out.println("| 3. Tìm và hiển thị nhân viên theo mã nhập từ bàn phím.   |");
            System.out.println("| 4. Xóa nhân viên theo mã nhập từ bàn phím.               |");
            System.out.println("| 5. Cập nhật thông tin nhân viên theo mã nhập từ bàn phím.|");
            System.out.println("| 6. Tìm các nhân viên theo khoảng lương nhập từ bàn phím. |");
            System.out.println("| 7. Sắp xếp nhân viên theo họ và tên.                     |");
            System.out.println("| 8. Sắp xếp nhân viên theo thu nhập.                      |");
            System.out.println("| 9. Xuất 5 nhân viên có thu nhập cao nhất.                |");
            System.out.println("| 0. Thoát                                                 |");
            System.out.println("-----------------------------------------------------------");
            System.out.println(">>CHỌN CHỨC NĂNG<<");
            luaChon = Integer.parseInt(sc.nextLine());
            switch (luaChon) {
                case 1:
                    System.out.println("Nhập vào tên: ");
                    String tenNV = sc.nextLine();
                    System.out.println("Nhập vào điểm: ");
                    double luongNV = Double.parseDouble(sc.nextLine());
                    nhanVien nv1 = new nhanVien(tenNV, luongNV);
                    qlnv.themNV(nv1);
                    break;
                case 2:
                    qlnv.xuatNV();
                    break;
                case 3:
                    System.out.println("Nhập vào tên sinh viên cần sửa: ");
                    String tenSua = sc.nextLine();
                    System.out.println("Nhập vào tên sinh viên mới: ");
                    String tenSVmoi = sc.nextLine();
                    System.out.println("Nhập vào điểm sinh viên mới: ");
                    double diemSVmoi = Double.parseDouble(sc.nextLine());
                    SVPoly svNew = new SVPoly(tenSVmoi, diemSVmoi);
//                    qlsv.suaSVtheoTen(tenSua, svNew);
                    break;
                case 4:
                    xoaNV();
                    break;
                case 5:
                    capNhatNV();
                    break;
                case 6:
                    timNV();
                    break;
                case 7:
                    sapXepHT();
                    break;
                case 8:
                    sapXepTN();
                    break;
                case 9:
                    xuat5NV();
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Vui lòng chọn lại");
                    break;
            }
        } while (luaChon >= 0 && luaChon < 10);
    }

    public static void hienThinv() {
        System.out.println("Tìm Nhân Viên");
    }

    public static void xoaNV() {
        System.out.println("Sắp xếp nhân viên");
    }

    public static void capNhatNV() {
        System.out.println("5 nhân viên có thu nhập cao nhất");
    }

    public static void timNV() {
        System.out.println("Thông tin mỗi nhân viên");
    }

    public static void sapXepHT() {
        System.out.println("Sắp xếp nhân viên theo họ và tên.");
    }

    public static void sapXepTN() {
        System.out.println("Sắp xếp nhân viên theo thu nhập.");
    }

    public static void xuat5NV() {
        System.out.println("Xuất 5 nhân viên có thu nhập cao nhất.");
    }
}
