/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2bai4;

import static java.lang.Math.sqrt;
import java.util.Scanner;

/**
 *
 * @author bang
 */
public class Lab2Bai4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.println("+--------------------------+");
        System.out.println("1.Giai phuong trinh bac nhat");
        System.out.println("2.Giai phuong trinh bac hai");
        System.out.println("3.Tinh tien dien");
        System.out.println("4.Ket thuc");
        System.out.println("+--------------------------+");
        System.out.print("Chon chuc nang: ");
        int input = scanner.nextInt();
        switch(input){
            case 1:
                System.out.print("Nhap a:");
                double a = scanner.nextDouble();
                System.out.print("Nhap b:");
                double b = scanner.nextDouble();
                if (a == 0){
                    if(b == 0){
                        System.out.println("Phuong trinh co vo so nghiem");
                    } else {
                        System.out.println("Phuong trinh vo nghiem");
                    }
                } else {
                    double x = (-b)/a;
                    System.out.println("Phuong trinh " + a + "x " + "+ "+b+"= 0 co nghiem la " + x);
                }
                break;
            case 2:
                System.out.print("Nhap a:");
                double c = scanner.nextDouble();
                System.out.print("Nhap b:");
                double d = scanner.nextDouble();
                System.out.print("Nhap c:");
                double e = scanner.nextDouble();
                if (c == 0){
                    if (d == 0){
                        if(e == 0){
                            System.out.println("Phuong trinh co vo so nghiem");
                        } else {
                            System.out.println("Phuong trinh vo nghiem");
                        }
                    } else {
                        double x = (-e)/d;
                        System.out.println("Phuong trinh co nghiem la " + x);
                    }
                } else {
                    double delta = Math.pow(d, 2) - (4*c*e);
                    if (delta < 0 ){
                        System.out.println("Phuong trinh vo nghiem!");
                    } else if (delta == 0){
                        double x = (-d)/(2*c);
                        System.out.println("Phuong trinh co nghiem kep = " + x);
                    } else {
                        double x1 = (-d + sqrt(delta))/(2*c);
                        double x2 = (-d - sqrt(delta))/(2*c);
                        System.out.println("Phuong trinh co hai nghiem la "+ x1 + " va "+ x2);
                    }
                }
                break;
            case 3:
                System.out.print("Nhap vao so dien su dung thang nay: ");
                double dien = scanner.nextDouble();
                if(dien <= 50){
                    double tien = dien * 1000;
                    System.out.println("So tien phai tra:" + tien);
                } else {
                    double tien = 50 * 1000 + (dien - 50) * 1200;
                    System.out.println("So tien phai tra:" + tien);
                }
                break;
            case 4:
                System.exit(0);
        }
    }
    
}
