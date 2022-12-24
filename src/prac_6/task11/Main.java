package prac_6.task11;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите градус(введите в формате десятичного числа):");
        Scanner scanner = new Scanner(System.in);
        Double gr = scanner.nextDouble();
        System.out.println("Во что перевести?");
        System.out.println("1 - по Цельсию");
        System.out.println("2 - пр Фаренгейту");
        Integer choose = scanner.nextInt();
        Celsius gradus = new Celsius(gr);
        Double new_gradus;
        switch (choose){
            case 1:
                new_gradus = gradus.convertK();
                System.out.println(gr + " = " + new_gradus);
                break;
            case 2:
                new_gradus = gradus.convertF();
                System.out.println(gr + " = " + new_gradus);
                break;
        }

    }
}
