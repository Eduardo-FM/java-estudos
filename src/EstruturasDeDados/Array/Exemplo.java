package EstruturasDeDados.Array;

import java.util.Locale;
import java.util.Scanner;

public class Exemplo {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        double[] vect = new  double[n];

        for (int i = 0; i < n; i++) {
            vect[i] = scanner.nextDouble();
        }
        
        double sum = 0;
        for (int i = 0; i < n; i++) {
            sum += vect[i];
        }

        double avg = sum / n;

        System.out.println("AVERAGE HEIGHT: " + avg);
        
        scanner.close();

    }

}
