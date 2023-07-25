package org.diegomouraoficial.conceitosiniciaisdeprogramacao.operadores;

/*
*   Na linguagem Java, é possível se atribuir o valor de um tipo de variável a outro tipo de
*   variável, porém para tal é necessário que esta operação seja apontada ao compilador.
*
*   A este apontamento damos o nome de casting.
*
*   É possível fazer conversões de tipos de ponto flutuante para inteiros, e inclusive
*   entre o tipo caractere, porém estas conversões podem ocasionar a perda de valores,
*   quando se molda um tipo de maior tamanho, como um double dentro de um int.
*
*   O tipo de dado boolean é o único tipo primitivo que não suporta casting
*
* */

public class Casting {
    public static void main(String[] args) {

        int a = 10;
        int b = 5;
        double resultado = (double) (a + b) / 2;

        System.out.println(resultado);

    }
}
