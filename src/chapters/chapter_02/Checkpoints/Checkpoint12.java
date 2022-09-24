package chapters.chapter_02.Checkpoints;

public class Checkpoint12 {
    public static void main(String[] args) {

        int tue = 1;
        int wed = tue + 1;
        int thur = tue + 2;
        int fri = tue + 3;
        int sat = tue + 4;
        int sun = tue + 5;
        int mon = tue + 6;

        int today = 100 % 7;
        System.out.println(today);
    }
}
