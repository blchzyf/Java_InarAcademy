package chapters.chapter_03.Exercises;

import java.util.Scanner;

public class Exercise26_Operators {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter an integer: ");
        int user = input.nextInt();

        boolean dby5 = false;
        boolean dby6 = false;

        if (user % 5 == 0) {
            dby5 = true;
        }

        if (user % 6 == 0) {
            dby6 = true;
        }

        System.out.println("Is 10 divisible by 5 and 6? " + (dby5 && dby6));
        System.out.println("Is 10 divisible by 5 or 6? " + (dby5 || dby6));
        System.out.println("Is 10 divisible by 5 or 6, but not both? " + (dby5 ^ dby6));
    }
}
