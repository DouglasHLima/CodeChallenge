package com.doughlima.stairprint.service;

/**
 * class that performs console printing of a "stairway",
 * where each step is defined by the parameter "steps"
 * and each line will have the amount of steps increasingly
 * @author Douglas Lima.
 */
public class StairPrinter {
    private String line = "";

    /**
     * Prints to the console the steps of the stairs
     * based on the input value
     * @param steps int - steps of stair to be printed.
     */
    public void print(int steps){
        final String FILL = "*";
        for (int i = 0; i < steps; i++) {
            line = line.concat(FILL);
            System.out.printf("%"+steps+"s%n",line);
        }
    }

    public String getLine() {
        return line;
    }
}
