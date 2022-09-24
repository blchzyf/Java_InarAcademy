package chapters.chapter_02.Exercises;

import java.util.Scanner;

public class Exercise01_ConvertCelsiusToFahrenheit {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a degree in Celsius: ");
        double celsius = input.nextDouble();;

        double fahrenheit = (9/5.0)* celsius + 32;

        System.out.println(celsius + " celsius is " + fahrenheit + " Fahrenheit");
    }
}
