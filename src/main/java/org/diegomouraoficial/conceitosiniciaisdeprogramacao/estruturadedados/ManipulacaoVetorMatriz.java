package org.diegomouraoficial.conceitosiniciaisdeprogramacao.estruturadedados;

import java.util.Locale;
import java.util.Scanner;

public class ManipulacaoVetorMatriz {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        int[] idadeAlunos = new int[10];
        float[][] notasAlunos = new float[10][3];

        for (int i = 0; i < 10; i++) {
            System.out.print("Entre com a idade do " + (i + 1) + "° aluno: ");

            idadeAlunos[i] = sc.nextInt();
        }
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Entre com a nota da AV" + (j + 1) + " do " + (i + 1) + "° aluno:");

                notasAlunos[i][j] = sc.nextFloat();
            }
        }

        sc.close();
    }
}
