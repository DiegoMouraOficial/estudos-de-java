package org.diegomouraoficial.conceitosiniciaisdeprogramacao.estruturacondicional;

/*
*   if(<expressao logica>) {
*       instrucoes a serem executadas caso a <expressao logica> seja verdadeira.
*   } else {
*       instrucoes a serem executadas caso a <expressao logica> seja falsa.
*   }
*
* */

public class IfElse {
    public static void main(String[] args) {

        int idade = 15;

        if(idade >= 18) {
            System.out.println("Você é maior de idade.");
        } else {
            System.out.println("Você é menor de idade.");
        }
    }
}
