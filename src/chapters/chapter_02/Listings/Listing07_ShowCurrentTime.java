package chapters.chapter_02.Listings;

public class Listing07_ShowCurrentTime {
    public static void main(String[] args) {

        long totalMilliseconds = System.currentTimeMillis();
        long totalSeconds = totalMilliseconds / 1000;
        long currentSecond = totalSeconds % 60;
        long totalMinutes = totalSeconds / 60;
        long currentMinute = totalMinutes % 60;
        long totalHours = totalMinutes / 60;
        long currentHour = 3+ (totalHours % 24);

        System.out.println("Current time is " + currentHour + ":" + currentMinute + ":" + currentSecond + " GMT");



    }
}
