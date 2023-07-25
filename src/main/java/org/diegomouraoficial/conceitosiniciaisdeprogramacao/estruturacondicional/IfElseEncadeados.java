package org.diegomouraoficial.conceitosiniciaisdeprogramacao.estruturacondicional;

import java.util.Scanner;

/*
 *   if(<expressao logica>) {
 *       instrucoes a serem executadas caso a <expressao logica> seja verdadeira.
 *   }  else if {
 *       instrucoes a serem executadas caso a <expressao logica> seja verdadeira.
 *   } else {
 *       instrucoes a serem executadas caso a <expressao logica> seja falsa.
 *   }
 *
 * */

public class IfElseEncadeados {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Entre com um valor para x: ");
        int x = sc.nextInt();
        System.out.print("Entre com um valor para y: ");
        int y = sc.nextInt();
        System.out.print("Entre com um valor para z: ");
        int z = sc.nextInt();

        if( x > y && x > z) {
            System.out.println("O maior é x:" + x);
        } else if (y > x && y > z) {
            System.out.println("O maior é y: " + y);
        }else{
            System.out.println("O maior é z: " + z);
        }

        sc.close();
    }
}
