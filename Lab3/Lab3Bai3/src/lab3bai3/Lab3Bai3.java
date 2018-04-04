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
        int sodem = 0;
        int tong = 0;
        int a[] = new int[n];
        for(int i = 0; i< n ; i++){
            System.out.print("Nhap a["+i+"]=");
            a[i]= scanner.nextInt();
        }
        int Min = a[0];
        for(int k = 0; k < a.length; k++){
            Min = Math.min(Min, a[k]);
            if(a[k]%3==0){
              tong = tong + a[k];
              sodem++;  
            }   
        }
        System.out.println("So nho nhat trong mang la "+ Min);
        int tbc = tong/sodem;
        System.out.println("Trung binh cong cac phan tu chia het cho 3: "+ tbc );
        Arrays.sort(a);
        for(int j=0; j<= a.length;j++){
            System.out.println("Phan tu thu "+j+ " cua mang sau khi sap xep la " +a[j]);
        }
        
    }
    
}
