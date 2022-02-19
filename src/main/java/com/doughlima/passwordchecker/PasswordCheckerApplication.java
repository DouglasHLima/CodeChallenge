package com.doughlima.passwordchecker;

import com.doughlima.passwordchecker.controller.PasswordCheckerController;

/*
*construa um algoritmo que informe qual é o número mínimo de caracteres que devem ser adicionados
*para uma string qualquer ser considerada segura.
*satisfaz os seguintes critérios:
Possui no mínimo 6 caracteres.
Contém no mínimo 1 digito.
Contém no mínimo 1 letra em minúsculo.
Contém no mínimo 1 letra em maiúsculo.
Contém no mínimo 1 caractere especial. Os caracteres especiais são: !@#$%^&*()-+
* */
public class PasswordCheckerApplication {
    public static void main(String[] args) {
        new PasswordCheckerController().run();
    }
}
