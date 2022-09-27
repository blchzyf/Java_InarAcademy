package chapters.chapter_05.Exercises;

public class Exercise10_NumbersDivisible5and6 {
    public static void main(String[] args) {

        int num1 = 100;
        int num2 = 1000;

        int count = 0;
        for (int i = num1; i <= num2; i++) {

            if (i % 6 == 0 && i % 5 == 0) {
                System.out.print(i + " ");
                count++;

                if (count == 10) {
                    System.out.println();
                    count = 0;
                }

            }

        }

    }
}
