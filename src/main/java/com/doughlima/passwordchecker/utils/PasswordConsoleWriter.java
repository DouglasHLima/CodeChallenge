package com.doughlima.passwordchecker.utils;

/**
 * utility class for storing messages and writing methods that will be displayed
 * to the user during application execution
 * @author Douglas Lima.
 */
public final class PasswordConsoleWriter {

    /**
     * private constructor to prohibit unnecessary class initialization
     * @throws Exception Exception - throw exception if this class is built
     */
    private PasswordConsoleWriter() throws Exception {
        throw new Exception("PasswordConsoleWriter cannot be instantiated");
    }

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String LETTERS_TO_COMPLETE_MESSAGE = "quantidade de letras para completar: ";
    public static final String OK_MESSAGE = "Senha Válida!!";
    public static final String NOT_VALID_MESSAGE = "Senha inválida";

    public static final String INSTRUCTIONS = String.format("%s%n%s%n%s%n%s%n%s%n%s%n%s",
            "Insira uma senha!",
            "A senha deve:",
            "Possuir no mínimo 6 caracteres",
            "Possuir no mínimo 1 letra minúsculo",
            "Possuir no mínimo 1 letra maiúsculo",
            "Possuir no mínimo 1 caractere especial. Os caracteres especiais são: !@#$%^&*()-+",
            ": ");

    /**
     * Print a RED message for errors or Test Fail
     * @param message String - message to be printed in RED
     */
    public static void printRedMessageForError(String message){
        System.out.printf("%s%s%s%n",ANSI_RED,message,ANSI_RESET);
    }

    /**
     * Print a GREEN message for OK or Test Pass.
     * @param message String - message to be printed in GREEN
     */
    public static void printGreenMessageForOK(String message){
        System.out.printf("%s%s%s%n",ANSI_GREEN,message,ANSI_RESET);
    }

    /**
     * Print instructions of what the password should contain
     */
    public static void printInstructions(){
        System.out.print(INSTRUCTIONS);
    }

    /**
     * Prints the result of remaining digits to complete the password
     * @param lettersToComplete int - Value of missing digits
     */
    public static void printLettersToComplete(int lettersToComplete){
        System.out.println(LETTERS_TO_COMPLETE_MESSAGE);
        System.out.println(lettersToComplete);
    }
}
