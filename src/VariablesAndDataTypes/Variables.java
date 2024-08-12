package VariablesAndDataTypes;

import java.util.Scanner;

public class Variables {

    static int a = 1; //static variable
    int data = 99; //instance variable

    void method() {
        int b = 90; //local variable
    }


    public static void main(String[] args) {
        /**
         * 1) Declaração e Inicialização de Variáveis:
         *
         * Declare e inicialize variáveis de tipos primitivos (int, double, char, boolean).
         *Declare uma variável String e atribua a ela o seu nome.
         *Imprima os valores das variáveis declaradas no console.
         */

        int inteiro  = 1;
        double num2 = 2.0;
        char c = 'a';
        boolean v = true;

        String nome = "Eduardo Freitas Machado";

        System.out.println("Questão 01)");
        System.out.println("Inteiro:" + inteiro);
        System.out.println("Double: " + num2);
        System.out.println("Caracter: " + c);
        System.out.println("String: " + nome);

        /**
         * 2)Conversão de Tipos (Type Casting):
         * Converta uma variável double para int e exiba o resultado.
         *Converta uma variável int para double e exiba o resultado.
         * Tente converter uma variável String para int usando o método Integer.parseInt().
         */

        System.out.println();
        System.out.println("Questão 02");
        double d = 2.4;
        int converter = (int) d;
        int converterParaDouble = 3;
        double intParaDouble = converterParaDouble;
        String stringInt = "4";
        int intString = Integer.parseInt(stringInt);

        System.out.println(converter);
        System.out.println(intParaDouble);
        System.out.println(intString);

        /**
         *  * 3) Operações Aritméticas:
         *
         *      * Declare duas variáveis inteiras e realize as operações de adição, subtração, multiplicação e divisão entre elas. Imprima os resultados.
         *      * Declare duas variáveis double e realize as mesmas operações. Imprima os resultados.
         */

        System.out.println();
        System.out.println("Questão 03");
        int q3num1 = 2;
        int q3num2 = 4;

        System.out.println(q3num1 + q3num2);
        System.out.println(q3num1 - q3num2);
        System.out.println(q3num1 * q3num2);
        System.out.println(q3num1 / q3num2);

        double q3num3 = 4.00;
        double q3num4 = 5.00;
        System.out.println(q3num3 + q3num4);
        System.out.println(q3num3 - q3num4);
        System.out.println(q3num3 * q3num4);
        System.out.println(q3num3 / q3num4);

        /**
         *  4) Manipulação de Strings:
         *
         *  *  Declare uma variável String e atribua uma frase a ela.
         *      * Imprima o comprimento da String usando o método length().
         *      * Converta a String para letras maiúsculas usando o método toUpperCase() e imprima o resultado.
         *      * Substitua uma palavra na String por outra e imprima o resultado.
         */

        System.out.println();
        System.out.println("Questão 04");

        String q4string = "Está é a string da questão 4";
        System.out.println(q4string.length());
        System.out.println(q4string.toUpperCase());
        System.out.println(q4string.replace("questão", "pergunta"));
         /**
         *  5) Entrada do Usuário:
         *  *  Use a classe Scanner para ler uma String do usuário e imprima a String fornecida.
         *  * Leia um número inteiro do usuário e imprima o dobro desse número.
         *  * Leia um número double do usuário e imprima metade desse número.
          */

        System.out.println();
        System.out.println("Questão 05");

//        Scanner scanner = new Scanner(System.in);
//        String strUsuario = scanner.nextLine();
//        System.out.println(strUsuario);
//        int intUsuario = scanner.nextInt() * 2;
//        System.out.println(intUsuario);
//        double dblUsuario = scanner.nextDouble() / 2;
//        System.out.println(dblUsuario);

        /**
         *  6) Variáveis Constantes:
         *  *
         *  * Declare uma variável constante usando a palavra-chave final e atribua um valor a ela.
         *  * Tente alterar o valor da variável constante e observe o erro de compilação.
         */

        System.out.println();
        System.out.println("Questão 06");

        final int varFinal = 2;

         /**
         *  7) Operadores de Incremento e Decremento:
         *  * Declare uma variável inteira e utilize os operadores ++ e -- para incrementar e decrementar seu valor. Imprima o valor da variável após cada operação.
         */

        System.out.println();
        System.out.println("Questão 07");


        int q7Int = 5;
        System.out.println(q7Int);
        int q7int2 = ++q7Int;
        System.out.println(q7int2);
        int q7int3 = --q7Int;
        System.out.println(q7int3);

         /**
         *  8) Operadores de Atribuição:
         *  * Declare uma variável inteira e utilize os operadores +=, -=, *=, /= e %= para modificar seu valor. Imprima o valor da variável após cada operação.
         */

        System.out.println();
        System.out.println("Questão 08");

        int q8Int = 2;
        System.out.println(q8Int);
        int q8int2 = q8Int+= 1;
        System.out.println(q8int2);
        int q8int3 = q8Int -= 1;
        System.out.println(q8int3);
        int q8int4 = q8Int *= 2;
        System.out.println(q8int4);
        int q8int5 = q8Int /= 2;
        System.out.println(q8int5);
        int q8int6 = q8Int %= 2;
        System.out.println(q8int6);

        /**
        *  9) Expressões Booleanas:
        *  * Declare duas variáveis booleanas e atribua valores a elas.
        *  * Realize operações lógicas (AND, OR, NOT) com essas variáveis e imprima os resultados.
        */

        System.out.println();
        System.out.println("Questão 09");

        boolean q8boo1 = true;
        boolean q8boo2 = false;

        if (q8boo1 == true && q8boo2 == true){
            System.out.println("as duas são verdadeiras");
        }
        if (q8boo1 == true || q8boo2 == false) {
            System.out.println("uma é falsa");
        }
        if (q8boo1  != q8boo2){
            System.out.println("as duas são diferentes");
        }

        /**
        *  10) Comparações:
        *  * Declare duas variáveis inteiras e compare-as usando os operadores ==, !=, <, >, <= e >=. Imprima os resultados das comparações.
        */

        System.out.println();
        System.out.println("Questão 10");

        int q10Int1 = 2;
        int q10Int2 = 4;
        System.out.println(q10Int1 == q10Int2);
        System.out.println(q10Int1 != q10Int2);
        System.out.println(q10Int1 < q10Int2);
        System.out.println(q10Int1 > q10Int2);
        System.out.println(q10Int1 <= q10Int2);
        System.out.println(q10Int1 >= q10Int2);
    }
}
