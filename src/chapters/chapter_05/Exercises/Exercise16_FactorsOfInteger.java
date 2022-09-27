package chapters.chapter_05.Exercises;

import java.util.Scanner;

public class Exercise16_FactorsOfInteger {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter an integer: ");
        int num = input.nextInt();
        int i = 2;

        while (num / i != 1) {
            if (num % i == 0) {
                System.out.print(i + ", ");
                num /= i;
            } else
                i++;
        }
        System.out.println(num + ".");
    }


}

