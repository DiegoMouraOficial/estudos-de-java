package org.diegomouraoficial.conceitosiniciaisdeprogramacao.operadores;

/*
*    SINTAXE
* <expressao logica> ? Valor caso a <expressao logica> seja verdadeira : valor
*    caso a <expressao logica> seja falsa;
*
* */

import java.util.Scanner;

public class OperadorTernario {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Entre com um valor para x: ");
        int x = sc.nextInt();

        System.out.println(x % 2 == 0 ? "O número é par!" : "O número é ímpar!");

        sc.close();
    }
}
