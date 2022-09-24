package chapters.chapter_03.Exercises;

import java.util.Scanner;

public class Exercise12_PalindromeNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a three-digit integer:");
        int number = input.nextInt();

        int firstDigit = number / 100;
        int lastDigit = number % 10;

        if (lastDigit == firstDigit) {
            System.out.print(number + " is a palindrome");
        } else {
            System.out.print(number + " is not a palindrome");
        }
    }
}
