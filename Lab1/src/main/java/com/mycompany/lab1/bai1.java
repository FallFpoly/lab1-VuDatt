

package com.mycompany.lab1;

import java.util.Scanner;


public class bai1 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        
        System.out.print("Nhap ho ten sinh vien: ");
        String hoten = sc.nextLine();

        
        System.out.print("Nhap diem trung binh: ");
        double diemTB = sc.nextDouble();

        
        System.out.println("<<" + hoten + ">> <<" + diemTB + ">> diem");

        
        sc.close();
    }
}
