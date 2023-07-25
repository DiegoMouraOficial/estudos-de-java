package org.diegomouraoficial.conceitosiniciaisdeprogramacao.estruturacondicional;

public class IfElseEncadeados2 {
    public static void main(String[] args) {

        double nota = 10;

        if(nota >= 10) {
            System.out.println("Excelente, você passou e alcançou a nota máxima.");
        } else if (nota >= 7.0) {
            System.out.println("Parabéns, você passou.");
        } else if (nota >= 5.0) {
        System.out.println("Bom trabalho, você passou.");
        } else if (nota >= 3.5) {
            System.out.println("Você está de recuperação.");
        } else {
            System.out.println("Você foi reprovado (a)!");
        }
    }
}
