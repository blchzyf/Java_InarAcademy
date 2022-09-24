package chapters.chapter_02.Exercises;

import java.util.Scanner;

public class Exercise07_NumberOfYears {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of minutes: ");
        int number = input.nextInt();
        int days = (number/(24*60))%365;
        int years = (number/(24*60))/365;


        System.out.println(number + " minutes is approximately " + years + " years and " + days +" days");
    }
}
