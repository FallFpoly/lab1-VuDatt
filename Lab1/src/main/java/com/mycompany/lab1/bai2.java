

package com.mycompany.lab1;

import java.util.Scanner;


public class bai2 {

   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Nhap chieu dai: ");
        double chieuDai = sc.nextDouble();

        System.out.print("Nhap chieu rong: ");
        double chieuRong = sc.nextDouble();

        
        double chuVi = (chieuDai + chieuRong) * 2;

        
        double dienTich = chieuDai * chieuRong;

        
        double canhNho = Math.min(chieuDai, chieuRong);

        
        System.out.println("Chu vi hinh chu nhat la: " + chuVi);
        System.out.println("Dien tich hinh chu nhat la: " + dienTich);
        System.out.println("Canh nho hon la : " + canhNho);

        sc.close();
    }
}