/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1bai3;

import java.util.Scanner;

/**
 *
 * @author bang
 */
public class Lab1Bai3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in); 
        System.out.print("Nhập cạnh của khối lập phương: ");
        double canh = scanner.nextDouble();
        double thetich = Math.pow(canh, 3);
        System.out.println("The tich cua khoi lap phuong la: " + thetich);
    }
    
}
