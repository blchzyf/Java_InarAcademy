package chapters.chapter_05.Exercises;

import java.util.Scanner;

public class Exercise14_GreatestCommonDivisor {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first positive integer: ");
        int n1 = input.nextInt();

        System.out.println("Enter the second positive integer: ");
        int n2 = input.nextInt();

        int divisor = Math.min(n1, n2);

        while (n1 % divisor != 0 || n2 % divisor != 0) {
            divisor--;
        }
        System.out.println("Greatest Common Divisor of " + n1 + " and " + n2 + " is " + divisor);
    }
}
