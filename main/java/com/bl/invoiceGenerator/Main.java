package com.bl.invoiceGenerator;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Hashtable <String, ArrayList<Ride>> rideList = new Hashtable<>();

        FareCalculator fareCalculator = new FareCalculator();

        Scanner scan = new Scanner(System.in);

        int EXIT = 5;
        int choice = 0;

        while (choice != EXIT) {
            System.out.println("1. Add Ride ");
            System.out.println("2. Get Fare BY ID");
            System.out.println("3. Get Total Fare");
            System.out.println("4. Display Ride Details" );
            System.out.println(EXIT+". Exit");
            choice = scan.nextInt();

            switch (choice) {
                case 1:
                    rideList = fareCalculator.addRide();
                    break;
                case 2:
                    System.out.println("Enter ID");
                    String id = scan.next();
                    fareCalculator.getRideDetails(id,rideList);
                    break;
                case 3:
                    fareCalculator.calculateFare(rideList);
                    break;
                case 4:
                    fareCalculator.displayRides(rideList);
                    break;
            }
        }
    }
}