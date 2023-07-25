package org.diegomouraoficial.conceitosiniciaisdeprogramacao.estruturaderepeticao;

public class EstruturasCombinadas {
    public static void main(String[] args) {

        int qtdNumeroPrimos = 0;

        for(int i = 2; i <= 10; i++) {
            System.out.println(i + " é Primo?");
            int numeroDivisores = 0;
            int j = 1;
            while (j <= i) {
                if (i % j == 0) {
                    numeroDivisores++;
                }
                j++;
            }
            if (numeroDivisores == 2) {
                qtdNumeroPrimos++;
            System.out.println("...Sim!");
            } else {
                System.out.println("...Não!");
            }
        }
        System.out.println("Quantidade d números primos: " + qtdNumeroPrimos);
    }
}
