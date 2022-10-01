package chapters.chapter_05.Exercises;

import java.util.Scanner;

public class Exercise17_DisplayPyramid {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of lines: ");

        int lineNum = input.nextInt();

        for (int i = 1; i <= lineNum; i++) {
            int blanks = lineNum - i;
            for (int s = 0; s < blanks; s++) {
                System.out.print("    ");
            }
            for (int leftNums = lineNum - blanks; leftNums >= 2; leftNums--) {
                System.out.printf("%4d", (leftNums));
            }
            for (int rightNums = 1; rightNums < lineNum - blanks + 1; rightNums++) {
                System.out.printf("%4d", (rightNums));
            }
            System.out.println();
        }
    }
}
