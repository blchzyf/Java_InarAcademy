package chapters.chapter_05.Exercises;

import java.util.Scanner;

public class Exercise01_ComputePositiveNegativeNumbers {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number = 1;
        int positive = 0;
        int negative = 0;
        double total = 0;
        int count = -1;
        double average = 0;

        while (number != 0) {
            System.out.println("Enter an integer, the input ends if it is 0: ");
            number = input.nextInt();

            if (number > 0) {
                positive++;
            } else if (number < 0) {
                negative++;
            }
            count++;
            total += number;

        }
        average = (total / count);

        System.out.println("The number of pozitives is " + positive);
        System.out.println("The number of negatives is " + negative);
        System.out.printf("Total is %2.2f \n", total);
        System.out.printf("The average is %2.2f", average);
    }
}
