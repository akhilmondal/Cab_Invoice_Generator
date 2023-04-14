package com.cabinvoicegenerator;

import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class CabInvoiceGeneratorTest {
    static CabInvoiceGenerator cabInvoiceGenerator = new CabInvoiceGenerator();
    @Test
    public void testCabInvoiceGenerator() { //step1: This  is my test case for Calculate Fare
        double distance = 2.0;
        int time = 5;
        double result = cabInvoiceGenerator.calculateFare(distance, time);
        Assert.assertEquals(25, result,0.0);
    }


}
