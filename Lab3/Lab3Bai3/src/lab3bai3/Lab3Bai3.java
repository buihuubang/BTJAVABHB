/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3bai3;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author bang
 */
public class Lab3Bai3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so phan tu cua mang:");
        int n = scanner.nextInt();
        int a[] = new int[n];
        for(int i = 0; i< n ; i++){
            System.out.print("Nhap a["+i+"]=");
            a[i]= scanner.nextInt();
        }
        Arrays.sort(a);
        for(int j=0; j<= a.length;j++){
            System.out.println("Phan tu thu "+j+ " cua mang sau khi sap xep la " +a[j]);
        }
    }
    
}
