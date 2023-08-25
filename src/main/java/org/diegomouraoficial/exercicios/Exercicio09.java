package org.diegomouraoficial.exercicios;

import java.util.Scanner;

/*
 *  Faca um programa que solicite ao usuario o tamanho dos lados de um triangulo.
 *  O programa devera imprimir a classificacao do triangulo quanto aos lados
 *      (equilatero, isosceles e escaleno)
 */
public class Exercicio09 {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);

        System.out.print("Digite o tamanho do lado A do triangulo: ");
        int a = sc.nextInt();
        System.out.print("Digite o tamanho do lado B do triangulo: ");
        int b = sc.nextInt();
        System.out.print("Digite o tamanho do lado C do triangulo: ");
        int c = sc.nextInt();

        if( a == b && b == c) {
            System.out.println("Triângulo é Equilátero.");
        } else if (a == b || a == c || b == c) {
            System.out.println("Triângulo é Isósceles.");
        } else {
            System.out.println("Triângilo é Escaleno");
        }

        sc.close();
        
    }
    
}
