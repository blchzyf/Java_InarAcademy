package chapters.chapter_03.Exercises;

import java.util.Scanner;

public class Exercise20_WindChillTemperature {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.print("Enter the temperature in Fahrenheit between -58°F and 41°F:");
        double ta = input.nextDouble();

        System.out.print("Enter the wind speed (>=2) in miles per hour:");
        double v = input.nextDouble();
        double twc = 0;

        if (ta < -58 || ta > 41) {
            System.out.println("The temperature input is incorrect.");
            twc = -1;
        }

        if (v < 2) {
            System.out.println("The wind speed input is incorrect.");
            twc = -1;
        }

        if (twc == -1) {
            System.exit(0);
        }

        twc = 35.74 + 0.6215 * ta - 35.75 * Math.pow(v, 0.16) + 0.4275 * ta
                * Math.pow(v, 0.16);

        System.out.print("The wind chill index is " + twc);
    }
}
