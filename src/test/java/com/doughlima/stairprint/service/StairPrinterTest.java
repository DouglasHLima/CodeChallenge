package com.doughlima.stairprint.service;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StairPrinterTest {



    @Test
     public void testPrint() {
        int steps = 6;
        StairPrinter stairPrinter = new StairPrinter();
        Assertions.assertEquals(0,stairPrinter.getLine().length());
        stairPrinter.print(steps);
        Assertions.assertEquals(steps,stairPrinter.getLine().length());
    }

}