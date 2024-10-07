package EstruturasDeDados.Lists;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Exemplos {


    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("Maria");
        list.add("Alex");
        list.add("Bob");
        list.add("Ana");
        list.add(2, "Marco");

        System.out.println(list.size());

        list.remove("Ana");

        list.removeIf(x -> x.charAt(0) == 'M');


        for(String nome : list){
            System.out.println(nome);
        }

        list.indexOf("Bob");

        List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());

        for(String nome : result){
            System.out.println(nome);
        }

    }

}
