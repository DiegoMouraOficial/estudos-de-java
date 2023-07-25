package org.diegomouraoficial.conceitosiniciaisdeprogramacao.estruturaderepeticao;

/*
*   while(<expressao logica>) {
*       intrucoes a serem executadas enquanto a <expressao logica>
*       pertencente ao while seja verdadeira
*   }
* */
public class While {
    public static void main(String[] args) {

        int contador = 0;

        while(contador <= 10) {
            System.out.println(contador);
            contador++;
        }
    }
}
