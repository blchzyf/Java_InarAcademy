package chapters.chapter_05.Exercises;

public class Exercise12_SmallestN {
    public static void main(String[] args) {

        int i = 1;
        while (Math.pow(i, 3) < 12000) {
            i++;

        }
        System.out.println(i);
    }
}
