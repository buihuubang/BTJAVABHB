/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3bai4;

import java.util.Scanner;

/**
 *
 * @author bang
 */
public class Lab3Bai4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so luong sinh vien:");
        int n = Integer.parseInt(scanner.nextLine());
        String a[] = new String[n];
        double b[] = new double[n];
        for(int i=0;i<n;i++){
            System.out.print("\nNhap ho ten sv:");
            a[i] = scanner.nextLine();
            System.out.print("Nhap vao diem sv "+ a[i] +":");
            b[i] = Double.parseDouble(scanner.nextLine());
        }
        for(int j = 0; j < n; j++){
            if(b[j]<5){
                System.out.println("\nBan "+ a[j] +" voi muc diem "+ b[j] +" co hoc luc Yeu!");
            } else if(b[j]>=5 && b[j]<6.5){
                System.out.println("\nBan "+ a[j] +" voi muc diem "+ b[j] +" co hoc luc Trung Binh!");
            } else if(b[j]>=6.5 && b[j] < 7.5){
                System.out.println("\nBan "+ a[j] +" voi muc diem "+ b[j] +" co hoc luc Kha!");
            } else if(b[j]>=7.5 && b[j]<9){
                System.out.println("\nBan "+ a[j] +" voi muc diem "+ b[j] +" co hoc luc Gioi!");
            } else {
                System.out.println("\nBan "+ a[j] +" voi muc diem "+ b[j] +" co hoc luc Xuat Sac!");
            }
        }
    }
    
}
