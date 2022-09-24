package chapters.chapter_02.Exercises;

import java.util.Scanner;

public class Exercise04_PoundsIntoKilograms {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number in pounds: ");
        double pounds = input.nextDouble();

        double kilograms = pounds*0.454;

        System.out.println(pounds + " pounds is " + kilograms + " kilograms.");

    }
}
