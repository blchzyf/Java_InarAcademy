package chapters.chapter_02.Exercises;


import java.util.Scanner;

public class Exercise21_FutureInvestmentValue {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter investment amount:");
        double investmentAmount = input.nextDouble();

        System.out.print("Enter annual interest rate in percentage:");
        double annualInterestRate = input.nextDouble();

        double monthlyInterestRate = annualInterestRate / 12;

        System.out.print("Enter number of years:");
        double numberOfYears = input.nextDouble();

        double futureInvestmentValue = investmentAmount * Math.pow((1 + monthlyInterestRate / 100),(numberOfYears * 12));
        System.out.print("Accumulated value is $" + futureInvestmentValue);
    }
}
