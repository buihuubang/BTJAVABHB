/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2bai2;

import static java.lang.Math.sqrt;
import java.util.Scanner;

/**
 *
 * @author bang
 */
public class Lab2Bai2 {

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
        if (a == 0){
            if (b == 0){
                if(c == 0){
                    System.out.println("Phuong trinh co vo so nghiem");
                } else {
                    System.out.println("Phuong trinh vo nghiem");
                }
            } else {
                double x = (-c)/b;
                System.out.println("Phuong trinh co nghiem la " + x);
            }
        } else {
            double delta = Math.pow(b, 2) - (4*a*c);
            if (delta < 0 ){
                System.out.println("Phuong trinh vo nghiem!");
            } else if (delta == 0){
                double x = (-b)/(2*a);
                System.out.println("Phuong trinh co nghiem kep = " + x);
            } else {
                double x1 = (-b + sqrt(delta))/(2*a);
                double x2 = (-b - sqrt(delta))/(2*a);
                System.out.println("Phuong trinh co hai nghiem la "+ x1 + " va "+ x2);
            }
        }
    }
    
}
