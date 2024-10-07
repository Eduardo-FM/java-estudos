//package Loops;
//
//import java.util.Scanner;
//
//public class Exercicios {
//    public static void main(String[] args) {
//        /*
//        1. Contagem de Números
//           - Descrição: Escreva um programa que imprima todos os números de 1 a 100 usando um loop `for`.
//           - Dica: Use um loop `for` que itere de 1 a 100 e imprima cada número.
//        */
//
//        for (int i = 1; i <= 100; i++){
//            System.out.println(i);
//        }
//
//        /*
//        2. Somatório de Números
//           - Descrição: Crie um programa que calcule a soma dos números de 1 a 50.
//           - Dica: Utilize um loop `for` ou `while` para somar todos os números de 1 a 50 e exiba o resultado.
//        */
//
//        int total = 0;
//        for (int i = 1; i <= 50; i++){
//            total += i;
//        }
//        System.out.println(total);
//        /*
//        3. Fatorial de um Número
//           - Descrição: Implemente um programa que calcule o fatorial de um número inteiro dado pelo usuário.
//           - Dica: Use um loop `for` ou `while` para multiplicar os números de 1 até o número fornecido.
//        */
//
//        Scanner scanner = new Scanner(System.in);
//        int num = scanner.nextInt();
//        int total = 1;
//        for (int i = 1; i <= num; i++){
//            total *= i;
//        }
//        System.out.println(total);
//
//        scanner.close();
//
//        /*
//        4. Números Pares
//           - Descrição: Escreva um programa que imprima todos os números pares de 1 a 100.
//           - Dica: Dentro de um loop, verifique se o número é divisível por 2.
//        */
//
//        for (int i = 0; i <= 100; i++){
//            if (i % 2 == 0){
//                System.out.println(i);
//            }
//        }
//
//        /*
//        5. Tabuada
//           - Descrição: Crie um programa que exiba a tabuada de um número informado pelo usuário.
//           - Dica: Use um loop `for` para multiplicar o número dado pelo usuário por 1 a 10.
//        */
//
//        Scanner scanner = new Scanner(System.in);
//
//        int num = scanner.nextInt();
//        for (int i = 0; i <= 10; i++){
//            System.out.println(num * i);
//        }
//
//        scanner.close();
//
//        /*
//        6. Sequência de Fibonacci
//           - Descrição: Escreva um programa que exiba os primeiros 10 números da sequência de Fibonacci.
//           - Dica: Utilize um loop `for` para gerar a sequência, lembrando que cada número é a soma dos dois anteriores.
//        */
//
//        int a = 0, b = 1;
//        for (int i = 1; i <= 10; i++) {
//            System.out.println(a);
//            int next = a + b;
//            a = b;
//            b = next;
//        }
//
//
//        /*
//        7. Contagem Regressiva
//           - Descrição: Crie um programa que faça uma contagem regressiva de 10 a 0 e, ao final, exiba "Feliz Ano Novo!".
//           - Dica: Utilize um loop `for` ou `while` para contar de 10 a 0.
//        */
//        int count = 10;
//        while (count != -1 ){
//            System.out.println(count);
//            count--;
//        }
//        System.out.println("Feliz Ano Novo!");
//
//        /*
//        8. Verificação de Número Primo
//           - Descrição: Implemente um programa que verifique se um número dado pelo usuário é primo.
//           - Dica: Use um loop `for` para verificar se o número é divisível por algum número além de 1 e dele mesmo.
//        */
//
//        int numero = scanner.nextInt();
//        boolean ehPrimo = true;
//
//        if (numero < 2) {
//            ehPrimo = false;
//        } else {
//            for (int i = 2; i <= Math.sqrt(numero); i++) {
//                if (numero % i == 0) {
//                    ehPrimo = false;
//                    break;
//                }
//            }
//        }
//
//        if (ehPrimo) {
//            System.out.println(numero + " é primo.");
//        } else {
//            System.out.println(numero + " não é primo.");
//        }
//
//        /*
//        9. Impressão de Quadrado de Asteriscos
//           - Descrição: Escreva um programa que desenhe um quadrado de asteriscos (`*`) de tamanho `n`, onde `n` é fornecido pelo usuário.
//           - Dica: Use loops aninhados (`for` dentro de outro `for`) para imprimir linhas e colunas de asteriscos.
//        */
//
//        Scanner scanner = new Scanner(System.in);
//        int tamanho = scanner.nextInt();
//
//        for (int i = 1; i <= tamanho; i++){
//            for (int k = 1; k <= tamanho; k++){
//                System.out.print('*');
//            }
//            System.out.println();
//        }
//
//        /*
//        10. Soma de Dígitos
//            - Descrição: Crie um programa que leia um número inteiro e some todos os seus dígitos.
//            - Dica: Use um loop `while` para extrair e somar os dígitos do número.
//        */
//
//        int numeroSoma = scanner.nextInt();
//        int soma = 0;
//
//        while (numeroSoma != 0) {
//            soma += numeroSoma % 10;
//            numeroSoma /= 10;
//        }
//
//        System.out.println("A soma dos dígitos é: " + soma);
//
//        /*
//        11. Múltiplos de 3 e 5
//            - Descrição: Escreva um programa que imprima todos os números de 1 a 100 que são múltiplos de 3 e 5.
//            - Dica: Dentro do loop, use uma condição para verificar se o número é divisível tanto por 3 quanto por 5.
//        */
//
//        for (int i = 1; i <= 100; i++){
//            if (i % 3 == 0 && i % 5 == 0){
//                System.out.println(i);
//            }
//        }
//
//        /*
//        12. Impressão de Triângulo de Asteriscos
//            - Descrição: Implemente um programa que desenhe um triângulo de asteriscos com altura `n`, onde `n` é dado pelo usuário.
//            - Dica: Use loops aninhados para controlar a altura e a quantidade de asteriscos em cada linha.
//        */
//
//        int altura = scanner.nextInt();
//        for (int i = 1; i <= altura; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print('*');
//            }
//            System.out.println();
//        }
//
//        /*
//        13. Palíndromo
//            - Descrição: Crie um programa que verifique se uma palavra ou número é um palíndromo (lê-se da mesma forma de trás para frente).
//            - Dica: Use um loop para comparar os caracteres de uma string do início ao meio com os do final ao meio.
//        */
//
//        String palavra = scanner.next();
//        String palavraInvertida = new StringBuilder(palavra).reverse().toString();
//
//        if (palavra.equals(palavraInvertida)) {
//            System.out.println(palavra + " é um palíndromo.");
//        } else {
//            System.out.println(palavra + " não é um palíndromo.");
//        }
//
//        /*
//        14. Cálculo de Média
//            - Descrição: Escreva um programa que calcule a média de uma lista de números fornecida pelo usuário. O loop deve continuar solicitando números até que o usuário insira um valor negativo.
//            - Dica: Utilize um loop `while` que continua recebendo números e somando-os até que um número negativo seja digitado.
//        */
//
//        int somaNumeros = 0, contador = 0, numeroMedia;
//
//        while ((numeroMedia = scanner.nextInt()) >= 0) {
//            somaNumeros += numeroMedia;
//            contador++;
//        }
//
//        if (contador > 0) {
//            double media = (double) somaNumeros / contador;
//            System.out.println("A média é: " + media);
//        } else {
//            System.out.println("Nenhum número foi inserido.");
//        }
//
//        /*
//        15. Jogo de Adivinhação
//            - Descrição: Implemente um jogo onde o programa gera um número aleatório entre 1 e 100, e o usuário deve adivinhar o número. O programa deve fornecer dicas se o palpite é maior ou menor que o número gerado.
//            - Dica: Use um loop `while` para repetir as tentativas até que o usuário acerte o número.
//        */
//
//        int numeroAleatorio = (int) (Math.random() * 100) + 1;
//        int tentativa;
//
//        do {
//            tentativa = scanner.nextInt();
//            if (tentativa > numeroAleatorio) {
//                System.out.println("Muito alto!");
//            } else if (tentativa < numeroAleatorio) {
//                System.out.println("Muito baixo!");
//            } else {
//                System.out.println("Parabéns! Você acertou!");
//            }
//        } while (tentativa != numeroAleatorio);
//    }
//}
