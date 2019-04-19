package imic.buoi10;

import java.util.Scanner;

public class Bai06 {

    public static double getRamdomDouble(double min, double max){
        double x = (Math.random()*((max - min) + 1)) + min;
        return x;
    }
    public static int getRamdomInt(int min, int max){
        int a = (int) ((Math.random()*((max - min) + 1)) + min);
        return a;
    }
    public static double giaTriGa(){
        double trongLuong = getRamdomDouble(3,5);
        int sanLuongTrung = getRamdomInt(30,50);
        double gtGa = trongLuong*10 + sanLuongTrung*1.0/10;
        return gtGa;
    }
    public static double giaTriBo(){
        double trongLuong = getRamdomDouble(300,500);
        double sanLuongSua = getRamdomDouble(100,110);
        double gtBo = trongLuong*10 + sanLuongSua*1.0;
        return gtBo;
    }
    public static double giaTriCuu(){
        double trongLuong = getRamdomDouble(100,150);
        double sanLuongLong = getRamdomDouble(50,60);
        double gtCuu = trongLuong*10 + sanLuongLong*5.0;
        return gtCuu;
    }
    public static double giaTriDe(){
        double trongLuong = getRamdomDouble(100,150);
        double sanLuongSua = getRamdomDouble(50,60);
        double gtDe = trongLuong*10 + sanLuongSua*5.0;
        return gtDe;
    }
    public static void main (String  [] args){

     Scanner scan = new Scanner(System.in);
        String iD = scan.nextLine();

    }
}
