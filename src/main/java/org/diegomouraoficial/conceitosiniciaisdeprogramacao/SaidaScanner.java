package org.diegomouraoficial.conceitosiniciaisdeprogramacao;


import java.util.Locale;
import java.util.Scanner;

public class SaidaScanner {
    public static void main(String[] args) {

       Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = sc.nextInt();

        System.out.println(" O número digitado foi: " + numero);

        System.out.print("Agora digite um número decimal: ");
        double numero1 = sc.nextDouble();

        System.out.println(" O número digitado foi: " + numero1);

        sc.close();
    }
}
