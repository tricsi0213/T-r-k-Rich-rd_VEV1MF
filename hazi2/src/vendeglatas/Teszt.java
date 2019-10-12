package vendeglatas;

import java.util.Arrays;

public class Teszt {
    
    public static String[] adottItaltKinaloKocsmak(VendeglatoipariEgyseg[] tomb, String ital){
        int elem = 0;
        for (int i = 0; i < tomb.length; i++) {
            if(tomb[i] instanceof Kocsma)
            {
                Kocsma k = (Kocsma)tomb[i];
                for (int j = 0; j < k.getSorlap().length; j++) {
                    if(k.getSorlap()[j].equals(ital))
                        elem++;
                }
            }
        }
        String[] kocsmak = new String[elem];
        elem = 0;
        for (int i = 0; i < tomb.length; i++) {
            if(tomb[i] instanceof Kocsma)
            {
                Kocsma k = (Kocsma)tomb[i];
                for (int j = 0; j < k.getSorlap().length; j++) {
                    if(k.getSorlap()[j].equals(ital))
                    {
                        kocsmak[elem] = k.getNev();
                        elem++;
                    }
                }
            }
            
        }
        return kocsmak;
    }
    
    public static void main(String[] args) {
        VendeglatoipariEgyseg[] t = new VendeglatoipariEgyseg[] {
            new Etterem(new String[]{"rakott krumpli", "töltött káposzta"}, "Étterem 1", 20),
            new Etterem(new String[]{"rakott karfiol", "töltött káposzta"}, "Étterem 2", 20),
            new Etterem(new String[]{"rakott krumpli", "spagetti"}, "Étterem 3", 20),
            new Etterem(new String[]{"rakott krumpli", "töltött káposzta"}, "Étterem 4", 20),
            new Etterem(new String[]{"rakott krumpli", "rántott hús"}, "Étterem 5", 20),
            new Kocsma(new String[]{"Borsodi", "Dreher", "Miller", "Soproni"}, "Kocsma 1", 20),
            new Kocsma(new String[]{"Heineken", "Dreher", "Miller", "Soproni"}, "Kocsma 2", 30),
            new Kocsma(new String[]{"Borsodi", "Dreher", "Heineken", "Soproni"}, "Kocsma 3", 15),
            new Kocsma(new String[]{"Borsodi", "Dreher", "Miller", "Kőbányai"}, "Kocsma 4", 34),
            new Kocsma(new String[]{"Borsodi", "Kőbányai", "Miller", "Soproni"}, "Kocsma 5", 50),
        };
        
        System.out.println(Arrays.toString(adottItaltKinaloKocsmak(t, "Heineken")));
        
    }
}
