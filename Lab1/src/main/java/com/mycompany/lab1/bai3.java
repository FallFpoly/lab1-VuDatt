

package com.mycompany.lab1;

import java.util.Scanner;

public class bai3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Nhap do dai khoi lap phuong: ");
        double canh = sc.nextDouble();

        
        double theTich = Math.pow(canh, 3);

       
        System.out.println("The tich khoi lap phuong la: " + theTich);

        sc.close();
    }
}