package zarthelyieredmenyek;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Eredmeny> lista = new ArrayList();
        String line;
        boolean bennevan;
        
        while(!((line = sc.nextLine()).equals("vege")))
        {
            bennevan = false;
            Eredmeny e = new Eredmeny(line.split(";")[0], Integer.parseInt(line.split(";")[1]));
            for (int i = 0; i < lista.size(); i++) {
                if(lista.get(i).equals(e))
                {
                    lista.get(i).setPont(lista.get(i).getPont() + e.getPont());
                    bennevan = true;
                    break;
                }
            }
            if(!bennevan)
                lista.add(e);
        }
        Collections.sort(lista);
        
        for (Eredmeny i : lista) {
            System.out.println(i.toString());
        }
    }
}
