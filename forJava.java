/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.bilangan_ganjil;

import java.util.Scanner;

/**
 *
 * @author Ilhamstxr
 */
public class forJava {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("for bilangan ganjil");
        System.out.print("Masukkan bilangan : ");
        int n = s.nextInt();
        System.out.println("deret angka ganjil adalah :");
//        int counter = 1;
        for (int i = 1; i <= n; i += 2) {
            System.out.println(i + "");
        }
    }
}
