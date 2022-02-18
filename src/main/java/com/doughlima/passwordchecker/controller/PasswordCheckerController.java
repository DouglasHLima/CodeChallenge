package com.doughlima.passwordchecker.controller;

import com.doughlima.passwordchecker.service.validation.ValidationDriver;
import com.doughlima.passwordchecker.utils.PasswordConsoleWriter;

import java.util.Scanner;

public class PasswordCheckerController {
    public void run(){
        Scanner reader = new Scanner(System.in);
        ValidationDriver validationDriver = new ValidationDriver();

        PasswordConsoleWriter.printIsnstructions();
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
