package com.doughlima.passwordchecker.controller;

import com.doughlima.passwordchecker.service.validation.ValidationDriver;
import com.doughlima.passwordchecker.utils.PasswordConsoleWriter;

import java.util.Scanner;

/**
 * Provides application control logic by reading user input
 * and displaying console results of ValidationDriver.
 * The message will be RED for a wrong password
 * or will be Green foa a correct password.
 * @see ValidationDriver
 * @author Douglas Lima
 */
public class PasswordCheckerController {
    public void run(){
        Scanner reader = new Scanner(System.in);
        ValidationDriver validationDriver = new ValidationDriver();

        PasswordConsoleWriter.printInstructions();
        String password = reader.next();

        Boolean isValid = validationDriver.validate(password);

        if (isValid) {
            PasswordConsoleWriter.printGreenMessageForOK(PasswordConsoleWriter.OK_MESSAGE);
        } else {
            PasswordConsoleWriter.printRedMessageForError(PasswordConsoleWriter.NOT_VALID_MESSAGE);
        }
        PasswordConsoleWriter.printLettersToComplete(validationDriver.getLettersToComplete(password));
    }
}
