package org.diegomouraoficial.conceitosiniciaisdeprogramacao.estruturacondicional;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {

        int diaDaSemana = 10;
        String dia;

        switch (diaDaSemana) {
            case 1:
                dia = "Domingo";
                break;
            case 2:
                dia = "Segunda-feira";
                break;
            case 3:
                dia = "Terça-feira";
                break;
            case 4:
                dia = "Quarta-feira";
                break;
            case 5:
                dia = "Quinta-feira";
                break;
            case 6:
                dia = "Sexta-feira";
                break;
            case 7:
                dia = "Sábado";
                break;
            default:
                dia = "Dia inválido";
        }

        System.out.println("Hoje é: " + dia);
    }
}
