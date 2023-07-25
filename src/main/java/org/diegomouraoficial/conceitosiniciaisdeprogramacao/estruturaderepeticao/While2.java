package org.diegomouraoficial.conceitosiniciaisdeprogramacao.estruturaderepeticao;

public class While2 {
    public static void main(String[] args) {

        int contador = 1;
        int soma = 0;

        while (contador <= 100) {
            soma += contador; // soma = soma + contador
            contador++;
        }
        System.out.println("A soma dos números de 1 a 100 é: " + soma);
    }
}
