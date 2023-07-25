package org.diegomouraoficial.conceitosiniciaisdeprogramacao.estruturacondicional;

import java.util.Scanner;

/*
 *   if(<expressao logica>) {
 *       instrucoes a serem executadas caso a <expressao logica> seja verdadeira.
 *   } else {
 *       instrucoes a serem executadas caso a <expressao logica> seja falsa.
 *   }
 *
 * */

public class IfElse2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número para saber se é para ou ímpar: ");
        int x = sc.nextInt();

        if(x % 2 == 0) {
            System.out.println(" É par!");
        } else {
            System.out.println(" É ímpar!");
        }

        sc.close();
    }
}
