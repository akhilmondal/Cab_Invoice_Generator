package com.cabinvoicegenerator;

public class CabInvoiceGenerator {
    static final double COST_PER_KM = 10;
    static final double COST_PER_MIN = 1;

    public static double calculateFare(double distance, int time) {

        double fare = COST_PER_KM * distance + COST_PER_MIN * time;
        return fare < 5 ? 5 : fare;
    }

    public static void main(String[] args) {

        System.out.println("Welcome to Cab Invoice Generator: ");
        calculateFare(20,30);
    }



}
