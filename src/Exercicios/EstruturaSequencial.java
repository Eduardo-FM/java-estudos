package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class EstruturaSequencial {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

//        System.out.println("Exercicio 01");

//        Integer q1num1 = scanner.nextInt();
//        Integer q1num2 = scanner.nextInt();
//
//        Integer q1total = q1num1 + q1num2;
//
//        System.out.printf("Soma = %d\n", q1total);
//
//        System.out.println("Exercicio 02");
//
//        Double pi = 3.14159;
//        System.out.println(pi);
//
//        Double q2raio = scanner.nextDouble();
//        Double q2Area = pi * (Math.pow(q2raio, 2));
//        System.out.printf("A=%.4f", q2Area);


//        System.out.println("Exercicio 03");
//        Integer q3A = scanner.nextInt();
//        Integer q3B = scanner.nextInt();
//        Integer q3C = scanner.nextInt();
//        Integer q3D = scanner.nextInt();
//
//        Integer q3Total = q3A * q3B - q3C * q3D;
//        System.out.println("Diferenca = " + q3Total);

//        System.out.println("Exercicio 04");
//
//        Locale.setDefault(Locale.US);
//
//        Integer q4num = scanner.nextInt();
//        Integer q4Horas = scanner.nextInt();
//        Double q4Salario = scanner.nextDouble();
//
//        Double q4SalarioTotal = q4Horas * q4Salario;
//
//        System.out.println(q4SalarioTotal);
//
//        System.out.printf("NUMBER = %d\n", q4num);
//        System.out.printf("SALARY = U$ %.2f%n", q4SalarioTotal);

        System.out.println("Exercicio 05");

        int cod1, cod2, qte1, qte2;
        double preco1, preco2, total;

        cod1 = scanner.nextInt();
        qte1 = scanner.nextInt();
        preco1 = scanner.nextDouble();

        cod2 = scanner.nextInt();
        qte2 = scanner.nextInt();
        preco2 = scanner.nextDouble();

        total = preco1 * qte1 + preco2 * qte2;

        System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);

        System.out.println("Exercicio 06");

        double A, B, C, triangulo, circulo, trapezio, quadrado, retangulo;

        A = scanner.nextDouble();
        B = scanner.nextDouble();
        C = scanner.nextDouble();

        triangulo = A * C / 2.0;
        circulo = 3.14159 * C * C;
        trapezio = (A + B) / 2.0 * C;
        quadrado = B * B;
        retangulo = A * B;

        System.out.printf("TRIANGULO: %.3f%n", triangulo);
        System.out.printf("CIRCULO: %.3f%n", circulo);
        System.out.printf("TRAPEZIO: %.3f%n", trapezio);
        System.out.printf("QUADRADO: %.3f%n", quadrado);
        System.out.printf("RETANGULO: %.3f%n", retangulo);

        scanner.close();
    }
}
