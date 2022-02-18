package com.doughlima.anagramschecker.utils;

public class AnagramsConsoleWriter {
    private AnagramsConsoleWriter() throws Exception {
        throw new Exception("AnagramsConsoleWriter cannot be instantiated");
    }

    private static final String INSERT_A_WORD_MESSAGE = "Insira uma palavra para verificar a quantidade de anagramas";
    private static final String RESULT = "A quantidade de anagramas de substrings possíveis é: %s %n";

    public static void WriteInsertionMessage(){
        System.out.println(INSERT_A_WORD_MESSAGE);
    }

    public static void WriteResults(int value){
        System.out.printf(RESULT,value);
    }
}
