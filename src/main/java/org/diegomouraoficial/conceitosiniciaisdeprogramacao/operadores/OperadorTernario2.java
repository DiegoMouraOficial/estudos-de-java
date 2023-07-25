package org.diegomouraoficial.conceitosiniciaisdeprogramacao.operadores;

/*
 *    SINTAXE
 * <expressao logica> ? Valor caso a <expressao logica> seja verdadeira : valor
 *    caso a <expressao logica> seja falsa;
 *
 * */

public class OperadorTernario2 {
    public static void main(String[] args) {

        int idade = 17;

        // Exemplo de uso do operador ternario para verificar se a pessoa eh maior de idade
        String mensagem = (idade >= 18) ? "Maior de idade." : "Menor de idade.";

        System.out.println("Idade: " + idade);
        System.out.println("Status: " + mensagem);
    }
}
