package prac_6.task4;

public class Chips implements Priceable{
    private int price;

    public Chips(int price) {
        this.price = price;
    }

    @Override
    public int getPrice() {
        return price;
    }
}
