package chapters.chapter_03.Exercises;

public class Exercise16_RandomPoint {
    public static void main(String[] args) {

        int width = 100;
        int height = 200;

        int x1 = (int) (Math.random() * (height/2));
        int y1 = (int) (Math.random() * (width/2));
        System.out.print("The rectangle random point is (" + x1 + " , " + y1 + ") ");
    }
}
