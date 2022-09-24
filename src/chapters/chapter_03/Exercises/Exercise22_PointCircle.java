package chapters.chapter_03.Exercises;

import java.util.Scanner;

public class Exercise22_PointCircle {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a point with two coordinates:");
        double x = input.nextDouble();
        double y = input.nextDouble();

        double d = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));

        if (d >= 10) {
            System.out.print("Point (" + x + ", " + y + ") is not in the circle");
        }else
            System.out.print("Point (" + x + ", " + y + ") is in the circle");


    }
}
