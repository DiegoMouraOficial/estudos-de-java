package org.diegomouraoficial.exercicios;

import java.util.Scanner;

/*
*  Faca um programa que calcule a distancia em quilometros (km) percorrida por um carro.
*
*  Solicite ao usuario a velocidade em quilometros por hora(km/h) e o tempo da viagem em horas.
*
*  O programa deve apresentar a velocidade e o tempo informados pelo usuario, bem como a distancia calculada.
*
*  Ex:
*  Velocidade: 100 km/h
*  Tempo da viagem: 3 horas
*  Distancia percorrida: 300 km
* */
public class Exercicio05 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("---------- Programa para calcular a distancia percorrida ----------");
        System.out.print("Digite a velocidade em quilometros por hora(km/h): ");
        int velocidadeKmPorHora = sc.nextInt();
        System.out.print("Digite o tempo de viagem em horas: ");
        int tempoDaViagemHora = sc.nextInt();

        int distanciaPercorrida = velocidadeKmPorHora * tempoDaViagemHora;

        System.out.println("---------------------------- Resultado  ---------------------------");
        System.out.println(" - Velocidade:  " + velocidadeKmPorHora);
        System.out.println(" - Tempo de viagem: " + tempoDaViagemHora + " horas.");
        System.out.println(" - Distância percorrida:  " + distanciaPercorrida + " Km.");

        sc.close();

    }
}
