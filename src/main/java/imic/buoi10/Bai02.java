package imic.buoi10;

public class Bai02 {
    public static int timULN(int N) {
        int uln = 1;
        for (int i = 1; i < N; i++) {
            if (N % i == 0) {
                if (i > uln) {
                    uln = i;
                }
            }
        }
        return uln;
    }

    public static int timUCLN(int a, int b) {
        while (a != b) {
            if (a > b) a = a - b;
            else b = b - a;
        }
        return a;
    }

    public static int timBCNN(int a, int b) {
        int c = timUCLN(a, b);
        int bcnn = a * b / c;
        return bcnn;
    }

    public static int findFibonacci(int n) {
        int F = 0;
        int a1 = 0;
        int a2 = 1;
        if (n == 1) F = 0;
        else if (n == 2) F = 1;
        for (int i = 2; i < n; i++) {
            F = a1 + a2;
            a1 = a2;
            a2 = F;
        }
        return F;
    }
    public static boolean snt(int a) {
        for (int i = 2; i <= Math.sqrt(a); i++){
            if (a%i == 0) return false;
        }
        return true;
    }
     public static void sntn(int n) {
        boolean t;
        for (int i = n - 1; i > 0 ; i--){
            t = snt(i);
            if (t == true) System.out.println(i);
        }
    }
    public static void phanTich(int b) {
        int count = 0;
        int c = b;
        int[] a = new int[b];
        for (int i = 2; i <= c ; i++){
            if (c%i == 0){ 
                a[count] = i;
                count++;
                c = c/i;
                i -= 1;
            }
        if (count >= 1) System.out.println(a + " khong la so nguyen to");
        else System.out.println(a + " la so nguyen to");
        }
        System.out.print(b + " = ");
        for (int i = 0; i < count - 1; i++) System.out.print(a[i] + " x ");
        System.out.print(a[count - 1]);
    }
    public static int tongChuSo(int a){
        int tong = 0;
        int t = 0;
        while (a != 0){
            t = a%10;
            tong += t;
            a = a/10;
        }
        return tong;
    }
    public static boolean soThuanNghich(int b) {
        int soNghich = 0;
        int i;
        int a = b;
        while (a != 0){
            i = a % 10;
            a = a/10;
            soNghich = soNghich*10 + i;
        }
        if (b == soNghich) return true;
        return false;
	    }
    
}
