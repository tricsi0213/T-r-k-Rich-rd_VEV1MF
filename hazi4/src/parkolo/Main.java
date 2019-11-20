package parkolo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Parkolo> lista = new ArrayList();
        String line;
        while(!((line = sc.nextLine()).equals("vege")))
        {
            int foglalt = line.length() - line.replace(";", "").length() - 2;
            lista.add(new Parkolo(line.split(";")[0], Integer.parseInt(line.split(";")[2]) - foglalt));
        }
        Collections.sort(lista);
        
        for (Parkolo i : lista) {
            if(i.getSzabadHely() >= 3)
                System.out.println(i.toString());
        }
    }
}
