package org.diegomouraoficial.conceitosiniciaisdeprogramacao.operadores;

public class OperadorNegacao {
    public static void main(String[] args) {

        boolean x = true;

        if(!x){   // x == false
            System.out.println(" X é falso");
        } else {
            System.out.println(" X é verdadeiro");
        }

        if(x){   // x == true
            System.out.println(" X é verdadeiro");
        } else {
            System.out.println(" X é falso");
        }
    }
}
