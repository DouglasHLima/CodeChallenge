package com.doughlima.anagramschecker;

import com.doughlima.anagramschecker.controller.AnagramsChekerController;


/*
* Duas palavras podem ser consideradas anagramas de si mesmas
* se as letras de uma palavra podem ser realocadas para formar a outra palavra.
* Dada uma string qualquer, desenvolva um algoritmo que encontre o número de pares de substrings
* que são anagramas.
*/
public class AnagramsChekerApplication {

    public static void main(String[] args) {
        new AnagramsChekerController().run();
    }
}
