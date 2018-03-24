/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1bai1;

import java.util.Scanner;

/**
 *
 * @author bang
 */
public class Lab1Bai1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập họ và tên của bạn: ");
        String ten = scanner.nextLine();
        System.out.print("Nhập điểm trung bình của bạn:");
        Double diemtb = scanner.nextDouble();
        System.out.println("Bạn "+ ten + " có điểm trung bình là: " + diemtb);
    }
    
}
