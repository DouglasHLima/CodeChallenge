# DESAFIO DE PROGRAMAÇÃO

Para executar o código, faça um git clone deste repositório,
abra-o em sua IDE favorita. O projeto possui um pacote para cada desafio.
Cada pacote possui sua própria classe com o método main para serem executados de forma independente.


## Descrição e listagem dos desafios:

 | Questão   | nome                                                                                                         |
|-----------|--------------------------------------------------------------------------------------------------------------|
 | Questão 1 | [StairPrint](https://github.com/DouglasHLima/CodeChallenge/tree/main/src/main/java/com/doughlima/stairprint) |
 | Questão 2 | [PasswordChecker](https://github.com/DouglasHLima/CodeChallenge/tree/main/src/main/java/com/doughlima/passwordchecker)                                                                                          |
 | Questão 3 | [AnagramsChecher](https://github.com/DouglasHLima/CodeChallenge/tree/main/src/main/java/com/doughlima/stairprint)                                                                                          |


# Questão 01

Escreva um algoritmo que mostre na tela uma escada de tamanho n utilizando o caractere * e espaços. A base e altura da escada devem ser iguais ao valor de n. A última linha não deve conter nenhum espaço.
Exemplo:
Entrada:
n = 6


Saída:
```
     *
    **
   ***
  ****
 *****
******
```



# Questão 02

O site considera uma senha forte quando ela satisfaz os seguintes critérios:

- Possui no mínimo 6 caracteres.
- Contém no mínimo 1 digito.
- Contém no mínimo 1 letra em minúsculo.
- Contém no mínimo 1 letra em maiúsculo.
- Contém no mínimo 1 caractere especial. Os caracteres especiais são: !@#$%^&*()-+


Exemplo:
```
Entrada: Ya3
Saída: 3
```

### Explicação:
Ela pode tornar a senha segura adicionando 3 caracteres, por exemplo, &ab, 
transformando a senha em Ya3&ab. 2 caracteres não são suficientes visto 
que a senha precisa ter um tamanho mínimo de 6 caracteres.

# Questão 03
Duas palavras podem ser consideradas anagramas de si mesmas se as 
letras de uma palavra podem ser realocadas para formar a outra palavra.
Dada uma string qualquer, desenvolva um algoritmo que encontre o número
de pares de substrings que são anagramas.

Exemplo 1:
```
Entrada: ovo
Saída: 2
```



### Explicação:
A lista de todos os anagramas pares são: [o, o], [ov, vo] 
que estão nas posições [[0], [2]], [[0, 1], [1, 2]] respectivamente. 


Exemplo 2:
```
Entrada: ifailuhkqq
Saída: 3
```

### Explicação:
A lista de todos os anagramas pares são: [i, i], [q, q] e [ifa, fai] que estão nas posições [[0], [3]], [[8],  [9]] e [[0, 1, 2], [1, 2, 3]].
