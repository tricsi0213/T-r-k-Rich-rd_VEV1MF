package alakulamolekula;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, String> elemek = new TreeMap();
        List<Molekula> lista = new ArrayList();
        String line;
        while(!((line = sc.nextLine()).equals("-")))
        {
            elemek.put(line.split(":")[0], line.split(":")[1]);
        }
        int indx = 0;
        while(!((line = sc.nextLine()).equals("vege")))
        {
            String[] s = line.split(":|\\,");
            lista.add(new Molekula(s[0]));
            for (int i = 1; i < s.length; i++) {   
                if(lista.get(indx).getAlkotoElemek().containsKey(elemek.get(s[i])))
                    lista.get(indx).getAlkotoElemek().put(elemek.get(s[i]), lista.get(indx).getAlkotoElemek().get(elemek.get(s[i])) + 1);
                else
                    lista.get(indx).getAlkotoElemek().put(elemek.get(s[i]), 1);
            }
            indx++;
        }
        Collections.sort(lista);
        for (Molekula i : lista) {
            System.out.println(i.toString());
        }
    }
}
