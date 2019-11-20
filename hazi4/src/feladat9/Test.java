package feladat9;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class Test{
    
    public static void kiirMarkaSzerint(List<Hatizsak> lista){
        for (Hatizsak i : lista) {
            System.out.println(i.toString());
        }
    }
    
    public static void main(String[] args) {
        List<Hatizsak> lista = Arrays.asList(
                new Hatizsak("Reebok", 50, 2, true),
                new Hatizsak("HeavyTools", 60, 4, false),
                new Hatizsak("Reebok", 70, 5, false),
                new Hatizsak("Nike", 40, 2, true),
                new Hatizsak("Adidas", 30, 1, true),
                new Hatizsak("Nike", 35, 3, true),
                new Hatizsak("Reebok", 70, 6, false),
                new Hatizsak("Nike", 20, 4, true),
                new Hatizsak("HeavyTools", 10, 2, false),
                new Hatizsak("Adidas", 10, 1, true)
                );
        Collections.sort(lista);
        kiirMarkaSzerint(lista);
    }
}
