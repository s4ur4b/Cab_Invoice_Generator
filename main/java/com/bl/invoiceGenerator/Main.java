package com.bl.invoiceGenerator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Distance Travelled in km");
        double distance = scanner.nextDouble();
        System.out.println("Enter Time of Journey");
        double time = scanner.nextDouble();

        FareCalculator fareCalculator = new FareCalculator();
        fareCalculator.calculateFare(distance,time);
    }
}
