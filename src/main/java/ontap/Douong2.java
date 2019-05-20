package ontap;

public class Douong2 {
        char category;
        String name;
        int price;

        public Douong2(char category, String name, int price) {
            this.category = category;
            this.name = name;
            this.price = price;
        }
        public String toString(){
            return category + " | " + name + " | " + price + "K";
        }
    }
