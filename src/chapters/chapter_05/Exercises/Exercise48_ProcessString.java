package chapters.chapter_05.Exercises;

import java.util.Scanner;

public class Exercise48_ProcessString {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String string = input.nextLine();

        String oddPositions = "";

        for (int i = 0; i < string.length(); i+=2) {
            oddPositions += string.charAt(i);
        }

        System.out.println(oddPositions);
    }
}
