package com.cabinvoicegenerator;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class CabInvoiceGeneratorTest {
    CabInvoiceGenerator cabInvoiceGenerator = new CabInvoiceGenerator();

    @Test
    double distance = 2.0;
    int time = 5;
    double result = cabInvoiceGenerator.calculateFare(distance, time);
    Assertions.assertEquals(25, result);
}
