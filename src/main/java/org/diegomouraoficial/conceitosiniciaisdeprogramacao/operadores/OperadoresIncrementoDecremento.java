package org.diegomouraoficial.conceitosiniciaisdeprogramacao.operadores;

/*
    Operadores de Incremento e Decremento sao utilizados
    como influencia no resultado de uma expressao
*/

public class OperadoresIncrementoDecremento {
    public static void main(String[] args) {
        int a = 30, b = 30;

        System.out.println(a + " " + (a++) + " " + a);
        System.out.println(b + " " + (++b) + " " + b);
    }
}
