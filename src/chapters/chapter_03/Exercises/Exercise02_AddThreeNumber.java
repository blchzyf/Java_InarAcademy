package chapters.chapter_03.Exercises;

import java.util.Scanner;

public class Exercise02_AddThreeNumber {
    public static void main(String[] args) {

        int number1 = (int)(System.currentTimeMillis() % 10);
        int number2 = (int)(System.currentTimeMillis() / 7 % 10);
        int number3 = (int)(System.currentTimeMillis() / 5 % 10);

        System.out.print("What is " + number1 + " + " + number2 + " + " + number3 + " ? ");

        Scanner input = new Scanner(System.in);
        int answer = input.nextInt();
        int result = number1+number2+number3;

        if (answer == result) {
            System.out.println("Congrats! That is correct!");
        } else
            System.out.println("That is incorrect, please try again");

    }
}
