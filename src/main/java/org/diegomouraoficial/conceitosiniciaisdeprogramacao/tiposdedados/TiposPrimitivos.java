package org.diegomouraoficial.conceitosiniciaisdeprogramacao.tiposdedados;

/*
    Tipos de Dados em Java permitem a manipulacao de dados
    de distintas naturezas, propositos e precisoes.

    Sintaxe : <tipo> <nomeDaVariavel> = <inicializacao opcional>;
*/
public class TiposPrimitivos {
    public static void main(String[] args) {

        //Tipos inteiros
        byte myByte = 127;            // 8 bits  (intervalo: -128 a 127)
        short myShort = 32000;        // 16 bits (intervalo: -32,768 a 32,767)
        int myInt = 2000000;          // 32 bits (intervalo: -2^31 a 2^31-1)
        long myLong = 900000000000L;  // 64 bits (intervalo: -2^63 a 2^63-1)

        //Tipos de Ponto Flutuante
        float myFloat = 3.14f;       // 32 bits (precisao de aproximadamente 7 digitos decimais)
        double myDouble = 3.14159;   // 64 bits (precisao de aproximadamente 15 digitos decimais)

        //Tipo Caractere
        char myChar = 'A';  // Armazena um único caractere Unicode (16 bits)

        //Tipo Booleano
        boolean myBoolean = true; //Representa verdadeiro (true) ou falso (false).
        boolean myBoolen1 = false;

        System.out.println(" ----------------- Tipo de dados: Inteiros ------------------- ");
        System.out.println(" byte: " + myByte);
        System.out.println(" short: " + myShort);
        System.out.println(" int: " + myInt);
        System.out.println(" long: " + myLong);
        System.out.println(" -------------- Tipo de dados: Ponto Flutuante -------------- ");
        System.out.println(" float: " + myFloat);
        System.out.println(" double: " + myDouble);
        System.out.println(" ----------------- Tipo de dados: Caractere ----------------- ");
        System.out.println(" char: " + myChar);
        System.out.println(" ------------------ Tipo de dados: Boolean ------------------ ");
        System.out.println(" boolean: " + myBoolean);
        System.out.println(" boolean: " + myBoolen1);

    }
}
