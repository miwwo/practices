package prac_6.task6_7_8;

public class Test {
    public static void main(String[] args) {
        Printable shop = new Shop(1000, "Pyatorochka");
        Printable book = new Book("Voina i Mir", "Tolstoi", 9999);
        shop.print();
        book.print();
    }
}
