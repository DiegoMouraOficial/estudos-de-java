package org.diegomouraoficial.conceitosiniciaisdeprogramacao.operadores;

public class OperadorAritmetico {
    public static void main(String[] args) {
        int a = 30, b = 5, c = -3;

        System.out.println( "O resultado da soma é: " + (a + b));
        System.out.println( "O resultado da subtração é: " + (a - b));
        System.out.println( "O resultado da multiplicação é: " + (a * b));
        System.out.println( "O resultado da divisão é: " + (a / b));
        System.out.println( "O resultado do resto da divisão é: " + (a % b));

        System.out.println("----- Operadores Unário ------");
        System.out.println( "Sinal negativo: " + (-a));
        System.out.println( "Sinal positivo: " + (-c));
    }
}
