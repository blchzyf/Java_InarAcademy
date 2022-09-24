package chapters.chapter_03.Exercises;

import java.util.Scanner;

public class Exercise17_ScissorRockPaper {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int comp = (int) (Math.random() * 3);
        System.out.println(comp);

        int scissor = 0;
        int rock = 1;
        int paper = 2;

        System.out.print("Select a option\n0 - Scissor\n1 - Rock\n2 - Paper\n");
        int select = input.nextInt();


        switch (select) {
            case 0:
                if (comp == scissor) {
                    System.out.println("The computer is scissor and you are scissor, it's a draw.");
                } else if (comp == rock) {
                    System.out.println("The computer is rock and you are scissor, you lost.");
                } else if (comp == paper) {
                    System.out.println("The computer is paper and you are scissor, you won.");
                }
                break;
            case 1:
                if (comp == scissor) {
                    System.out.println("The computer is scissor and you are rock, you won.");
                } else if (comp == rock) {
                    System.out.println("The computer is rock and you are rock, its a draw.");
                } else if (comp == paper) {
                    System.out.println("The computer is paper and you are rock, you lost.");
                }
                break;
            case 2:
                if (comp == scissor) {
                    System.out.println("The computer is scissor and you are paper, you lost.");
                } else if (comp == rock) {
                    System.out.println("The computer is rock and you are paper, you won.");
                } else if (comp == paper) {
                    System.out.println("The computer is paper and you are paper, it's a draw.");
                }
                break;
        }

        System.out.println("finish");


    }
}
