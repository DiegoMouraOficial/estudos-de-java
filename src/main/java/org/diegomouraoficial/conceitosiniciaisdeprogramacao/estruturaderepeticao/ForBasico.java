package org.diegomouraoficial.conceitosiniciaisdeprogramacao.estruturaderepeticao;

/*
*  for (<inicializacao da variavel de controle>; <expressao logica condicionante com a variavel de controle>;
*    <alteracao da variavel de controle>) {
*                   instrucoes a serem executadas enquanto <expressao logica condicionante> pertencente
*                   ao for seja verdadeira
* }
*
* Resumo
*
*  for(<secao 1>; <secao 2>; <secao 3>) {  <bloco de instrucoes> }
*
* */
public class ForBasico {
    public static void main(String[] args) {

        for(int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }
}
