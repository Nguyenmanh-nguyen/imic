package ontap;

import java.util.Scanner;

public class Bai03 {
    public static void main(String[] args) {
        int age;
        boolean repeat = true;
            do{
                try {
                    Scanner scan = new Scanner(System.in);
                    String nage = scan.nextLine();
                    age = Integer.parseInt(nage);
                    repeat = false;

                    if (age > 9 && age < 51) {
                        System.out.println("Hoc vien co tuoi la: " + age);
                    } else {
                        System.out.println("Hoc vien khong thoa man dieu kien, lien he phong dao tao de tim hieu them.");
                    }
                } catch (Exception e) {
                    System.out.println("Something went wrong.");
                }
            } while (repeat = true);
    }
}