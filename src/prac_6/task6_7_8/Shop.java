package prac_6.task6_7_8;

public class Shop implements Printable {
    private int cart_cost;
    private String shop_name;

    public Shop(int cart_cost, String shop_name) {
        this.cart_cost = cart_cost;
        this.shop_name = shop_name;
    }

    @Override
    public void print() {
        System.out.println(shop_name + " cart total cost: " + cart_cost);
    }
}
