package com.pluralsight.searchcriteria;
import java.util.Scanner;

public class PriceRangeFinder{

    protected void findByPrice(Scanner input) {
        // try block that handles erroneous input
        try {
            // Lines 8-12 ask user for a minimum + maximum price, then reads and converts input from text to a decimal number
            System.out.println("Enter the minimum price: $");
            double minPrice = Double.parseDouble(input.nextLine());

            System.out.println("Enter the maximum price: $");
            double maxPrice = Double.parseDouble(input.nextLine());

            if (minPrice > maxPrice) {
                System.out.println("Error:Minimum price cannot be greater than maximum price. Please try again");
                return; // exits this particular method if entered price range is invalid
            }
        } catch (Exception e) {
            System.out.println("Error:Please enter valid numerical values for price range");
        }
    }

}
