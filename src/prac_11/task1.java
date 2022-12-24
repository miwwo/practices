package prac_11;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class task1 {
    public static void main(String[] args) throws InterruptedException {
        Calendar now = new GregorianCalendar();
        System.out.println("Developer: Galihanova Emichka");
        now.set(Calendar.YEAR,2022);
        now.set(Calendar.MONTH,Calendar.SEPTEMBER);
        now.set(Calendar.DAY_OF_MONTH,30);
        System.out.println("Zadania prinyala: " + now.getTime());

        Date after = new Date();
        System.out.println("Zadanie obrabotala: " + after);
    }
}
