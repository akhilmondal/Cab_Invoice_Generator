package com.cabinvoicegenerator;

import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class CabInvoiceGeneratorTest {
    static CabInvoiceGenerator cabInvoiceGenerator = new CabInvoiceGenerator();
    @Test
    public void testCabInvoiceGenerator() { //step1: This  is my test case for Calculate Fare
        double distance = 2.0;
        double time = 5.0;
        double result = cabInvoiceGenerator.calculateFare(distance, time);
        Assert.assertEquals(25, result,0.0);
    }
    @Test
    public void givenMultipleRidesShouldReturnAggregateFare() {
        CabInvoiceGenerator cabInvoice = new CabInvoiceGenerator();
        Ride[] rides = {new Ride(0.4, 0.5), new Ride(5.5, 3.5), new Ride(2.5, 2.3)};
        double fare = cabInvoice.calculateFare(rides);
        Assert.assertEquals(90.8, fare, 0.0);
    }


}
