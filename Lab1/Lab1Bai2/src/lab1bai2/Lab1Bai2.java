/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1bai2;

import java.util.Scanner;

/**
 *
 * @author bang
 */
public class Lab1Bai2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chiều dài của hcn: ");
        int dai = scanner.nextInt();
        System.out.print("Nhập chiều rộng của hcn: ");
        int rong = scanner.nextInt();
        int chuvi = (dai + rong) * 2;
        int dientich = dai * rong;
        int canhnho = Math.min(dai, rong);
        System.out.print("CV HCN: " + chuvi + "\n" + "Diện tích HCN: " + dientich + "\n" + "Cạnh nhỏ nhất: " + canhnho + "\n");
    }
    
}
