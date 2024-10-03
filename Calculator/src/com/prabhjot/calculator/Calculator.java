package com.prabhjot.calculator;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueCalc = true;

        // Create instances of operation classes
        Addition addition = new Addition();
        Subtraction subtraction = new Subtraction();
        Multiplication multiplication = new Multiplication();
        Division division = new Division();

        while (continueCalc) {
            // Display menu options
            System.out.println("\nCalculator");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");
            System.out.print("Choose an operation: ");
            int choice = scanner.nextInt();

            // Check if the user wants to exit
            if (choice == 5) {
                System.out.println("Exiting...");
                continueCalc = false;
                continue;
            }

            // Ask for input numbers
            System.out.print("Enter the first number: ");
            double num1 = scanner.nextDouble();
            System.out.print("Enter the second number: ");
            double num2 = scanner.nextDouble();

            // Perform the chosen operation
            switch (choice) {
                case 1:
                    System.out.println("Result: " + addition.add(num1, num2));
                    break;
                case 2:
                    System.out.println("Result: " + subtraction.subtract(num1, num2));
                    break;
                case 3:
                    System.out.println("Result: " + multiplication.multiply(num1, num2));
                    break;
                case 4:
                    try {
                        System.out.println("Result: " + division.divide(num1, num2));
                    } catch (ArithmeticException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;
                default:
                    System.out.println("Invalid option. Please choose a valid operation.");
            }
        }

        // Close the scanner
        scanner.close();
    }
}