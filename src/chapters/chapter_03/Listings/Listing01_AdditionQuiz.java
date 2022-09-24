package chapters.chapter_03.Listings;

import java.util.Scanner;

public class Listing01_AdditionQuiz {
    public static void main(String[] args) {

        int number1 = (int)(System.currentTimeMillis() % 10);
        int number2 = (int)(System.currentTimeMillis() / 7 % 10);

        System.out.print("What is " + number1 + " + " + number2 + "? ");

        Scanner input = new Scanner(System.in);
        int answer = input.nextInt();
        System.out.println(number1 + " + " + number2 + " = " + answer + " is " + (number1+number2 == answer));
    }
}
