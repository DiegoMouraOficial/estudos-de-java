package org.diegomouraoficial.exercicios;

/*
*  Faca um programa que defina duas variaveis inteiras (a e b) e que solicite ao usuario os valores delas.
*
*  Utilizando a estrutura condicional if-else, imprima os dois valores atribuidos e o maior valor digitado.
*
*  Exemplo:
*
*  Valor de A: 10
*  Valor de B: 20
*  Maior: 20
*
*  Modifique o programa acima, criando uma variavel com o nome (maior). Utilizando o operador ternario,
*   atribua o maior valor a variavel maior e apresente na tela em seguida da mesma forma que foi
*     exemplificado acima.
*
* */

public class Exercicio08 {
    public static void main(String[] args) {

        int a = 50;
        int b = 30;

        int maior = (a > b) ? a : b;

        System.out.println("----- Resultado -----");
        System.out.println("Valor de A: " + a);
        System.out.println("Valor de B: " + b);
        System.out.println("Maior: " + maior);

    }
}
