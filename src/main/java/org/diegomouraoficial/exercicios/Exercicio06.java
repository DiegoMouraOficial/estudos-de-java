package org.diegomouraoficial.exercicios;

/*
*  Considere dois pontos no plano cartesiano, o PONTO 1 e o PONTO 2, e suas respectivas coordenadas.
*
*  As coordenadas do PONTO 1 sao definidas pelas variaveis x1 e y1, e as coordenadas do Ponto 2 sao
*   definidas pelas variaveis x2 e y2.
*
*  Faca um programa que calcule a distancia euclidiana (d) entre dois pontos considerados os valores
*   digitados pelo usuario para as variaveis x1, y1, x2 e y2.
*
*  Considere d = (x1 - x2)² + (y1 - y2)². O programa devera ter a seguinte saida:
*
*  Ponto 1:(2,3)
*  Ponto 2:(4,5)
*  Distancia: 2.8
*
* */

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.println("---- Programa para calcular a Distância Euclidiana. ----");

        System.out.print("Digite a coordenada x do Ponto 1: ");
        double x1 = sc.nextInt();
        System.out.print("Digite a coordenada y do Ponto 1: ");
        double y1 = sc.nextInt();

        System.out.print("Digite a coordenada x do Ponto 2: ");
        double x2 = sc.nextInt();
        System.out.print("Digite a coordenada y do Ponto 2: ");
        double y2 = sc.nextInt();

        // Calculando a distancia entre os dois pontos
       double distancia = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));

       //Criando um objeto Decimal para formatar com 2 casas decimais
        DecimalFormat formatoDistancia = new DecimalFormat("#.00");
        String distanciaFormatada = formatoDistancia.format(distancia);

        System.out.println("---- Resutado da Distância Euclidiana ----");
        System.out.println(" Ponto 1: (" + x1 + ", " + y1 + ")");
        System.out.println(" Ponto 2: (" + x2 + ", " + y2 + ")");
        System.out.println(" Distância: " + distanciaFormatada);


        sc.close();

    }
}
