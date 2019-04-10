package imic.buoi10;

import org.junit.Test;

public class Bai02Test {


    @Test
    public void timULN1() {
        int d = Bai02.timULN(15);
        assert ( d == 5);
        System.out.println("Uoc lon  nhat la: " + d);
        int c = Bai02.timULN(18);
        assert ( c == 9);
        System.out.println("Uoc lon  nhat la: " + c);
        int v = Bai02.timULN(30);
        assert ( v == 15);
        System.out.println("Uoc lon  nhat la: " + v);
    }

    @Test
    public void timUCLN() {
        int x = Bai02.timUCLN(33,30);
        System.out.println(x);
        int y = Bai02.timUCLN(1000,27);
        System.out.println(y);
    }

    @Test
    public void timBCNN() {
        int c = Bai02.timBCNN(15,24);
        System.out.println(c);
    }

    @Test
    public void findFibonacci() {
        int i = Bai02.findFibonacci(10);
        System.out.println(i);
        assert i == 34;
        i = Bai02.findFibonacci(6);
        System.out.println(i);
        assert i == 5;

    }
}