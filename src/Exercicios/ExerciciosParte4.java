package Exercicios;

import java.util.Scanner;

public class ExerciciosParte4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
//
//        int valor = scanner.nextInt();
//
//        if (valor >= 1 || valor <= 1000){
//            for (int i = 1; i <= valor; i++){
//                if (i % 2 != 0){
//                    System.out.println(i);
//                }
//            }
//        }

//        int n = scanner.nextInt();
//
//        int in = 0;
//        int out = 0;
//
//        for (int i=0; i<n; i++) {
//            int x = scanner.nextInt();
//            if (x >= 10 && x <= 20) {
//                in = in + 1;
//            }
//            else {
//                out = out + 1;
//            }
//        }
//
//        System.out.println(in + " in");
//        System.out.println(out + " out");

//        int n = scanner.nextInt();
//
//        for (int i = 0; i < n; i++){
//            double a = scanner.nextDouble();
//            double b = scanner.nextDouble();
//            double c = scanner.nextDouble();
//
//            double media = (a * 2.0 + b * 3.0 + c * 5.0) / 10.0;
//
//            System.out.printf("%.1f%n", media);
//        }



        int n = scanner.nextInt();

//        for (int i=0; i<n; i++) {
//
//            int x = scanner.nextInt();
//            int y = scanner.nextInt();
//
//            if (y == 0) {
//                System.out.println("divisao impossivel");
//            }
//            else {
//                double div = (double) x / y;
//                System.out.printf("%.1f%n", div);
//            }
//        }


//        int total = 1;
//        for (int i = n; i >= 1; i--){
//            total *= i;
//        }
//
//        System.out.println(total);
//
//        for (int i = 1; i <= n; i++){
//            if (n % i == 0){
//                System.out.println(i);
//            }
//        }

        for (int i=1; i<=n; i++) {

            int primeiro = i;
            int segundo = i * i;
            int terceiro = i * i * i;
            System.out.printf("%d %d %d%n", primeiro, segundo, terceiro);
        }

        scanner.close();

    }

}
