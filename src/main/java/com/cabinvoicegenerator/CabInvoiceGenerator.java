package com.cabinvoicegenerator;

public class CabInvoiceGenerator {

    static final double COST_PER_KM = 10;
    static final double COST_PER_MIN = 1;

    public static double calculateFare(double distance, double time) {

        double fare = COST_PER_KM * distance + COST_PER_MIN * time;
        return fare < 5 ? 5 : fare;
    }
    public double calculateFare(Ride[] rides) {
        double aggregateFare = 0 ;
        for (Ride ride:rides) {
            double totalFare = calculateFare(ride.getDistance(), ride.getTime());
            aggregateFare += totalFare;

        }
        return aggregateFare;
    }
        public static void main(String[] args) {

        System.out.println("Welcome to Cab Invoice Generator: ");
        CabInvoiceGenerator cabInvoiceGenerator = new CabInvoiceGenerator();
        calculateFare(20,30);
        Ride[] rides = {new Ride(0.4, 0.5), new Ride(5.5, 3.5), new Ride(2.5, 2.3)};

        double totalFare =  cabInvoiceGenerator.calculateFare(rides);
        System.out.println(totalFare);
    }
}
