package com.doughlima.stairprint;

import com.doughlima.stairprint.controller.StairPrintController;

/*
 * Escreva um algoritmo que mostre na tela uma escada de tamanho n utilizando o caractere * e espaços.
 * A base e altura da escada devem ser iguais ao valor de n.
 * A última linha não deve conter nenhum espaço.
 */

public class StairPrinterApplication {
    public static void main(String[] args) {
        new StairPrintController().run();
    }
}
