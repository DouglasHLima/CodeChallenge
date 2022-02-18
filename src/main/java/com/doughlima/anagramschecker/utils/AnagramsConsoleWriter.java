package com.doughlima.anagramschecker.utils;

/**@author Douglas Lima.
 * utility class for storing messages and writing methods that will be displayed
 * to the user during application execution
 */
public class AnagramsConsoleWriter {

    /**
     * private constructor to prohibit unnecessary class initialization
     * @throws Exception Exception - throw exception if this class is built
     */
    private AnagramsConsoleWriter() throws Exception {
        throw new Exception("AnagramsConsoleWriter cannot be instantiated");
    }

    private static final String INSERT_A_WORD_MESSAGE = "Insira uma palavra para verificar a quantidade de anagramas";
    private static final String RESULT = "A quantidade de anagramas de substrings possíveis é: %s %n";

    /**
     * Print the message for request a input
     */
    public static void WriteInsertionMessage(){
        System.out.println(INSERT_A_WORD_MESSAGE);
    }

    /**
     * Print A formated result of application
     * @param value int - value of possible substrings anagrams
     */
    public static void WriteResults(int value){
        System.out.printf(RESULT,value);
    }
}
