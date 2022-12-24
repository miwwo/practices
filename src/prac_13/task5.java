package prac_13;

import java.util.Scanner;

public class task5 {
    private String code;
    private String first3;
    private String second3;
    private String four;

    public task5(String number,int begin) {
        this.code = number.substring(begin, number.length() - 10);
        this.first3 = number.substring(number.length() - 10, number.length() - 7);
        this.second3 = number.substring(number.length() - 7, number.length() - 4);
        this.four = number.substring(number.length() - 4, number.length());
    }
    public task5() {}

    @Override
    public String toString() {
        return "number: " +
                "+" + code + '-' +
                first3 + '-' +
                second3 + '-' +
                four;
    }

    public static void main(String[] args) {
        String num;
        System.out.println("Enter the phone number: ");
        Scanner scanner = new Scanner(System.in);
        num = scanner.nextLine();
        task5 number1;
        if (num.charAt(0) == '+')
            number1 = new task5(num,1);
        else
            number1 = new task5(num,0);

        System.out.println(number1.toString());
    }
}
