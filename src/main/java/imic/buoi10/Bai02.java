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
        int c = timUCLN(a,b);
        int bcnn = a*b/c;
        return bcnn;
    }
    public static int findFibonacci(int n) {
        int F = 0;
        int a1 = 0; int a2 = 1;
        if (n == 1) F = 0; else if ( n == 2 ) F = 1;
        for (int i = 2; i < n; i++) {
            F = a1 + a2;
            a1 = a2;
            a2 = F;
        }
        return F;
    }
    public static void snt(int a) {
        int count = 0;
        for (int i = 1; i <= Math.sqrt(a); i++){
            if (a%i == 0){ count = count + 1;}
        }

    }
}