package chapters.chapter_03.Listings;

import java.util.Scanner;

public class Listing03_SubtractionQuiz {
    public static void main(String[] args) {

        int number1 = (int)(Math.random()*10);
        int number2 = (int)(Math.random()*10);

        if (number1<number2){
            int temp = number1;
            number1 = number2;
            number2 = temp;
        }

        System.out.println("What is " + number1 + " - " + number2 + " ? ");

        Scanner input = new Scanner(System.in);
        int answer = input.nextInt();

        if (number1-number2 == answer)
            System.out.println("You are correct");
            else {
                System.out.println("Your answer is wrong.");
                System.out.println(number1 + " - " + number2 + " is " + (number1 - number2));

            }
    }
}
