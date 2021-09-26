package com.bl.invoiceGenerator;

public class FareCalculator {



    public void calculateFare(double distance, double time) {
        double totalFare = distance * 10 + time;
        if (totalFare < 5){
            totalFare = 5;
        }
        System.out.println("Total Fare: "+totalFare+" Rs/-");
    }
}
