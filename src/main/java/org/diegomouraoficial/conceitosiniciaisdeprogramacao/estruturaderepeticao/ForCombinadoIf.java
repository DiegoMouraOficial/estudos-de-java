package org.diegomouraoficial.conceitosiniciaisdeprogramacao.estruturaderepeticao;

import java.util.Scanner;

public class ForCombinadoIf {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um valor: ");
        int maior = sc.nextInt();
        System.out.println("Maior: " + maior);

        for (int i = 1; i <= 9; i++) {
            System.out.println("Digite um valor: ");
            int x = sc.nextInt();
            if(x > maior) {
                maior = x;
            }
            System.out.println(" Maior: " + maior);
        }

        sc.close();
    }
}
