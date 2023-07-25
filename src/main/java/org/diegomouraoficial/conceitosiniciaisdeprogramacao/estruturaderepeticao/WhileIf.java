package org.diegomouraoficial.conceitosiniciaisdeprogramacao.estruturaderepeticao;

import java.util.Scanner;

public class WhileIf {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numero;

        System.out.print( "Insira números positivos (insira um número negativo para parar): ");

        while (true) {
            numero = sc.nextInt();

            if(numero < 0) {
                break;
            }

            System.out.println("Número inserido: " + numero);
        }

        System.out.println("Loop encerrado.");
        sc.close();

    }
}
