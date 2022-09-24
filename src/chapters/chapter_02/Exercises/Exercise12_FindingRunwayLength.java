package chapters.chapter_02.Exercises;

import java.util.Scanner;

public class Exercise12_FindingRunwayLength {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter speed and acceleration:");
        double speed = input.nextDouble();
        double acc = input.nextDouble();
        double length = Math.pow(speed, 2)/(2*acc);

        System.out.println("The minimum runway length for this airplane is " + length);
    }
}
