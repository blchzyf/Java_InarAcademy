package chapters.chapter_03.Exercises;

import java.util.Scanner;

public class Exercise28_TwoRectangles {
    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);

        System.out.print("Enter first rentangle's center x, y coordinates, width, and height: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double w1 = input.nextDouble();
        double h1 = input.nextDouble();

        System.out.print("Enter second rectangles center x, y-coordinates, width, and height: ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double w2 = input.nextDouble();
        double h2 = input.nextDouble();

        double x1max = x1 + w1;
        double y1max = y1 + h1;
        double x1min = x1 - w1;
        double y1min = y1 - h1;
        double x2max = x2 + w2;
        double y2max = y2 + h2;
        double x2min = x2 - w2;
        double y2min = y2 - h2;

        if (x1max == x2max && x1min == x2min && y1max == y2max && y1min == y2min) {
            System.out.print("Rectangle1 and Rectangle2 are indentical");
        }
         else if (x1max <= x2max && x1min >= x2min && y1max <= y2max && y1min >= y2min) {
            System.out.print("Rectangle1 is inside Rectangle2");
        }
         else if (x2max <= x1max && x2min >= x1min && y2max <= y1max && y2min >= y1min) {
             System.out.print("Rectangle2 is inside Rectangle1");
        }
         else if (x1max < x2min || x1min > x2max || y1max < y2min || y1min > y2max) {
             System.out.print("Rectangle2 does not overlaps Rectangle1");
        }
         else {
            System.out.print("Rectangle2 overlaps Rectangle1");
        }

    }
}
