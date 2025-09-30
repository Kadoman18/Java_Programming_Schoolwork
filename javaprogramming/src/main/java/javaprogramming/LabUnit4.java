package javaprogramming;

import java.util.InputMismatchException;
import java.util.Scanner;
// Kaden Breinholt, Tues. Sep. 23rd, Lab 3
/*
 * This is the times tables program. It takes one input which is used to determine
 * the level the times tables displayed should go to. It uses nested while statements.
 * I also added a section to check for valid input which I learned how to do in my
 * first project, (you had me explain myself for it).
 */
public class LabUnit4 {

    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int height;
        boolean validInput = false;
        System.out.print(
                "\n\tThe Times Tables Program\n\nThis program takes a number and uses that to\ndisplay times tables up to the given number.\n\n");
        while (!validInput) {
            try {
                System.out.print("Please input a number: ");
                height = input.nextInt();
                System.out.println();
                int heightX = height;
                int heightY = height;
                int countX = 1;
                while (countX <= heightX) {
                    int countY = 1;
                    while (countY <= heightY) {
                        System.out.print(countY + " x " + countX + " = " + (countY * countX) + "  ");
                        countY++;
                    }
                    countX++;
                    System.out.println();
                }
                System.out.println("\n");
                validInput = true;
            } catch (InputMismatchException inputX) {
                System.out.println("Invalid input. Please enter a Number.");
                input.next();
            }
        }
    }
}
