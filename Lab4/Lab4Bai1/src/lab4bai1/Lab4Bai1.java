/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4bai1;

import java.util.Scanner;

/**
 *
 * @author bang
 */
public class Lab4Bai1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scn = new Scanner(System.in);
        SanPham sp = new SanPham();
        sp.nhap();
        sp.xuat();
    }
    
}

class SanPham {
    String TenSP;
    double DonGia;
    double GiamGia;
    public double GetThueNhapKhau(){
        return DonGia * 0.1;
    }
    public void nhap(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap ten sp:");
        TenSP = scanner.nextLine();
        System.out.print("Nhap don gia:");
        DonGia = scanner.nextDouble();
        System.out.print("Nhap phieu giam gia:");
        GiamGia = scanner.nextDouble();
    }
    public void xuat(){
        System.out.println("\nSanPham vua nhap:");
        System.out.println("Ten SanPham vua nhap:" + TenSP);
        System.out.println("Don Gia SanPham vua nhap:" + DonGia);
        System.out.println("Thue nhap khau SanPham vua nhap:" + GetThueNhapKhau());
        System.out.println("Giam gia SanPham vua nhap:" + GiamGia);
    }
}
