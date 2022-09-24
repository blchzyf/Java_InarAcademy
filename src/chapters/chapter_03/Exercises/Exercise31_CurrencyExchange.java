package chapters.chapter_03.Exercises;

import java.util.Scanner;

public class Exercise31_CurrencyExchange {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the exchange rate from dollars to RMB:");
        double exchangeRate = input.nextDouble();

        System.out.println("Enter 0 to convert dollars to RMB and 1 vice versa:");
        int userChoice = input.nextInt();

        if(userChoice == 0) {
            System.out.println("Enter the dollar amount:");
            double dollarAmount = input.nextDouble();

            double rmbAmount = dollarAmount * exchangeRate;
            System.out.println("$" + dollarAmount + " is " + rmbAmount + " yuan.");
        }
        else if(userChoice == 1) {
            System.out.println("Enter the RMB amount:");
            double rmbAmount = input.nextDouble();

            double dollarAmount = rmbAmount/exchangeRate;
            System.out.println(rmbAmount + " yuan is $" + dollarAmount);
        }
        else {
            System.out.println("Invalid choice.");
        }
    }
}
