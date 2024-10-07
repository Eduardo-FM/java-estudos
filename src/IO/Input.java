package IO;

import java.util.Locale;
import java.util.Scanner;

public class Input {

    public static void main(String[] args) {

//        Scanner sc = new Scanner(System.in);
//
//        String x = sc.next();
//        System.out.println(x);
//
//        int y = sc.nextInt();
//
//        System.out.println(y);
//
//        Locale.setDefault(Locale.US);
//        Double d = sc.nextDouble();
//        System.out.println(d);
//
//        Character c = sc.next().charAt(0);
//        System.out.println(c);
//
//        sc.close();

        Scanner sc = new Scanner(System.in);
        String s1, s2, s3;
        s1 = sc.nextLine();
        s2 = sc.nextLine();
        s3 = sc.nextLine();
        System.out.println("DADOS DIGITADOS:");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        sc.close();

    }
}
