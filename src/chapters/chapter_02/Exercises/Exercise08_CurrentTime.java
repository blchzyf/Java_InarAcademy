package chapters.chapter_02.Exercises;

import java.util.Scanner;

public class Exercise08_CurrentTime {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the time zone offset to GMT:");
        int offset = input.nextInt();

        offset = offset * 60 * 60;

        long totalMilliseconds = System.currentTimeMillis();

        long totalSeconds = (totalMilliseconds / 1000) + offset;

        long currentSecond = totalSeconds % 60;

        long totalMinutes = totalSeconds / 60;

        long currentMinute = totalMinutes % 60;

        long totalHours = totalMinutes / 60;

        long currentHour = totalHours % 24;

        System.out.println("Current time is " + currentHour + ":" + currentMinute + ":" + currentSecond );
    }
}
