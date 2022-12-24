package prac_6.task3;

public class TestNameable {
    public static void main(String[] args) {
        Nameable girls = new Girls("Masha");
        Nameable boys = new Boys("Pasha");
        System.out.printf("%s x %s", girls.getName(), boys.getName());
    }
}
