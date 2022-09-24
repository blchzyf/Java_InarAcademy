package chapters.chapter_02.Exercises;

import java.util.Scanner;

public class Exercise11_PopulationProject {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of years: ");
        int years = input.nextInt();

        double population = 312032486;
        double yearlyBirth = (365*24*60*60)/7.0;
        double yearlyDeath = (365*24*60*60)/13.0;
        double yearlyImmigrant = (365*24*60*60)/45.0;
        double change = yearlyBirth + yearlyImmigrant - yearlyDeath;

        System.out.println("The population in " +years + " years is " +(population+(years*change)));
    }
}
