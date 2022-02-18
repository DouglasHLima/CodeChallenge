package com.doughlima.stairprint.service;


/**
 * class that performs console printing of a "stairway",
 * where each step is defined by the parameter "steps"
 * and each line will have the amount of steps increasingly
 */

public class StairPrinter {
    private final String FILL = "*";
    private String line = "";

    public void print(int steps){
        for (int i = 0; i < steps; i++) {
            line = line.concat(FILL);
            System.out.printf("%"+steps+"s%n",line);
        }
    }
}
