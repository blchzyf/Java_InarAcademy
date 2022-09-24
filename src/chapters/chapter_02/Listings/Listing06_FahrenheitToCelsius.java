package chapters.chapter_02.Listings;

import java.util.Scanner;

public class Listing06_FahrenheitToCelsius {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a degree in Fahrenheit: ");
        double fahrenheit = input.nextDouble();
        double celsius = (5.0 / 9) * (fahrenheit - 32);
        System.out.println("Fahrenheit "+fahrenheit + " is " +celsius + " celsius");
    }
}
