package chapters.chapter_04.Exercises;

import java.util.Scanner;

public class Exercise17_DaysOfMonth {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a year:");
        int year = input.nextInt();

        System.out.print("Enter a month:");
        String month = input.next();

        int days = 0;

        switch (month) {
            case "Feb":
                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                    days = 29;
                    break;
                }
                days = 28;
                break;

            case "Apr":
            case "Jun":
            case "Sep":
            case "Nov":
                days = 30;
                break;

            case "Jan":
            case "Mar":
            case "May":
            case "Jul":
            case "Aug":
            case "Oct":
            case "Dec":
                days = 31;
                break;

            default:
                System.out.println("Invalid month.");
                System.exit(0);

        }

        System.out.println(month + " " + year + " has " + days + " days");
    }
}
