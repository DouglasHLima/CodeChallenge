package com.doughlima.passwordchecker.utils;

public class PasswordConsoleWriter {
    private PasswordConsoleWriter() throws Exception {
        throw new Exception("PasswordConsoleWriter cannot be instantiated");
    }

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String LETTERS_TO_COMPLETE_MESSAGE = "quantidade de letras para completar: ";
    public static final String OK_MESSAGE = "Senha Válida!!";
    public static final String NOT_VALID_MESSAGE = "Senha inválida";
    public static final String EXIT_OPTION = "Insira 0 para sair ou enter para repetir: ";

    public static final String INSTRUCTIONS = String.format("%s%n%s%n%s%n%s%n%s%n%s%n%s",
            "Insira uma senha!",
            "A senha deve:",
            "Possuir no mínimo 6 caracteres",
            "Possuir no mínimo 1 letra minúsculo",
            "Possuir no mínimo 1 letra maiúsculo",
            "Possuir no mínimo 1 caractere especial. Os caracteres especiais são: !@#$%^&*()-+",
            ": ");

    public static void printRedMessageForError(String message){
        System.out.printf("%s%s%s%n",ANSI_RED,message,ANSI_RESET);
    }

    public static void printGreenMessageForOK(String message){
        System.out.printf("%s%s%s%n",ANSI_GREEN,message,ANSI_RESET);
    }

    public static void printIsnstructions(){
        System.out.print(INSTRUCTIONS);
    }

    public static void printLettersToComplete(int lettersToComplete){
        System.out.println(LETTERS_TO_COMPLETE_MESSAGE);
        System.out.println(lettersToComplete);
    }
}
