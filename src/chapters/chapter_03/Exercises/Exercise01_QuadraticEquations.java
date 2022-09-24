package chapters.chapter_03.Exercises;

import  java.util.Scanner;

public class Exercise01_QuadraticEquations {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter values for a, b, c: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        double discriminant = (b * b) - (4 * a * c);

        if (discriminant < 0) {
            System.out.println("The equation has no real roots.");
        } else if (discriminant > 0) {
            double r1 = ((-1 * b) + Math.pow(discriminant, 0.5)) / (2 * a);
            double r2 = ((-1 * b) - Math.pow(discriminant, 0.5)) / (2 * a);

            System.out.print("The equation has two roots: " + r1 + " and " + r2);


        } else {
            double r = ((-1 * b) + Math.pow(discriminant, 0.5)) / (2 * a);
            System.out.print("The equation has one root: " + r);
        }
    }
}
