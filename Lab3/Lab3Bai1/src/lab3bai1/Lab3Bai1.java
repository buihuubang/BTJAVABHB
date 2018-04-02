/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3bai1;

import java.util.Scanner;

/**
 *
 * @author bang
 */
public class Lab3Bai1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap vao mot so bat ki: ");
        int a = scanner.nextInt();
        boolean check = true;
        for(int i = 2; i < a-1 ; i++){
            if( a % i == 0){
                check = false;
                break;
            }
            i++;
        }
        System.out.println(check);
    }
    
}
