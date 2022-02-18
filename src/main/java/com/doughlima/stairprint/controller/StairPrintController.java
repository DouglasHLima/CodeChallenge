package com.doughlima.stairprint.controller;

import com.doughlima.stairprint.service.StairPrinter;

import java.util.Scanner;

/**
 * provides application controlle logic by reading user input and displaying console values
 */

public class StairPrintController {

    public void run(){
        Scanner reader = new Scanner(System.in);
        StairPrinter stairPrinter = new StairPrinter();

        System.out.println("Escreva o número de degraus");
        int input = reader.nextInt();

        stairPrinter.print(input);
    }

}
