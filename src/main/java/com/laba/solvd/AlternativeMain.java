package com.laba.solvd;

import java.util.Scanner;

import static com.laba.solvd.StockPriceAnalysis.*;

public class AlternativeMain {
    private static void displayMenu() {
        System.out.println("Choose an operation:");
        System.out.println("1. Calculate Average Price");
        System.out.println("2. Find Maximum Price");
        System.out.println("3. Count Occurrences of a Price");
        System.out.println("4. Compute Cumulative Sum");
        System.out.println("5. Exit");
        System.out.print("Choose an option: ");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Input stock prices for array
        int days = 0;
        while (true) {
            try {
                System.out.println("Enter the number of days (for array data):");
                days = Integer.parseInt(scanner.nextLine());
                if (days <= 0) {
                    System.out.println("Number of days must be positive. Try again.");
                    continue;
                }
                break; // Exit loop when valid input is provided
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a positive integer.");
            }
        }
        float[] stockPrices = new float[days];
        for (int i = 0; i < days; i++) {
            while (true) {
                try {
                    System.out.println("Enter stock price for day " + (i + 1) + ":");
                    stockPrices[i] = Float.parseFloat(scanner.nextLine());
                    break; // Exit loop when valid input is provided
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Please enter a valid float value.");
                }
            }
        }

        // Step 2: Choose task
        while (true) {
            try{
                displayMenu();
                int choice = Integer.parseInt(scanner.nextLine());

                switch (choice) {
                    case 1: // Calculate and display the average price
                        System.out.println("Average Price: " + calculateAveragePrice(stockPrices));
                        break;
                    case 2: // Find and display the maximum price
                        System.out.println("Maximum Price: " + findMaximumPrice(stockPrices));
                        break;
                    case 3: // Count occurrences of a specific price
                        System.out.println("Enter target price to count:");
                        float target = 0;
                        while (true) {
                            try {
                                target = Float.parseFloat(scanner.nextLine());
                                break;
                            } catch (NumberFormatException e) {
                                System.out.println("Invalid input. Please enter a valid float value.");
                            }
                        }
                        System.out.println("Occurrences: " + countOccurrences(stockPrices, target));
                        break;
                    case 4: // Compute and display the cumulative sum
                        System.out.println("Cumulative Sum: " + computeCumulativeSum(stockPrices));
                        break;
                    case 5: // Exit
                        System.out.println("Exiting the system.");
                        scanner.close();
                        return;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            } catch (NumberFormatException e){
                System.out.println("Invalid input. Please enter a number between 1 and 5.");
            } catch (Exception e) {
                System.out.println("An unexpected error occurred: " + e.getMessage());
            }
        }
    }
}
