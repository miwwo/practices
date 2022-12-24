package prac_6.task_9;


import prac_6.task6_7_8.Book;
import prac_6.task6_7_8.Printable;
import prac_6.task6_7_8.Shop;

import java.util.ArrayList;

public class ArrayPrintable {
    public static void main(String[] args) {
        ArrayList<Printable> printal = new ArrayList<Printable>();

        Printable book1 = new Book("one", "oner", 1);
        Printable book2 = new Book("two", "doublelift", 2);
        Printable shop1 = new Shop(150, "shop1");
        Printable shop2 = new Shop(1530, "shop2");

        printal.add(book1);
        printal.add(book2);
        printal.add(shop1);
        printal.add(shop2);


        for (Printable thing : printal) {
            thing.print();
        }
    }
}
