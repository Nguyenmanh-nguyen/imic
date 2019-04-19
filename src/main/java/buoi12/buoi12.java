package buoi12;

public class buoi12
{

    public static void inGiaTriTuyetDoi(double[] a){
        for(double i : a ){
            System.out.println(Math.abs(i));
        }
    }

    public static void inGiaTriTran(double[] a){
        for(double i : a ){
            System.out.println(Math.ceil(i));
        }
    }

    public static void inGiaTriSan(double[] a){
        for(double i : a ){
            System.out.println(Math.floor(i));
        }
    }

    public static void inGiaTriLamTron(double[] a){
        for(double i : a ){
            System.out.println(Math.round(i));
        }
    }

    public static double timMin(double[] a){
        double min = a[0];
        for(double i : a ){
            if ( min > i) min = i;
        }
        return min;
    }

    public static void inCanBacHai(double[] a){
        for(double i : a ){
            if ( i > 0 ) System.out.println(Math.sqrt(i));
        }
    }
    public static void inSoNgauNhien(double[] a){

    }


}
