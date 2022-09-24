package chapters.chapter_01.Exercises;

public class Exercise11 {
    public static void main(String[] args) {

        double population = 312032486;
        double yearlyBirth = (365*24*60*60)/7.0;
        double yearlyDeath = (365*24*60*60)/13.0;
        double yearlyImmigrant = (365*24*60*60)/45.0;
        double change = yearlyBirth + yearlyImmigrant - yearlyDeath;

        System.out.println("1. year population is: " +(population+(1*change)));
        System.out.println("2. year population is: " +(population+(2*change)));
        System.out.println("3. year population is: " +(population+(3*change)));
        System.out.println("4. years population is: " +(population+(4*change)));
        System.out.println("5. years population is: " +(population+(5*change)));

    }
}
   //4505142
//2425846
//700800
