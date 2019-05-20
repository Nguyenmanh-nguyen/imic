package ontap;

public class CuaHang {
    public static void main(String[] args) {
        Douong2[] meNu = new Douong2[3];
        meNu[0] = new TraSua();
        meNu[1] = new CaPhe();
        meNu[2] = new SoDa();
        for (Douong2 i : meNu) {
            System.out.println(i.toString());
        }

    }
}
