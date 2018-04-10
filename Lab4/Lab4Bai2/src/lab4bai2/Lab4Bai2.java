/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4bai2;

import java.util.Scanner;

/**
 *
 * @author bang
 */
public class Lab4Bai2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SP sp1 = new SP();
        SP sp2 = new SP();
        sp1.nhap();
        sp2.nhap();
        sp1.xuat();
        sp2.xuat();
    }
    
}

class SP {
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
