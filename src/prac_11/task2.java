package prac_11;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class task2 {
    public static void main(String[] args) throws InterruptedException {
        Calendar date1 = new GregorianCalendar();
        Scanner in = new Scanner(System.in);
        Calendar now = new GregorianCalendar();
        Calendar date2 = Calendar.getInstance();
        System.out.println("enter year: ");
        date1.set(Calendar.YEAR, in.nextInt());
        System.out.println("enter month: ");
        date1.set(Calendar.MONTH, in.nextInt()-1);
        System.out.println("enter day of month: ");
        date1.set(Calendar.DAY_OF_MONTH, in.nextInt());


        if(date1.equals(date2))
            System.out.println("Calendars are equal");
        else if(date1.after(date2))
            System.out.println(date1.getTime() + " comes after " + date1.getTime());
        else if(date1.before(date2))
            System.out.println(date1.getTime() + " comes before " + date2.getTime());

    }
}
