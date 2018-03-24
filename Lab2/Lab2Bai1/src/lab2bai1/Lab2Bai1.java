/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2bai1;

import java.util.Scanner;

/**
 *
 * @author bang
 */
public class Lab2Bai1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
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
    }
    
}
