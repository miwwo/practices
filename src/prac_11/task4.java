package prac_11;

import java.time.Month;
import java.util.*;

public class task4 {
    public static void main(String[] args){
        Calendar input = new GregorianCalendar();
        Scanner in = new Scanner(System.in);
        System.out.println("enter year: ");
        int year = in.nextInt();
        input.set(Calendar.YEAR, year);
        System.out.println("enter month: ");
        int month = in.nextInt();
        input.set(Calendar.MONTH, month);
       /* Month month_name = Month.of(month+1 );*/
        System.out.println("enter day of month: ");
        int day = in.nextInt();
        input.set(Calendar.DAY_OF_MONTH, day);
        System.out.println("enter hour: ");
        int hour = in.nextInt();
        input.set(Calendar.HOUR_OF_DAY, hour);
        System.out.println("enter minutes: ");
        int minute = in.nextInt();
        input.set(Calendar.MINUTE, minute);

        Date date = new Date(year-1900,month-1, day, hour, minute);

        System.out.println(date); //СТАРУШКА ПЛОХО РАБОТАЕТ
        System.out.println(input.getTime());
    }
}
