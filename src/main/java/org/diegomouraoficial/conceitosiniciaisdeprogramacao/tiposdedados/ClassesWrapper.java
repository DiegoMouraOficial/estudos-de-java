package org.diegomouraoficial.conceitosiniciaisdeprogramacao.tiposdedados;

/*
*   As classes-wrapper (também conhecidas como classes de envolvimento ou classes de tipo primitivo)
*   em Java sao classes que fornecem uma maneira de encapsular tipos de dados primitivos em objetos.
*
*   Elas permitem que tipos primitivos sejam usados em contextos onde se espera um objeto. Cada tipo
*   tem uma classe-wrapper correspondente associada a ela.
*
*   As classes-wrapper em Java sao uteis porque, ao encapsular tipos primitivos em objetos, elas
*   permitem que sejam tratados como objetos e, portanto, possam se beneficiar de recursos
*   adicionais que as classes oferecem, como metodos para conversao, formatacao comparacao, uso
*   em colecoes, entre outros. Alem, disso, as classes-wrapper sao usadas em varias bibliotecas
*   e APIs que requerem tipos de referencia.
*
*
*   1 - Integer : Representa o tipo primitivo int.
*   2 - Double : Representa o tipo primitivo double.
*   3 - Boolean : Representa o tipo primitivo boolean.
*   4 - Character : Representa o tipo primitivo char.
*   5 - Byte : Representa o tipo primitivo byte.
*   6 - Short : Representa o tipo primitivo short.
*   7 - Long : Representa o tipo primitivo long.
*   8 - Float : Representa o tipo primitivo float.
*
*  A partir do Java 5, foi introduzido o autoboxing e o unboxing, que permitem que a conversao
*  entre tipos primitivos e suas classes-wrapper ocorra automaticamente em muitos contextos,
*  tornando o codigo mais conciso e legivel.
*
*  Integer num1 = 42;  //Autoboxing (int para Integer)
*  int num2 = num1;    //Unboxing (Integer para int)
*
* */

public class ClassesWrapper {
    public static void main(String[] args) {

        Integer num1 = new Integer(42); // Usando construtor (não recomendado a partir do Java 9)
        Integer num2 = Integer.valueOf(42); // Usando metodo estatico valueOf (recomendado a partir do Java 9)
        int num3 = num1.intValue(); // Convertendo de Integer para int

        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);

    }
}
