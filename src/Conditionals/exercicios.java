package Conditionals;

import java.util.Scanner;

public class exercicios {

    public static void main(String[] args) {
        /**
         *  1. Verificação de Maior Número
         * Escreva um programa que recebe três números e usa if, else if, e else para encontrar e imprimir o maior número entre eles.
         */

        int q1num1 = 2;
        int q1num2 = 4;
        int q1num3 = 3;

        if (q1num1 > q1num2 && q1num1 > q1num3) {
            System.out.println("num1 é o maior numerp");
        } else if (q1num2 > q1num1 && q1num2 > q1num3) {
            System.out.println("num2 é o maior numerp");
        } else {
            System.out.println("num3 é o maior numerp");
        }

        /** 2. Classificação de Idade
         * Escreva um programa que recebe a idade de uma pessoa e, usando if, else if, e else, classifica a pessoa como:
         *
         * Criança (0-12 anos)
         * Adolescente (13-17 anos)
         * Adulto (18-64 anos)
         * Idoso (65+ anos)
         */

        Scanner scanner = new Scanner(System.in);

        int q2idade = scanner.nextInt();

        if (q2idade >= 0 && q2idade <= 12) {
            System.out.println("Criança");
        } else if (q2idade >= 13 && q2idade <= 17) {
            System.out.println("Adolescente");
        } else if (q2idade >= 18 && q2idade <= 64) {
            System.out.println("Adulto");
        } else if (q2idade >= 65) {
            System.out.println("Idoso");
        } else {
            System.out.println("Idade inválida");
        }

        /**
         *3. Validação de Nota
         * Escreva um programa que recebe uma nota de um aluno (entre 0 e 100). Se a nota for maior ou igual a 60, imprima "Aprovado".
         * Caso contrário, imprima "Reprovado". Use if e else.
         */

        int q3nota = scanner.nextInt();

        if (q3nota >= 60){
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }

        /**
         * 4. Verificação de Paridade
         * Escreva um programa que recebe um número inteiro e usa um operador ternário para determinar se o número é par ou ímpar, e imprime o resultado.
         */

        int q4num = scanner.nextInt();

        String q4resp = (q4num % 2 == 0) ? "par" : "impar";
        System.out.println(q4resp);

        /**
         * 5. Classificação de Números
         * Escreva um programa que recebe três números e usa if, else if, e else para classificar se todos os números são iguais, todos diferentes, ou se há dois números iguais.
         */

        if (q1num1 == q1num2 && q1num2 == q1num3) {
            System.out.println("Todos os números são iguais");
        } else if (q1num1 != q1num2 && q1num2 != q1num3 && q1num1 != q1num3) {
            System.out.println("Todos os números são diferentes");
        } else {
            System.out.println("Dois números são iguais");
        }

        /**
         * 6. Conversor de Notas (Switch)
         * Escreva um programa que recebe uma nota (A, B, C, D, F) e, usando switch, imprime a descrição correspondente:
         *
         * A: Excelente
         * B: Bom
         * C: Médio
         * D: Suficiente
         * F: Reprovado
         */

        char q6nota = scanner.next().charAt(0);

        switch (q6nota){
            case ('A'):
                System.out.println("Excelente");
                break;
            case ('B'):
                System.out.println("Bom");
                break;
            case ('C'):
                System.out.println("Médio");
                break;
            case ('D'):
                System.out.println("Suficiente");
                break;
            case ('F'):
                System.out.println("Reprovado");
                break;
            default:
                System.out.println("Nota inválida");
                break;
        }

        /** 7. Calculadora Simples
         * Escreva um programa que simula uma calculadora simples.
         * O programa deve receber dois números e um operador (soma, subtração, multiplicação, divisão) e, usando switch, realizar a operação correspondente.
         */

        System.out.println("Digite o primeiro número");
        int q7num1 = scanner.nextInt();

        System.out.println("Digite o segundo número");
        int q7num2 = scanner.nextInt();

        System.out.println("Digite o operador");
        char q7char = scanner.next().charAt(0);

        switch (q7char) {
            case '+':
                System.out.println("Resultado: " + (q7num1 + q7num2));
                break;
            case '-':
                System.out.println("Resultado: " + (q7num1 - q7num2));
                break;
            case '*':
                System.out.println("Resultado: " + (q7num1 * q7num2));
                break;
            case '/':
                if (q7num2 != 0) {
                    System.out.println("Resultado: " + (q7num1 / q7num2));
                } else {
                    System.out.println("Erro: Divisão por zero");
                }
                break;
            default:
                System.out.println("Operador inválido");
                break;
        }


        /**
         * 8. Determinação de Sinal
         * Escreva um programa que recebe um número e usa um operador ternário para determinar se o número é positivo, negativo, ou zero, e imprime o resultado.
         */

        int q8num = scanner.nextInt();

        String resultado = (q8num > 0) ? "Positivo" : (q8num < 0) ? "Negativo" : "Zero";

        /**
         * 9. Verificação de Ano Bissexto
         * Escreva um programa que recebe um ano e usa if, else if, e else para determinar se o ano é bissexto.
         * Um ano é bissexto se for divisível por 4, mas não por 100, exceto se for divisível por 400.
         */

        int q9ano = scanner.nextInt();

        if (q9ano % 400 == 0) {
            System.out.println("ano bissexto");
        } else if (q9ano % 4 == 0 && q9ano % 100 != 0){
            System.out.println("ano bissexto");
        } else  {
            System.out.println("Ano não é bissexto");
        }

        /**
         * 10. Classificação de Letra (Vogal ou Consoante)
         * Escreva um programa que recebe um caractere e usa switch para determinar se é uma vogal (a, e, i, o, u) ou uma consoante.
         * Se for um caractere inválido (número, símbolo), imprima "Caractere inválido".
         */

        char caractere = scanner.next().toLowerCase().charAt(0);

        // Verifica se o caractere é uma letra
        if (Character.isLetter(caractere)) {
            // Usa switch para classificar a letra como vogal ou consoante
            switch (caractere) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    System.out.println("O caractere é uma vogal.");
                    break;
                default:
                    System.out.println("O caractere é uma consoante.");
                    break;
            }
        } else {
            // Se não for uma letra, é um caractere inválido
            System.out.println("Caractere inválido.");
        }

        scanner.close();

    }


}
