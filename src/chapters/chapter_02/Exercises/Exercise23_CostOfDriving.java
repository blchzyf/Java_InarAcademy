package chapters.chapter_02.Exercises;

import java.util.Scanner;

public class Exercise23_CostOfDriving {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the driving distance:");
        double distance = input.nextDouble();

        System.out.print("Enter miles per gallon:");
        double fuelEff = input.nextDouble();

        System.out.print("Enter price per gallon:");
        double pricePerGallon = input.nextDouble();

        double cost = distance / fuelEff * pricePerGallon;
        System.out.print("The cost of driving is $" + cost);
    }
}
