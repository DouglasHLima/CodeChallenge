package com.doughlima.stairprint.controller;

import com.doughlima.stairprint.service.StairPrinter;

import java.util.Scanner;

/**
 * @author Douglas Lima
 * provides application control logic by reading user input and displaying console values
 * using StairPrinter object
 * @version 1.0
 * @see StairPrinter
 */
public class StairPrintController {

    /**
     * execute the sequence to request an integer via terminal and display the result */
    public void run(){
        Scanner reader = new Scanner(System.in);
        StairPrinter stairPrinter = new StairPrinter();

        System.out.println("Escreva o número de degraus");
        int input = reader.nextInt();

        stairPrinter.print(input);
    }

}
