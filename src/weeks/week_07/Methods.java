package weeks.week_07;

public class Methods {
    public static void main(String[] args) {
        yazdir(5);
        int sayi = random(10);

    }
    public static void yazdir(int num){
        System.out.println(num);
    }
    public static int random(int num){
        int a = (int)(Math.random()*num);
        return a;
    }
}
