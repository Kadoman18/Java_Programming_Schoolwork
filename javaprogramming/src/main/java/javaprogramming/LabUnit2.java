package javaprogramming;

import java.util.Scanner;
// Kaden Breinholt, Tues. Sep. 16th, Lab 2
/*
 * This is the Hurricane Wind Scale Classification program, it takes
 * a given speed in miles per hour and outputs the relevant
 * hurricane classification given by the Saffir-Simpson Hurricane
 * Wind Scale if the wind speed is in range.
 */

public class LabUnit2 {

    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        long speed;
        String classification;
        System.out.print("\nPlease enter a Wind Speed in mph to determine the Hurricane Wind Scale Classification: \n");
        speed = input.nextLong();
        System.out.printf("Given Speed is %dmph.\n", speed);
        if (speed <= 0) {
            classification = "Invalid Input";
        } else if (speed <= 38) {
            classification = "Not in Scale";
        } else if (speed <= 73) {
            classification = "Tropical Storm";
        } else if (speed <= 95) {
            classification = "Catagory One Hurricane";
        } else if (speed <= 110) {
            classification = "Catagory Two Hurricane";
        } else if (speed <= 129) {
            classification = "Catagory Three Hurricane";
        } else if (speed <= 156) {
            classification = "Catagory Four Hurricane";
        } else {
            classification = "Catagory Five Hurricane";
        }
        System.out.printf("Classification: %s.\n\n", classification);
    }
}
