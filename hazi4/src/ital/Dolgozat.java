package ital;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Dolgozat {
    
    public static List<SzeszesItal> rendezSzeszesItal(List<SzeszesItal> list){
        boolean voltcsere = true;
        SzeszesItal tmp;
        while(voltcsere)
        {
            voltcsere = false;
            for (int i = 0; i < list.size()-1; i++) {
                if(list.get(i).getAlkoholTartalom() < list.get(i+1).getAlkoholTartalom())
                {
                    tmp = list.get(i);
                    list.set(i, list.get(i+1));
                    list.set(i+1, tmp);
                    voltcsere = true;
                }
            }
        }
        return list;
    }
    
    public static SzeszesItal[] legmagasabbAlkoholtartalom(Ital[] tomb){
        SzeszesItal[] t = new SzeszesItal[3];
        List<SzeszesItal> lista = new ArrayList();
        for (Ital i : tomb) {
            if(i instanceof SzeszesItal)
                lista.add((SzeszesItal)i);
        }
        if(lista.size() < 3)
            return null;
        lista = rendezSzeszesItal(lista);
        for (int i = 0; i < 3; i++) {
            t[i] = lista.get(i);
        }
        return t;
    }
    
    public static void main(String[] args) {
        Ital[] italok = new Ital[] {
            new Ital("Coca-Cola", "5 dl", 150),
            new Ital("Coca-Cola", "1 l", 300),
            new Ital("Sprite", "5 dl", 160),
            new SzeszesItal("Jack Daniels", "7 dl", 4000, 40.5),
            new SzeszesItal("Borsodi sör", "5 dl", 300, 4.7),
            new SzeszesItal("Merlot", "7 dl", 600, 15),
            new SzeszesItal("Heineken", "33 dl", 200, 4.8)
        };
        
        SzeszesItal[] tomb = legmagasabbAlkoholtartalom(italok);
        if(tomb != null)
        {
            for (SzeszesItal i : tomb) {
                System.out.println(i.toString());
            }
        }
        
        Arrays.sort(italok);
        
        for (Ital i : italok) {
            System.out.println(i.toString());
        }
    }
}
