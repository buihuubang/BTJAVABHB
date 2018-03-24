/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2bai3;

import java.util.Scanner;

/**
 *
 * @author bang
 */
public class Lab2Bai3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap vao so dien su dung thang nay: ");
        double dien = scanner.nextDouble();
        if(dien <= 50){
            double tien = dien * 1000;
            System.out.println("So tien phai tra:" + tien);
        } else {
            double tien = 50 * 1000 + (dien - 50) * 1200;
            System.out.println("So tien phai tra:" + tien);
        }
        
    }
    
}
