package edu.cscc;

import java.util.InputMismatchException;
import java.util.Scanner;
// Kaden Breinholt, Tues. September 9th, Lab 1
/*------ DISCLAIMER -------
I had the basic program ready and done but decided to add something to prevent
incorrect inputs, I admit I used the internet to find a solution to this but assumed
that if disclosed it, it  would be allowed. I learn best when I take concepts to
the next level. I like to think about the user perspective and make sure everything
works fluidly and intuitively.
 */
public class LabUnit1 {

    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("\n\tPrint each given Number and their Average\n");
        System.out.println("---------------------------------------------------------\n");
        System.out.print("Please enter three numbers.\n");
        boolean validInput = false;
        while (!validInput) {
            try {
                System.out.print("First Number: ");
                double input1 = input.nextDouble();
                System.out.print("Second Number: ");
                double input2 = input.nextDouble();
                System.out.print("Third Number: ");
                double input3 = input.nextDouble();
                double avg = (input1 + input2 + input3) / 3;
                System.out.printf("\n\tThe average of %.2f, %.2f, and %.2f is: %.2f.\n", input1, input2, input3, avg);
                validInput = true;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a Number.");
                input.next(); // Consume the invalid input to prevent an infinite loop
            }
        }
    }
}
