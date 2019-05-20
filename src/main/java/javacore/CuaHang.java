package javacore;

import java.util.Scanner;

public class CuaHang {
    public static void main(String[] args){
        Douong2[] meNu = new Douong2[3];
        meNu[0] = new TraSua();
        meNu[1] = new CaPhe();
        meNu[2] = new SoDa();
        for (Douong2 i : meNu) {
            System.out.println(i.toString());
        }

        Scanner scan = new Scanner(System.in);
        System.out.println("Moi nhap do uong da mua: ");
        String danhSach = scan.nextLine();
        Douong2[] dS = new Douong2[danhSach.length()];
        long tong = 0;
        for (int i = 0; i < danhSach.length(); i++) {
            char a = danhSach.charAt(i);
            switch (a) {
                case 'C':
                    dS[i] = new CaPhe();
                    break;
                case 'T':
                    dS[i] = new TraSua();
                    break;
                case 'S':
                    dS[i] = new SoDa();
                    break;
            }
            tong += dS[i].price;
        }
        System.out.println("Tong so tien la: " + tong);
    }
}
