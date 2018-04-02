/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3bai2;

import java.util.Scanner;

/**
 *
 * @author bang
 */
public class Lab3Bai2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap vao mot so bat ki:");
        int x = scanner.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(x +"*"+i+"="+ x*i);
        }
        System.out.println("Bang cuu chuong");
        
        for(int j = 1; j<=9 ; j++){
            for(int k = 1; k<=10 ; k++){
                System.out.println(j + "*" + k + "=" + j*k);
            }
        }
    }
    
}
