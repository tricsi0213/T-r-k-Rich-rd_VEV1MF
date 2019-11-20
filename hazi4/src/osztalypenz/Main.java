package osztalypenz;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Osztalypenz> lista = new ArrayList();
        String line;
        while(!((line = sc.nextLine()).equals("vege"))) // while(sc.hasNextLine())
        {
            String[] s = line.split(";");// String[] s = sc.nextLine().split(";");
            int poz = -1;
            for (int i = 0; i < lista.size(); i++) {
                if(lista.get(i).getNev().equals(s[0]))
                {
                    poz = i;
                    break;
                }
            }
            if(poz != -1)
                lista.get(poz).setOsszeg(lista.get(poz).getOsszeg() + Integer.parseInt(s[1]));
            else
                lista.add(new Osztalypenz(s[0], Integer.parseInt(s[1])));
        }
        Collections.sort(lista);
        for (Osztalypenz i : lista) {
            System.out.println(i.toString());
        }
    }
}
