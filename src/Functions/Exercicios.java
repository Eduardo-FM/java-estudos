package Functions;

import java.util.Arrays;

public class Exercicios {

    public static void main(String[] args) {
        System.out.println(sum(2, 4));

        System.out.println(factorial(5));

        System.out.println(evenOrOdd(18));

        Integer[] nums = {2, 3, 3, 5, 7, 10};
        System.out.println(averageArrayNumber(nums));

        System.out.println(checkPalindrome("asa"));

        System.out.println(returnMaxNumber(nums));

        Integer[] numsNotSorted = {2, 3, 1, 5, 10, 9, 15};
        Integer[] sortedArray = returnSortIntegerArray(nums);

        System.out.println(Arrays.toString(sortedArray));

        System.out.println(countVowels("Gaules"));

    }

    /*
     * 1. Função para Somar Dois Números
     * Crie uma função que receba dois números inteiros como parâmetros
     * e retorne a soma deles.
     */

    static Integer sum(Integer num1, Integer num2){
        return num1 + num2;
    }


    /*
     * 2. Função para Calcular o Fatorial
     * Implemente uma função que receba um número inteiro `n` e retorne o fatorial de `n`.
     */

    static Integer factorial(Integer num){
        Integer total = 1;
        for (int i = 1; i <= num; i++){
            total *= i;
        }

        return total;
    }


    /*
     * 3. Função para Verificar Números Primos
     * Crie uma função que receba um número inteiro e retorne `true` se ele for primo,
     * ou `false` caso contrário.
     */

    public static boolean checkPrimeNumber(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    /*
     * 4. Função para Verificar se um Número é Par ou Ímpar
     * Implemente uma função que receba um número inteiro e retorne `true` se ele for par
     * e `false` se for ímpar.
     */

    static Boolean evenOrOdd(Integer num){
        if ((num % 2) == 0) {
            return true;
        }

        return false;
    }

    /*
     * 5. Função para Inverter uma String
     * Crie uma função que receba uma string como parâmetro e retorne essa string invertida.
     */

    static String reverseString(String str){
        StringBuilder reserveString = new StringBuilder(str);
        return reserveString.reverse().toString();
    }

    /*
     * 6. Função para Calcular a Média de um Array de Números
     * Crie uma função que receba um array de números inteiros e retorne a média dos valores.
     */

    static Double averageArrayNumber(Integer[] nums){
        Integer sumTotal = 0;
        for (int i = 0; i < nums.length; i++){
            sumTotal += nums[i];
        }

        Double total = (double) (sumTotal / nums.length);
        return total;
    }

    /*
     * 7. Função para Verificar Palíndromos
     * Implemente uma função que receba uma string e retorne `true` se a string for um palíndromo
     * (ou seja, lida da mesma forma de trás para frente) ou `false` caso contrário.
     */

    static Boolean checkPalindrome(String str){

        StringBuilder stringBuilder = new StringBuilder(str);
        String reverseString = stringBuilder.reverse().toString();
        if (str.equals(reverseString)){
            return true;
        }

        return false;
    }

    /*
     * 8. Função para Encontrar o Maior Elemento em um Array
     * Crie uma função que receba um array de inteiros e retorne o maior valor presente no array.
     */

    static Integer returnMaxNumber(Integer[] nums) {
        if (nums.length == 0) {
            return null;
        }


        Integer maxNumber = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > maxNumber) {
                maxNumber = nums[i];
            }
        }

        return maxNumber;
    }

    /*
     * 9. Função para Ordenar um Array em Ordem Crescente
     * Implemente uma função que receba um array de inteiros e retorne o array ordenado em ordem crescente.
     */

    static Integer[] returnSortIntegerArray(Integer[] nums){
        if (nums == null) {
            throw new IllegalArgumentException("O array não pode ser nulo");
        }

        Integer[] sortedArray = nums.clone();
        Arrays.sort(sortedArray);
        return sortedArray;
    }

    /*
     * 10. Função para Contar as Vogais em uma String
     * Crie uma função que receba uma string e retorne o número de vogais (a, e, i, o, u) presentes na string.
     */

    static Integer countVowels(String str){
        String vowels = "aeiouAEIOU";
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (vowels.indexOf(c) != -1) { // Verifica se o caractere é uma vogal
                count++;
            }
        }

        return count;

    }

    /*
     * 11. Função para Gerar uma Sequência Fibonacci
     * Implemente uma função que gere os `n` primeiros números da sequência Fibonacci,
     * onde `n` é passado como parâmetro.
     */

    /*
     * 12. Função para Calcular o MDC (Máximo Divisor Comum)
     * Crie uma função que receba dois números inteiros e retorne o maior divisor comum (MDC) entre eles.
     */

    /*
     * 13. Função para Verificar se Duas Strings são Anagramas
     * Implemente uma função que receba duas strings e verifique se elas são anagramas
     * (ou seja, se uma é a reorganização das letras da outra).
     */

    /*
     * 14. Função para Implementar Busca Binária
     * Crie uma função que realize busca binária em um array ordenado e retorne o índice do elemento
     * buscado ou `-1` se não for encontrado.
     */

    /*
     * 15. Função para Encontrar o Segundo Maior Elemento em um Array
     * Implemente uma função que receba um array de inteiros e retorne o segundo maior valor presente no array.
     */

    /*
     * 16. Função Recursiva para Somar Elementos de um Array
     * Crie uma função recursiva que receba um array de inteiros e retorne a soma de todos os elementos.
     */

    /*
     * 17. Função Recursiva para Calcular a Potência
     * Implemente uma função recursiva que calcule a potência de um número `x` elevado a `n` (`x^n`).
     */

    /*
     * 18. Função Recursiva para Resolver o Problema das Torres de Hanói
     * Crie uma função que simule a resolução do problema das Torres de Hanói,
     * movendo os discos de uma haste para outra.
     */

    /*
     * 19. Função Recursiva para Verificar se uma String é Palíndromo
     * Implemente uma função recursiva para verificar se uma string é um palíndromo.
     */

    /*
     * 20. Função Recursiva para Calcular o N-ésimo Termo de Fibonacci
     * Crie uma função recursiva para encontrar o n-ésimo termo da sequência de Fibonacci.
     */


}
