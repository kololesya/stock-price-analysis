package com.laba.solvd;

import java.util.List;

import static com.laba.solvd.StockPriceAnalysis.*;

public class Main {
    public static void main(String[] args) {
        // The stockPricesArray is defined directly in the code. Since you control the data, no input-related exceptions
        // like NumberFormatException or InputMismatchException can occur.
        // Since the program does not take any input from users, there's no need for validation or error handling for
        // invalid inputs.
        try {
            float[] stockPricesArray = {123.5f, 125.0f, 128.75f, 130.0f, 126.5f, 127.75f, 129.0f, 124.5f, 122.0f, 128.5f};

            // Calculate and display the average price
            float averagePrice = calculateAveragePrice(stockPricesArray);
            System.out.println("Average Stock Price: " + averagePrice);

            // Find and display the maximum price
            float maxPrice = findMaximumPrice(stockPricesArray);
            System.out.println("Maximum Stock Price: " + maxPrice);

            // Count occurrences of a specific price
            float targetPrice = 128.75f;
            int occurrences = countOccurrences(stockPricesArray, targetPrice);
            System.out.println("Occurrences of " + targetPrice + ": " + occurrences);

            // Compute and display the cumulative sum
            List<Float> cumulativeSum = computeCumulativeSum(stockPricesArray);
            System.out.println("Cumulative Sum: " + cumulativeSum);
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        }
    }
}