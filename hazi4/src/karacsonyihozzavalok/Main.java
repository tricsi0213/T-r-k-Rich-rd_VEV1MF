package karacsonyihozzavalok;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Hozzavalok> lista = new ArrayList();
        String line;
        while(!((line = sc.nextLine()).equals("vege")))
        {
            String[] s = line.split(";");
            int indx = -1;
            for (Hozzavalok i : lista) {
                if(i.getHozzavaloNeve().equals(s[0]))
                    indx = lista.indexOf(i);
            }
            if(indx != -1)
                lista.get(indx).setMennyiseg(lista.get(indx).getMennyiseg() + Integer.parseInt(s[1]));
            else
                lista.add(new Hozzavalok(s[0], Integer.parseInt(s[1])));
        }
        Collections.sort(lista);
        for (Hozzavalok i : lista) {
            System.out.println(i.toString());
        }
    }
}
