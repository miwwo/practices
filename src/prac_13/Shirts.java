package prac_13;

import java.util.StringTokenizer;

public class Shirts {
    private String s;
    private String title;
    private String color;
    private String size;

    public Shirts(String shirt) {
        String[] shirt_parts = shirt.split(",");
       /* StringTokenizer parts = new StringTokenizer(shirt, ",");*/
        this.s = shirt_parts[0];
        this.title = shirt_parts[1];
        this.color = shirt_parts[2];
        this.size =shirt_parts[3];
    }

    @Override
    public String toString() {
        return "shirt{" +
                "s='" + s + '\'' +
                ", title='" + title + '\'' +
                ", color='" + color + '\'' +
                ", size='" + size + '\'' +
                '}';
    }

    public static void main(String[] args) {
        String[] shirt = new String[11];
        shirt[0] = "S001,Black Polo Shirt,Black,XL";
        shirt[1] = "S002,Black Polo Shirt,Black,L";
        shirt[2] = "S003,Blue Polo Shirt,Blue,XL";
        shirt[3] = "S004,Blue Polo Shirt,Blue,M";
        shirt[4] = "S005,Tan Polo Shirt,Tan,XL";
        shirt[5] = "S006,Black T-Shirt,Black,XL";
        shirt[6] = "S007,White TShirt,White,XL";
        shirt[7] = "S008,White T-Shirt,White,L";
        shirt[8] = "S009,Green T-Shirt,Green,S";
        shirt[9] = "S010,Orange T-Shirt,Orange,S";
        shirt[10] = "S011,Maroon Polo Shirt,Maroon,S";
        Shirts[] shirts = new Shirts[11];
        for(int i = 0; i < 11; i++) {
            shirts[i] = new Shirts(shirt[i]);
            System.out.println(shirts[i]);
        }
    }
}
