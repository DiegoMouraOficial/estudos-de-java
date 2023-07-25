package org.diegomouraoficial.conceitosiniciaisdeprogramacao.operadores;

/*
*   pre-incremento ++<variavel>
*   pos-incremento <variavel>++
*   pre-decremento --<variavel>
*   pos-decremento <variavel>--
*
* */

public class OperadorIncrementoDecremento {
    public static void main(String[] args) {

        int a = 30;
        int b = 40;

        System.out.println(a++);
        System.out.println(++a);
        System.out.println(b--);
        System.out.println(--b);
        System.out.println(a + " " + (a++) + " " + a);
        System.out.println(b + " " + (--b) + " " + b);
        System.out.println(a);
        System.out.println(b);
    }
}
