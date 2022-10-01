package chapters.chapter_05.Exercises;

import java.util.Scanner;

public class Exercise41_OccurenceMaxNumbers {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter numbers: ");
        int max = input.nextInt();
        int count = 1;
        int num =0;

        while (num > 0) {
            num = input.nextInt();
            if (num > max) {
                max = num;
                count = 1;
            }
            if (num == max)
                count++;
        }

        System.out.println("The largest number is " + max);
        System.out.println("The occurrence count of the largest number is " + count);
    }
}
