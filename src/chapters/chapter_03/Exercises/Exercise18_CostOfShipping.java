package chapters.chapter_03.Exercises;

import java.util.Scanner;

public class Exercise18_CostOfShipping {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the weight of the package in pound:");
        double w = input.nextDouble();

        double cost = 0;

        if (w > 0 && w <= 1) {
            cost = 3.5;
        } else if (w > 1 && w <= 3) {
            cost = 5.5;
        } else if (w > 3 && w <= 10) {
            cost = 8.5;
        } else if (w > 10 && w <= 20) {
            cost = 10.5;
        }

        if (cost == 0) {
            System.out.print("The package cannot be shipped.");
            System.exit(0);
        }

        System.out.print("The cost of shipping is " + cost);
    }
}
