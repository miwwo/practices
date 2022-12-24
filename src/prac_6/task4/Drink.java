package prac_6.task4;

public class Drink implements Priceable{
    private int price;

    public Drink(int price) {
        this.price = price;
    }

    @Override
    public int getPrice() {
        return price;
    }
}
