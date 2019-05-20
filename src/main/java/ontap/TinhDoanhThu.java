package ontap;


public class TinhDoanhThu {

    public static double tinhDoanhThu(String daban){
        double  tong = 0;
        Douong2[] dS = new Douong2[daban.length()];
        char[] a = daban.toCharArray();
        for(int i = 0; i < daban.length(); i++){
            char c = a[i];
            switch (c){
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
        return tong;
    }
}
