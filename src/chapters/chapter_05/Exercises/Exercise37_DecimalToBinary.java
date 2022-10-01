package chapters.chapter_05.Exercises;

import java.util.Scanner;

public class Exercise37_DecimalToBinary {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a decimal integer: ");
        int decimal = input.nextInt();

        String binary = "";
        for (int i = decimal; i > 0; i /= 2) {
            binary = (i % 2) + binary;
        }

        System.out.println(
                "The binary value of the decimal \"" + decimal + "\" is: " + binary);
    }
}
