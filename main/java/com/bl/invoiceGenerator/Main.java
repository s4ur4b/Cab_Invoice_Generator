package com.bl.invoiceGenerator;

public class Main {
    public static void main(String[] args) {

        FareCalculator fareCalculator = new FareCalculator();
        fareCalculator.addRide();
        fareCalculator.calculateFare();
    }
}
