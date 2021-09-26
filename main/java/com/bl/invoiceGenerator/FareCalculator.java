package com.bl.invoiceGenerator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FareCalculator {
        List<Ride> rideList = new ArrayList<>();

    public void addRide(){
        Scanner scan = new Scanner(System.in);

        int EXIT = 2;
        int choice = 0;
        while (choice != EXIT){
            System.out.println("1. Add Ride ");
            System.out.println("2. Exit");
            choice = scan.nextInt();
            switch (choice){
                case 1:
                    Ride ride = new Ride();
                    System.out.println("Enter Distance in km");
                    ride.distance = scan.nextDouble();
                    System.out.println("Enter Time of Journey in min");
                    ride.time = scan.nextDouble();
                rideList.add(ride);
                break;

            }
        }

    }

    public void calculateFare() {
        double totalFare = 0;
        for (Ride details: rideList){
        double fare = details.distance * 10 + details.time;
        if (fare < 5){
            fare = 5;
        }
        totalFare += fare;
        }
        double averageFarePerRide = totalFare/rideList.size();
        System.out.println("INVOICE:");
        System.out.println("Total Number Of Rides: "+rideList.size());
        System.out.println("Total Aggregate Fare: "+totalFare+" Rs/-");
        System.out.println("Average Fare Per Ride: "+averageFarePerRide+" Rs/-");

    }
}
