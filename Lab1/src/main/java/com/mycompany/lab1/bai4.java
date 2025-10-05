
package com.mycompany.lab1;

import java.util.Scanner;


public class bai4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap  a: ");
        double a = sc.nextDouble();

        System.out.print("Nhap  b: ");
        double b = sc.nextDouble();

        System.out.print("Nhap c: ");
        double c = sc.nextDouble();

        
        double delta = b * b - 4 * a * c;

        System.out.println("Delta = " + delta);

        if (delta < 0) {
            System.out.println("Delta am khong tinh duoc can delta");
        } else {
           
            double canDelta = Math.sqrt(delta);
            System.out.println("Can delta = " + canDelta);
        }

        sc.close();
    }
}