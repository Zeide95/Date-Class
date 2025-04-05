import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter day, month, year in numbers:");
        int day1 = input.nextInt();
        int month1 = input.nextInt();
        int year1 = input.nextInt();
        System.out.println("Enter second day, month, year in numbers:");
        int day2 = input.nextInt();
        int month2 = input.nextInt();
        int year2 = input.nextInt();

        Date date1 = new Date(day1, month1, year1);
        Date date2 = new Date(day2, month2, year2);
        Date date3 = new Date(10, 12, 2022);

        System.out.println(date1.printDate());
        System.out.println(date2.printDate());
        System.out.println(date3.printDate());

        System.out.println("Days of the week of the first and second dates: " + date1.getDayOfWeek() + " and " + date2.getDayOfWeek());

        System.out.println("Difference between " + date1.printDate() + " and " + date2.printDate() + ": " + date1.calculateDifference(date2) + " days");

        date1.updateDate(5, 6, 2024);
        System.out.println("Updated first date: " + date1.printDate());

        ArrayList<Date> dateList = new ArrayList<>();
        dateList.add(date1);
        dateList.add(date2);
        dateList.add(date3);

        Collections.sort(dateList);

        System.out.println("Sorted dates:");
        for (Date date : dateList) {
            System.out.println(date.printDate());
        }
    }
}
