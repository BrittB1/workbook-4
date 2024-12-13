package com.pluralsight.dealership;

import java.util.Scanner;

public class VehicleFinder {

    public VehicleFinder(Scanner input) {
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
                    break;

                case "M":

                    break;

                case "R":

                    break;

                case "T":
                    break;

                case "Y":

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
