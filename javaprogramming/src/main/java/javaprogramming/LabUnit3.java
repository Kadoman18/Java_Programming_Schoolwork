package javaprogramming;

import java.util.Scanner;
// Kaden Breinholt, Tues. Sep. 23rd, Lab 3
/*
 * This is the BMI calculator program. It takes two inputs (double) and uses 4 seperate methods
 * to determine the users BMI.
 *
 *  Title: BMI Calculator
 */

public class LabUnit3 {

    public static Scanner input = new Scanner(System.in);

    // This is my method to convert pounds to kilograms
    public static double convertToKilograms(double pounds) {
        return pounds / 2.2046;
    }

    // This is my method to convert inches to meters
    public static double convertToMeters(double inches) {
        return inches / 39.37;
    }

    // This is my method to calculate BMI
    public static double calcBMI(double kilograms, double meters) {
        return kilograms / (meters * meters);
    }

    // Method to determine BMI classification
    public static String bmiClassification(double bmi) {
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi < 25.0) {
            return "Normal";
        } else if (bmi < 30.0) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }

    // Main Program
    public static void main(String[] args) {

        System.out.print("\nEnter your weight in pounds: ");
        double weightPounds = input.nextDouble();
        System.out.print("Enter your height in inches: ");
        double heightInches = input.nextDouble();
        double weightKg = convertToKilograms(weightPounds);
        double heightM = convertToMeters(heightInches);
        double bmi = calcBMI(weightKg, heightM);
        System.out.printf("Your BMI is: %.2f\n", bmi);
        System.out.printf("BMI Classification: %s\n\n", bmiClassification(bmi));

        input.close();
    }
}
