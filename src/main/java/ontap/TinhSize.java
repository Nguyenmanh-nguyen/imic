package ontap;

public class TinhSize {
    public double tinhThem(String size){
        double tongThem = 0;
        for (int i = 0; i < size.length(); i++){
            char a = size.charAt(i);
            switch (a){
                case 'S':
                    break;
                case 'M':
                    tongThem += 5;
                    break;
                case 'L':
                    tongThem += 10;
                    break;
            }
        }
        return tongThem;
    }
}
