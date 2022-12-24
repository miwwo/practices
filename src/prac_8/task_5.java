package prac_8;

import java.util.ArrayList;
import java.util.Scanner;

public class task_5 {
    public static Integer Sums_nums( int y){
        if(y/10>=1) {
            int temp =y%10;
            int ost=y/10;
            return temp + Sums_nums(ost);
        }
        else {
            return y;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter number: ");
        int x = in.nextInt();
        int y = Sums_nums(x);
        System.out.println("Sum of the number's digits = " + y);
    }
}
