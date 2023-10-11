/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.perulangan_bersaranga;

import java.util.Scanner;

/**
 *
 * @author Ilhamstxr
 */
public class Perulangan_bersaranga {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Masukkan angka : ");
        int a = s.nextInt();

//        for loop
//        for (int i = 1; i <= a; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print(j + " ");
//            }
//            System.out.println("");
//        }
//        while loop
//        int i,j = 1;
//        while (a >= i) {
//            while (i >= j) {
//                System.out.print(j + " ");
//                j++;
//            }
//            j = 1;
//            System.out.println(" ");
//            i++;
//        }
// do while loop

//        contoh 1
//        int i = 0;
//        int j;
//        do {
//            j = 0;
//            i++;
//            System.out.println(" ");
//            do {
//                j++;
//                System.out.print(j + " ");
//            } while (i > j);
//        } while (a > i);

//contoh 2
        int i = 1;
        int j = 1;
        do {
            do {
                System.out.print(j + " ");
                j++;
            } while (i >= j);

            System.out.println(" ");
            j = 1;
            i++;
        } while (a >= i);
    }
}
