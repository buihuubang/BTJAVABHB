/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1bai4;

import java.util.Scanner;

/**
 *
 * @author bang
 */
public class Lab1Bai4 {

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
        System.out.print("Nhap c:");
        double c = scanner.nextDouble();
        double delta = Math.pow(b, 2) - (4*a*c);
        System.out.println("Phuong trinh " + a +"x2 + "+ b +"x + " + c + " = 0 co Delta = " + delta);
    }
    
}
