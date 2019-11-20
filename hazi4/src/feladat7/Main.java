package feladat7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    
    public static List<Lakohaz> tagasLakohazak(List<Lakohaz> lista, double terfogat){
        List<Lakohaz> res = new ArrayList();
        for (int i = 0; i < lista.size(); i++) {
            if(lista.get(i).legkobmeter() > terfogat)
                res.add(lista.get(i));
        }
        return res;
    }
    
    public static void main(String[] args) {
        List<Lakohaz> lista = new ArrayList(Arrays.asList(
                new Lakohaz("Kassai ut", 3, 240),
                new Lakohaz("Kassai ut", 3, 300),
                new Lakohaz("Kassai ut", 5, 400),
                new Lakohaz("Kassai ut", 6, 200),
                new Lakohaz("Kassai ut", 9, 60),
                new Lakohaz("Kassai ut", 2, 150),
                new Lakohaz("Kassai ut", 3, 240),
                new Lakohaz("Kassai ut", 3, 240),
                new Lakohaz("Kassai ut", 3, 240),
                new Lakohaz("Kassai ut", 3, 240)
            ));
        lista = tagasLakohazak(lista, 2500);
        for (Lakohaz i : lista) {
            System.out.println(i.toString());
        }
    }
}
