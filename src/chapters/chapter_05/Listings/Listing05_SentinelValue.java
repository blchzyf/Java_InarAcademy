package chapters.chapter_05.Listings;

import java.util.Scanner;

public class Listing05_SentinelValue {
    public static void main(String[] args) { // Create a Scanner

        Scanner input = new Scanner(System.in);

        System.out.print(
                "Enter an integer (the input ends if it is 0): ");
        int data = input.nextInt();
        int sum = 0;
        while (data != 0) {
            sum += data;
            System.out.print(
                    "Enter an integer (the input ends if it is 0): ");
            data = input.nextInt();
        }
        System.out.println("The sum is " + sum);
    }
}
