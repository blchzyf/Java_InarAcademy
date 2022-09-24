package chapters.chapter_05.Listings;

import java.util.Scanner;

public class Listing09_GreatestCommonDivisior {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter first integer:");
        int n1 = input.nextInt();
        System.out.print("Enter second Integer:");
        int n2 = input.nextInt();

        int gcd = 1;
        int k = 2;
        while(k <= n1 && k <= n2){
            if(n1 % k == 0 && n2 % k == 0)
                gcd = k; //update gcd
            k++;
        }

        System.out.println("The greatest common diviser for " + n1 + " and " + n2 + " is " + gcd);
    }
}
