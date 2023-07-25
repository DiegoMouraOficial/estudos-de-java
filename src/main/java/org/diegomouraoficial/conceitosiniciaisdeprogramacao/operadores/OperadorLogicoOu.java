package org.diegomouraoficial.conceitosiniciaisdeprogramacao.operadores;

/*
*  Operador || - Eh operador logico OU (OR)+
*
*   Pelo menos uma condição tem que ser verdadeira
* */
public class OperadorLogicoOu {
    public static void main(String[] args) {

        boolean macaEhFruta  = true;
        boolean tomateEhFruta = false;

        if(macaEhFruta || tomateEhFruta) {
            System.out.println("Pelo menos uma das opções é fruta.");
        } else {
            System.out.println("Ambas não são frutas.");
        }
    }
}
