package chapters.chapter_04.Exercises;

public class Exercise16_RandomCharacter {
    public static void main(String[] args) {

        int n = (int) (65 + Math.random() * 26);
        char c = (char) n;

        System.out.println("The random letter is " + c);

    }
}
