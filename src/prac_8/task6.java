package prac_8;

import java.util.Scanner;

public class task6 {
    public static boolean prime(int m,int n){
        return func(m, 1);
    }
    public static boolean func(int m, int n){
        if (n >= m)
            return true;
        if (n == 1)
            return func(m, n + 1);
        if (m % n == 0)
            return false ; // HERE
        return func(m, n + 1);
    }


    public static void main(String[] args) {
        boolean ans;
        Scanner in = new Scanner(System.in);
        System.out.println("enter number: ");
        int x = in.nextInt();
        System.out.println("The number is prime? - ");
        ans = prime(x,1);
        if(ans)
            System.out.println("YES");
        else{
            System.out.println("NO");
        }
    }
}
