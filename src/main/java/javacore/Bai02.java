package javacore;

import java.util.Scanner;

public class Bai02 {
    public static void tinhTong(){
        int[] a = new int[10];
        int tong = 0;
        for( int i = 0; i < 10; i++){
            a[i] = (int)(Math.random()*99 + 1);
        }
        for(int i : a){ tong += i;}
        System.out.println("Tong la: " + tong);
    }
    public static void inDanhSach(){
        Scanner scan = new Scanner(System.in);
        String[] danhSach = new String[100];
        for (int  i = 0; i < 100; i++){
            danhSach[i] = scan.nextLine();
            scan.nextLine();
        }
        for (String i : danhSach) System.out.println(i);
    }
}
