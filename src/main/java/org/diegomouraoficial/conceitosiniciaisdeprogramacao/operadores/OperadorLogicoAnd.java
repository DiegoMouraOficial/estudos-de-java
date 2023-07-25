package org.diegomouraoficial.conceitosiniciaisdeprogramacao.operadores;

/*
*  Operador && - Eh operador logico (AND)+
*
*
* */
public class OperadorLogicoAnd {
    public static void main(String[] args) {

        int numero= 200;

        if( numero >= 1 && numero <= 100) {
            System.out.println("O número ESTÁ compreendido entre 1 e 100");
        } else {
            System.out.println("O número NÃO está compreendido entre 1 e 100");
        }
    }
}
