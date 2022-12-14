package chapters.chapter_03.Exercises;

import java.util.Scanner;

public class Exercise29_TwoCircles {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter circle1's center x-, y-coordinates, and radius:");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double r1 = input.nextDouble();

        System.out.println("Enter circle1's center x-, y-coordinates, and radius:");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double r2 = input.nextDouble();

        double d = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        if (d <= Math.abs(r2 - r1)) {
            if (r1 > r2) {
                System.out.println("circle2 is inside circle1");
            } else if (r2 > r1) {
                System.out.println("circle1 is inside circle2");
            } else {
                System.out.println("circle2 is indentical to circle1");
            }
        }
        else if (d < r2 + r1) {
            System.out.println("circle2 overlaps circle1 ");
        }
        else if (d >= r2 + r1) {
            System.out.println("circle2 does not overlaps circle1 ");
        }
    }
}
