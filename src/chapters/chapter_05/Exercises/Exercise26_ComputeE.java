package chapters.chapter_05.Exercises;

public class Exercise26_ComputeE {
    public static void main(String[] args) {

        double e = 1;
        int num = 10000;
        while (num <= 100000) {
            double divide = 0;
            for (double i = 1; i <= num; i++) {
                divide += i * (i - 1);
            }
            e += 1 / divide;
            System.out.println("e is " + e + " when i is " + num);
            num += 10000;
        }
    }
}
