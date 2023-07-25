package org.diegomouraoficial.exercicios;

import java.util.Locale;
import java.util.Scanner;

/*
 *  Faça um programa que defina tres variaveis (x, y, e z) sem atribuir valores a elas. Mas que
 *  solicite ao usuario os valores para as variaveis x, y e z.
 *
 *  Apresente a saída na tela que corresponda ao calculo do valor  x * y / z
 *
 * */
public class Exercicio04 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);
        System.out.print(" Digite um valor inteiro para x: ");
        int x = sc.nextInt();
        System.out.print(" Digite um valor inteiro para y: ");
        int y = sc.nextInt();
        System.out.print(" Digite um valor inteiro para z: ");
        int z = sc.nextInt();

        double resultado = (double) (x * y) / z;

        System.out.printf(" O valor final é: %.2f%n " , resultado);

        sc.close();
    }
}
