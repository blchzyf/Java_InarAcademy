package chapters.chapter_02.Exercises;

import java.util.Scanner;

public class Exercise13_CompoundValue {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the monthly saving amount: ");
        double msa = input.nextDouble();
        double accum = 0;
        accum = (msa + accum) * 1.00417;
        accum = (msa + accum) * 1.00417;
        accum = (msa + accum) * 1.00417;
        accum = (msa + accum) * 1.00417;
        accum = (msa + accum) * 1.00417;
        accum = (msa + accum) * 1.00417;

        System.out.println("After the sixth month, the account value is $" + accum);
    }
}
