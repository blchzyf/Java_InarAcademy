package chapters.chapter_05.Exercises;

import java.util.Scanner;

public class Exercise49_VowelsAndConsonants {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String string = input.nextLine();

        int vowels, consonants;

        vowels = consonants = 0;

        for (int i = 0; i < string.length(); i++) {
            if (Character.isLetter(string.charAt(i))) {
                if (Character.toUpperCase(string.charAt(i)) == 'A' ||
                        Character.toUpperCase(string.charAt(i)) == 'E' ||
                        Character.toUpperCase(string.charAt(i)) == 'I' ||
                        Character.toUpperCase(string.charAt(i)) == 'O' ||
                        Character.toUpperCase(string.charAt(i)) == 'U') {
                    vowels++;
                } else
                    consonants++;
            }
        }
            System.out.println("The number of vowels is " + vowels);
            System.out.println("The number of consonants is " + consonants);
        }
    }

