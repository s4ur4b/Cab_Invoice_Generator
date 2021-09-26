package com.bl.invoiceGenerator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FareCalculator {
        List<Ride> rideList = new ArrayList<>();

    public void addRide(){
        Scanner scan = new Scanner(System.in);

//        Ride ride1 = new Ride();
//        ride1.distance = 15;
//        ride1.time = 60;
//        rideList.add(ride1);
//        Ride ride2 = new Ride();
//        ride2.distance = 7;
//        ride2.time = 50;
//        rideList.add(ride2);
//        Ride ride3 = new Ride();
//        ride3.distance = 26;
//        ride3.time = 128;
//        rideList.add(ride3);

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
        System.out.println("Total Aggregate Fare: "+totalFare+" Rs/-");
    }
}
