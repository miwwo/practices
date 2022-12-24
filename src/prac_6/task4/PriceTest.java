package prac_6.task4;

public class PriceTest {
    public static void main(String[] args) {
        Priceable drink = new Drink(100);
        Priceable Lays = new Chips(149);
        System.out.printf("drink and chipseki cost: %d", drink.getPrice() + Lays.getPrice());
    }
}
