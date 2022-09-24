package chapters.chapter_02.Exercises;

import java.util.Scanner;

public class Exercise16_AreaOfHexagon {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the side:");
        double s = input.nextDouble();
        double area = (3 * Math.pow(3,0.5) / 2) * Math.pow(s, 2);
        System.out.print("The area of the hexagon is " + area);
    }
}
