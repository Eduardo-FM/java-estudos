package DataEHora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Instanciacao {

    public static void main(String[] args) {

        //Pagar data e hora local
        LocalDate d01 = LocalDate.now();
        LocalDateTime d02 = LocalDateTime.now();
        Instant d03  = Instant.now();


        System.out.println("Data local: " + d01);
        System.out.println("Data e hora local: " + d02);
        System.out.println("Data e hora GNT: " + d03);

        // Pegar o texto ISO 8601 e garar uma data hora a partir dele;

        LocalDate d04 = LocalDate.parse("2022-07-20");
        LocalDateTime d05= LocalDateTime.parse("2022-07-20T01:30:26");
        Instant d06= Instant.parse("2022-07-20T01:30:26z");
        Instant d07= Instant.parse("2022-07-20T01:30:26-03:00");

        System.out.println("Data através do ISO: " + d04);
        System.out.println("Data e hora através do ISO: " + d05);
        System.out.println("Data e hora GNT através do ISO: " + d06);
        System.out.println("Data e hora GNT no horário do Brasil através do ISO: " + d07);

        //Texto formato Customizado
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");


        LocalDate d08 = LocalDate.parse("20/07/2022", fmt1);
        LocalDateTime d09 = LocalDateTime.parse("20/07/2022 01:30", fmt2);

        LocalDate d10 = LocalDate.of(2022, 7, 20);
        LocalDateTime d11 = LocalDateTime.of(2022, 7, 20, 1, 30);

        System.out.println("Data customizada: " + d08);
        System.out.println("Data customizada com hora: " + d09);
        System.out.println("Data customizada passando a data separadamente: " + d10);
        System.out.println("Data e hora customizada passando a data e hora separadamente: " + d11);
    }

}
