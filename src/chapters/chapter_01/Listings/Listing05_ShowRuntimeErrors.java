package chapters.chapter_01.Listings;

public class Listing05_ShowRuntimeErrors {
    public static void main(String[] args) {
        System.out.println(1/0);
    }
}
// Exception in thread "main" java.lang.ArithmeticException: / by zero
//	at chapters.chapter_01.Listings.Listing05_ShowRuntimeErrors.main(Listing05_ShowRuntimeErrors.java:5)