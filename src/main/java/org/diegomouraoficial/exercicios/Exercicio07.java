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
* */

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor de A: ");
        int a = sc.nextInt();

        System.out.print("Digite o valor de B: ");
        int b = sc.nextInt();

        if( a > b) {
            System.out.println("----- Resultado -----");
            System.out.println("Valor de A: " + a);
            System.out.println("Valor de B: " + b);
            System.out.println("Maior é A: " + a);
        } else {
            System.out.println("----- Resultado -----");
            System.out.println("Valor de A: " + a);
            System.out.println("Valor de B: " + b);
            System.out.println("Maior é B: " + b);
        }

        sc.close();

    }
}
