package chapters.chapter_04.Exercises;

import java.util.Scanner;

public class Exercise26_MonetaryUnits {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print(
                "Enter an amount in double, for example 11.56: ");
        String numStr = input.next();
        if (numStr.length() < 4) {
            System.out.println("Please enter an amount with the format ##.## ie 11.56");
            System.exit(0);
        }
        String numberOfOneDollars = numStr.substring(0, numStr.indexOf("."));

        String cents = numStr.substring(numStr.indexOf(".") + 1);
        Integer change = Integer.parseInt(cents);
        int numQuarter = change / 25;
        change %= 25;
        int dime = change / 10;
        change %= 10;
        int nickel = change / 5;
        change %= 5;
        int penny = change;


        String numberOfQuarters = String.valueOf(numQuarter);
        String numberOfDimes = String.valueOf(dime);
        String numberOfNickels = String.valueOf(nickel);
        String numberOfPennies = String.valueOf(penny);

        System.out.println("Your amount " + numStr + " consists of");
        System.out.println(" " + numberOfOneDollars + " dollars");
        System.out.println(" " + numberOfQuarters + " quarters ");
        System.out.println(" " + numberOfDimes + " dimes");
        System.out.println(" " + numberOfNickels + " nickels");
        System.out.println(" " + numberOfPennies + " pennies");
    }
}
