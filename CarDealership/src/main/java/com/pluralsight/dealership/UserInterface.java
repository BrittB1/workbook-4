package com.pluralsight.dealership;

import java.util.Scanner;

public class UserInterface {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

Dealership d = new Dealership("PalmTree Motors", "234 Keylime Street","813-994-775");


        System.out.println("Welcome to the PalmTree Motors! \uD83C\uDF34 ");

        showHomeScreen(userInput,d);
    }
    public static void showHomeScreen(Scanner userInput, Dealership d) {
        boolean homeScreenMenu = true;

        while (homeScreenMenu) {
            System.out.println("""
                         ==================================
                                     HOME MENU
                         ==================================
                         Please select an option to get started:
                        \s
                         F. FIND a vehicle
                         L. LIST all vehicles
                         A. ADD a Vehicle
                         R. REMOVE a vehicle
                         Q. Quit
                    \s""");
            System.out.print("Enter your choice: ");
            String choice = userInput.nextLine().toUpperCase();

            switch (choice) {
                case "F":
                    VehicleFinder f = new VehicleFinder(userInput, d);
                    break;
                case "A":

                    addVehicle(userInput, d);
                    break;
                case "L":
                    listVehicles(userInput, d);
                    break;
                case "R":
                    removeVehicle(userInput, d);
                    break;
                case "Q":
                    homeScreenMenu = false;
                    System.out.println("Exiting...Thank you and come again! \uD83D\uDE04 ");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void removeVehicle(Scanner userInput, Dealership d) {
    }

    private static void listVehicles(Scanner userInput, Dealership d) {
    }

    private static void addVehicle(Scanner userInput, Dealership d) {
    }
}
