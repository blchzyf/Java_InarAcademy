package chapters.chapter_02.Exercises;

import java.util.Scanner;

public class Exercise02_VolumeOfCylinder {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        final double PI = 3.14159;

        System.out.println("Enter the radius and legth of a cylinder: ");

        double radius = input.nextDouble();
        double length = input.nextDouble();

        double area = radius * radius * PI;
        double volume = area * length;

        System.out.println("The area is: " +area);
        System.out.println("The volume is: " + volume);
    }
}
