/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4bai4;

import java.util.Scanner;

/**
 *
 * @author bang
 */
public class Lab4Bai4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SP sp2 = new SP();
        sp2.setTenSP("bag");
        sp2.setDonGia(5000000);
        sp2.setGiamGia(50);
        sp2.xuat();
    }
    
}

class SP {
    private String TenSP;
    private double DonGia;
    private double GiamGia;
    private double GetThueNhapKhau(){
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
    
    /*public SP(String TenSP, double DonGia, double GiamGia){
        this.TenSP = TenSP;
        this.DonGia = DonGia;
        this.GiamGia = GiamGia;
    }
    
    public SP(String TenSP, double DonGia){
        this(TenSP,DonGia,0);
    }*/
    
    public String getTenSP(){
        return this.TenSP;
    }
    public void setTenSP(String TenSP){
        this.TenSP = TenSP;
    }
    public double getDonGia(){
        return this.DonGia;
    }
    public void setDonGia(double dongia){
        this.DonGia = dongia;
    }
    public double getGiamGia(){
        return this.GiamGia;
    }
    public void setGiamGia(double GiamGia){
        this.GiamGia = GiamGia;
    }
}
