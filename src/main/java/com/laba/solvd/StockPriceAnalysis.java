package com.laba.solvd;

import java.util.ArrayList;
import java.util.List;

public class StockPriceAnalysis {
    // Calculate the average stock price
    public static float calculateAveragePrice(float[] prices) {
        if (prices == null || prices.length == 0) { // we check it even in the task it's written that both the array and ArrayList of stock prices is not null and contains at least one element
            throw new IllegalArgumentException("Prices array cannot be null or empty");
        }
        float sum = 0;
        for (float price : prices) {
            sum += price;
        }
        return sum / prices.length;
    }

    // Find the maximum stock price
    public static float findMaximumPrice(float[] prices) {
        if (prices == null || prices.length == 0) {
            throw new IllegalArgumentException("Prices array cannot be null or empty");
        }
        float maxPrice = prices[0];
        for (float price : prices) {
            if (price > maxPrice) {
                maxPrice = price;
            }
        }
        return maxPrice;
    }

    // Determine the occurrence count of a specific price
    public static int countOccurrences(float[] prices, float targetPrice) {
        if (prices == null) {
            throw new IllegalArgumentException("Prices array cannot be null");
        }
        int count = 0;
        for (float price : prices) {
            if (price == targetPrice) {
                count++;
            }
        }
        return count;
    }

    // Compute the cumulative sum of stock prices
    public static List<Float> computeCumulativeSum(float[] prices) {
        if (prices == null || prices.length == 0) {
            throw new IllegalArgumentException("Prices list cannot be null or empty");
        }
        List<Float> cumulativeSum = new ArrayList<>();
        float sum = 0;
        for (float price : prices) {
            sum += price;
            cumulativeSum.add(sum);
        }
        System.out.println("The sum for 10 days is " + sum);
        return cumulativeSum;
    }
}
