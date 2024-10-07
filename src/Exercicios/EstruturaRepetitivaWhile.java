package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class EstruturaRepetitivaWhile {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);


        Scanner scanner = new Scanner(System.in);

        final int senhaCorreta = 2002;

        int senhaDigitada = scanner.nextInt();

        while (senhaDigitada != senhaCorreta){
            System.out.println("Senha Invalida");
            senhaDigitada = scanner.nextInt();
        }

        System.out.println("Acesso permitido");

        int x = scanner.nextInt();
        int y = scanner.nextInt();
        while (x != 0 && y != 0){
            if (x > 0 && y > 0) {
                System.out.println("primeiro");
            } else if (x < 0 && y > 0){
                System.out.println("segundo");
            } else if (x < 0 && y < 0){
                System.out.println("terceiro");
            } else {
                System.out.println("quarto");
            }
            x = scanner.nextInt();
            y = scanner.nextInt();
        }

        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;

        int tipo = scanner.nextInt();

        while (tipo != 4) {
            if (tipo == 1) {
                alcool = alcool + 1;
            }
            else if (tipo == 2) {
                gasolina = gasolina + 1;
            }
            else if (tipo == 3) {
                diesel = diesel + 1;
            }

            tipo = scanner.nextInt();
        }

        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);

        scanner.close();
    }
}
