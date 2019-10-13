package izzasztofeladat;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Varos {
    String varos;
    int homerseklet;

    public Varos(String varos, int homerseklet){
        this.varos = varos;
        this.homerseklet = homerseklet;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String line1 = sc.nextLine();
        elsoSor es = new elsoSor(Integer.parseInt(line1.split(" ")[0]), line1.split(" ")[1]);
        boolean benne = false;
        Varos[] tomb = new Varos[es.sor];

        for (int i = 0; i < es.sor; i++) {
            String line = sc.nextLine();

            tomb [i] = new Varos(line.split(":")[0], Integer.parseInt(line.split(":")[1]));
        }

        Arrays.sort(tomb, new hasonlit());

        for (int i = 0; i < es.sor; i++) {
            if(tomb[i].varos.compareTo(es.keresendo) == 0)
            {
                benne = true;
            }
        }

        if(benne)
        {
            for (int i = 0; i < es.sor; i++) {
                if(tomb[i].varos.compareTo(es.keresendo) != 0)
                {
                    System.out.println(tomb[i].varos + " " + "(" + tomb[i].homerseklet + ")");
                }
                else
                    break;
            }
        }
        else
        {
            System.out.println("Missing data");
        }
    }
}

class hasonlit implements Comparator<Varos> {

    @Override
    public int compare(Varos o1, Varos o2) {
        if(o1.homerseklet == o2.homerseklet)
        {
            return o1.varos.compareTo(o2.varos);
        }
        else
            return Integer.compare(o2.homerseklet, o1.homerseklet);
    }
}

class elsoSor{
    int sor;
    String keresendo;

    public elsoSor(int sor, String keresendo){
        this.sor = sor;
        this.keresendo = keresendo;
    }
}

