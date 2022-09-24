package chapters.chapter_04.Exercises;

import java.util.Scanner;

public class Exercise18_StudentMajorAndStatus {
    public static void main(String[] args) {

        System.out.println("Please enter two characters Ex.(C3)\n M) Mathematics C) Computer Science I) Information Technology\n For your major \n 1) Freshman 2) Sophomore" +
                " 3) Junior 4) Senior");

        Scanner input = new Scanner(System.in);
        String statusCode = input.nextLine();

        char major = statusCode.charAt(0);
        char statusYear = statusCode.charAt(1);

        String s1 = "";
        String s2 = "";

        if (major == 'M') {
            s1 = "Mathematics";
        }
        else if (major == 'C') {
            s1 = "Computer Science";}
        else if (major == 'I') {
            s1 = "Information Technology";}

        if (statusYear == '1') {
            s2 = "Freshman";
        }
        else if (statusYear == '2') {
            s2 = "Sophomore";}
        else if(statusYear == '3') {
            s2 = "Junior";}
        else if(statusYear == '4') {
            s2 = "Senior";}

        System.out.println(s1 + " " + s2);
    }
}
