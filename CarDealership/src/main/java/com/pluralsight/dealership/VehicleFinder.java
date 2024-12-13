package com.pluralsight.dealership;

import com.pluralsight.searchcriteria.PriceRangeFinder;

import java.util.Scanner;

public class VehicleFinder extends PriceRangeFinder{

    public VehicleFinder(Scanner input, Dealership d) {
        while (true) {

            System.out.println("""
                    
                     =====================================
                      Choose criteria to find a vehicle by
                     =====================================
                         Choose an option by letter:
                             💰 P. Price Range
                             🚘 M. Make/Model
                              ⛽ R. Mileage Range
                              🚙 T.Type
                              📆 Y.Year
                              🏠 X. Back to Home Screen
                    """);
            String choice = input.nextLine().trim().toUpperCase();

            switch (choice) {

                case "P":
                    //TODO: Declare a method that lets user enter a price range and returns vehicles that between the given amounts
                      findByPrice(input);

                    break;

                case "M":
                    //TODO : Declare a method that lets the user chose to locate a vehicle by make, model, or both and returns vehicles matching the chosen criteria
                    break;

                case "R":
                    System.out.println("Enter the mileage range of the vehicle you're searching for: ");
                    //TODO: Declare a method that lets the user enter a mileage range and return vehicles that are between the given amounts


                    break;

                case "T":
                    //TODO: Declare a method that lets the user enter the type of vehicle (truck,car,van,etc;) and returns vehicles matching the chose criteria


                    break;

                case "Y":
                    //TODO: Declare a method that lets the user enter a year and returns vehicles matching the chosen criteria


                    break;

                case "X":
                    System.out.println("Are you sure you'd like to cancel and go back to the home screen? (Y/N) ");
                    String backOption = input.nextLine();
                    boolean backHome;
                    if (backOption.toUpperCase().startsWith("Y")) {
                        backHome = true;
                        return;
                    }
                    break;
            }

        }

    }
}
