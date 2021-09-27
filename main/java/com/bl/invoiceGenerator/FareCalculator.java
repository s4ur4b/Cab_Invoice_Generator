package com.bl.invoiceGenerator;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.BinaryOperator;

public class FareCalculator {
    Hashtable<String, ArrayList<Ride>> rideList = new Hashtable<>();
    Ride ride = null;
    ArrayList<Ride> rideDetails = new ArrayList<>();

    public Hashtable<String, ArrayList<Ride>> addRide() {
        Scanner scan = new Scanner( System.in );

        System.out.println( "Enter ID" );
        String id = scan.next( );

        ride = new Ride( );
        System.out.println( "Enter Distance in km" );
        ride.setDistance( scan.nextDouble( ) );
        System.out.println( "Enter Time of Journey in min" );
        ride.setTime( scan.nextDouble( ) );

        rideDetails = new ArrayList <>( );
        rideDetails.add( ride );

        rideList.put( id , rideDetails );

        return rideList;

    }


    public void calculateFare(Hashtable <String, ArrayList <Ride>> rideList) {
        AtomicInteger totalFareValue = new AtomicInteger(  );
        rideList.keySet().forEach( entry -> {
            ArrayList<Ride> rideDetails = rideList.get(entry);
            for (Ride ride: rideDetails){
                double totalFare = 0;
                double fare = ride.getDistance() * 10 + ride.getTime();
                totalFareValue.addAndGet( (int) fare );
            }
        });
            System.out.println( totalFareValue);
        double averageFarePerRide = totalFareValue.intValue() / rideList.size();
        System.out.println("INVOICE:");
        System.out.println("Total Number Of Rides: " + rideList.size());
        System.out.println("Total Aggregate Fare: " + totalFareValue + " Rs/-");
        System.out.println("Average Fare Per Ride: " + averageFarePerRide + " Rs/-");
    }

    public void displayRides(Hashtable <String, ArrayList <Ride>> rideList) {
        rideList.keySet().forEach( entry -> System.out.println(entry+" -->"+rideList.get(entry)+"\n" ) );
    }


    public void getRideDetails(String id , Hashtable<String, ArrayList<Ride>> rideList) {
        rideList.keySet().forEach( entry -> {
            if (entry.equals( id )){
                System.out.println(rideList.get( entry ) );
                ArrayList<Ride> rideDetails = rideList.get(entry);
                for (Ride ride: rideDetails){
                    double totalFare = 0;
                    double fare = ride.getDistance() * 10 + ride.getTime();
                    System.out.println("Fare : "+fare+" Rs/-" );
                }
            }
        } );
    }
}
