package chapters.chapter_04.Exercises;


import java.util.Scanner;

public class Exercise09_FindUnicodeOfCharacter {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a character: ");
        String s = input.nextLine();

        char ch = s.charAt(0);

        System.out.print("The Unicode for the character " + ch + " is " + (int) ch);
    }
}
