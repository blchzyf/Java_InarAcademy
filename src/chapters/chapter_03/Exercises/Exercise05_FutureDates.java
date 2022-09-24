package chapters.chapter_03.Exercises;

import java.util.Scanner;

public class Exercise05_FutureDates {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter today's day number: ");
        int today = input.nextInt();

        System.out.print("Enter the number of days elapsed since today:");
        int elapsed = input.nextInt();

        String dayString = "";

        switch(today%7){
            case 1:dayString= "Monday";break;
            case 2:dayString= "Tuesday";break;
            case 3:dayString= "Wednesday";break;
            case 4:dayString= "Thursday";break;
            case 5:dayString= "Friday";break;
            case 6:dayString= "Saturday";break;
            case 0:dayString= "Sunday";break;
        }
        System.out.print("Today is " + dayString + " and the future day is " );

        int day = (today + elapsed);

        switch(day%7){
            case 1:dayString= "Monday";break;
            case 2:dayString= "Tuesday";break;
            case 3:dayString= "Wednesday";break;
            case 4:dayString= "Thursday";break;
            case 5:dayString= "Friday";break;
            case 6:dayString= "Saturday";break;
            case 0:dayString= "Sunday";break;
        }
        System.out.print(dayString);
    }
}
