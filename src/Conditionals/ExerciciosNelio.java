package Conditionals;

import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

public class ExerciciosNelio {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner scannerQ1 = new Scanner(System.in);

        int q1Num = scannerQ1.nextInt();

        if (q1Num < 0) {
            System.out.println("NEGATIVO");
        } else {
            System.out.println("NAO NEGATIVO");
        }
        scannerQ1.close();

        Scanner scannerq2 = new Scanner(System.in);

        int q2Num = scannerq2.nextInt();

//        if (q2Num % 2 != 0){
//            System.out.println("IMPAR");
//        } else {
//            System.out.println("PAR");
//        }

        String resposa = (q2Num % 2 != 0) ? "IMPAR" : "PAR";

        System.out.println(resposa);

        scannerq2.close();


        Scanner scannerQ3 = new Scanner(System.in);

        int A = scannerQ3.nextInt();
        int B = scannerQ3.nextInt();

        String resposta = (A % B == 0) || (B % A == 0) ? "Sao Multiplos" : "Nao sao Multiplos";

        System.out.println(resposta);

        scannerQ3.close();

        Scanner scannerQ4 = new Scanner(System.in);

        int horaInicial = scannerQ4.nextInt();
        int horaFinal = scannerQ4.nextInt();

        int duracao;
        if (horaInicial < horaFinal) {
            duracao = horaFinal - horaInicial;
        }
        else {
            duracao = 24 - horaInicial + horaFinal;
        }

        System.out.println("O JOGO DUROU " + duracao + " HORA(S)");

        scannerQ4.close();

        Scanner scannerQ5 = new Scanner(System.in);

        int codigo = scannerQ5.nextInt();
        int quantidade = scannerQ5.nextInt();

        double total;
//        if (codigo == 1) {
//            total = quantidade * 4.0;
//        }
//        else if (codigo == 2) {
//            total = quantidade * 4.5;
//        }
//        else if (codigo == 3) {
//            total = quantidade * 5.0;
//        }
//        else if (codigo == 4) {
//            total = quantidade * 2.0;
//        }
//        else {
//            total = quantidade * 1.5;
//        }

        switch (codigo){
            case 1:
                total = quantidade * 4.0;
                break;
            case 2:
                total = quantidade * 4.5;
                break;
            case 3:
                total = quantidade * 5.0;
                break;
            case 4:
                total = quantidade * 2.0;
                break;
            default:
                total = quantidade * 1.5;
                break;
        }

        System.out.printf("Total: R$ %.2f%n", total);

        scannerQ5.close();

        Scanner scannerQ6 = new Scanner(System.in);

        double num = scannerQ6.nextDouble();

        if ( num >= 0 && num <= 25.00) {
            System.out.println("Intervalo (0,25]");
        } else if (num > 25.00 && num <= 50.00){
            System.out.println("Intervalo (25,50]");
        } else if (num > 50.00 && num <= 75.00){
            System.out.println("Intervalo (50,75]");
        } else if (num > 75.00 && num <= 100.00){
            System.out.println("Intervalo (75,100]");
        } else {
            System.out.println("Fora de intervalo");
        }

        scannerQ6.close();


        Scanner scannerQ7 = new Scanner(System.in);

        double x = scannerQ7.nextDouble();
        double y = scannerQ7.nextDouble();

        if (x == 0.0 && y == 0.0) {
            System.out.println("Origem");
        }
        else if (x == 0.0) {
            System.out.println("Eixo Y");
        }
        else if (y == 0.0) {
            System.out.println("Eixo X");
        }
        else if (x > 0.0 && y > 0.0) {
            System.out.println("Q1");
        }
        else if (x < 0.0 && y > 0.0) {
            System.out.println("Q2");
        }
        else if (x < 0.0 && y < 0.0) {
            System.out.println("Q3");
        }
        else {
            System.out.println("Q4");
        }

        scannerQ7.close();

        Scanner scannerQ8 = new Scanner(System.in);

        double salario = scannerQ8.nextDouble();

        double imposto;
        if (salario <= 2000.0) {
            imposto = 0.0;
        }
        else if (salario <= 3000.0) {
            imposto = (salario - 2000.0) * 0.08;
        }
        else if (salario <= 4500.0) {
            imposto = (salario - 3000.0) * 0.18 + 1000.0 * 0.08;
        }
        else {
            imposto = (salario - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
        }

        if (imposto == 0.0) {
            System.out.println("Isento");
        }
        else {
            System.out.printf("R$ %.2f%n", imposto);
        }

        scannerQ8.close();

    }
}
