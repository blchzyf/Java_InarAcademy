package chapters.chapter_03.Exercises;

import java.util.Scanner;

public class Exercise23_PointRectangle {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a point with two coordinates:");
        double x = input.nextDouble();
        double y = input.nextDouble();

        if (Math.abs(x) > 5 || Math.abs(y) > 2.5) {
            System.out.print("Point (" + x + ", " + y + ") is not in the rectangle");
        }else
            System.out.print("Point (" + x + ", " + y + ") is in the rectangle");
    }
}
