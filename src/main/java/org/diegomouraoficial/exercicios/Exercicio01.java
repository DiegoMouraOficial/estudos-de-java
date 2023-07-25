package org.diegomouraoficial.exercicios;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Escreva seu primeiro nome: ");
        String nome = sc.next();
        System.out.print("Escreva seu sobrenome: ");
        String sobreNome = sc.next();

        System.out.println("Olá " + nome + " " + sobreNome + ", bem-vindo ao mundo do Java.");

        sc.close();
    }
}
