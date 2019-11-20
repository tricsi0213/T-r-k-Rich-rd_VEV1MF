package jegkorong;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Csapatok> lista = new ArrayList();
        String line;
        int gyoztesPont;
        int vesztesPont;
        int elsoCsapatGol;
        int masodikCsapatGol;
        boolean elsoCsapatNyert;
        int indxcs1;
        int indxcs2;
        while(!((line = sc.nextLine()).equals("vege")))
        {
            if((line.length() - line.replace(",", "").length() + 1) > 3)
            {
                gyoztesPont = 2;
                vesztesPont = 1;
            }
            else
            {
                gyoztesPont = 3;
                vesztesPont = 0;
            }
            indxcs1 = -1;
            indxcs2 = -1;
            elsoCsapatGol = 0;
            masodikCsapatGol = 0;
            elsoCsapatNyert = false;
            String[] s = line.split("-|\\:|\\,");
            for (int i = 2; i < s.length; i++) {
                if(i % 2 == 0)
                    elsoCsapatGol += Integer.parseInt(s[i]);
                else
                    masodikCsapatGol += Integer.parseInt(s[i]);
            }
            if(elsoCsapatGol > masodikCsapatGol)
                elsoCsapatNyert = true;
            for (Csapatok i : lista) {
                if(i.getCsapat().equals(s[0]))
                    indxcs1 = lista.indexOf(i);
                else if(i.getCsapat().equals(s[1]))
                    indxcs2 = lista.indexOf(i);
            }
            if(indxcs1 != -1)
            {
                lista.get(indxcs1).setLottGol(lista.get(indxcs1).getLottGol() + elsoCsapatGol);
                if(elsoCsapatNyert)
                {
                    lista.get(indxcs1).setPont(lista.get(indxcs1).getPont() + gyoztesPont);
                }
                else
                {
                    lista.get(indxcs1).setPont(lista.get(indxcs1).getPont() + vesztesPont);
                }
            }
            else
            {
                if(elsoCsapatNyert)
                {
                    lista.add(new Csapatok(s[0], gyoztesPont, elsoCsapatGol));
                }
                else
                {
                    lista.add(new Csapatok(s[0], vesztesPont, elsoCsapatGol));
                }
            }
            
            if(indxcs2 != -1)
            {
                lista.get(indxcs2).setLottGol(lista.get(indxcs2).getLottGol() + masodikCsapatGol);
                if(!elsoCsapatNyert)
                {
                    lista.get(indxcs2).setPont(lista.get(indxcs2).getPont() + gyoztesPont);
                }
                else
                {
                    lista.get(indxcs2).setPont(lista.get(indxcs2).getPont() + vesztesPont);
                }
            }
            else
            {
                if(!elsoCsapatNyert)
                {
                    lista.add(new Csapatok(s[1], gyoztesPont, masodikCsapatGol));
                }
                else
                {
                    lista.add(new Csapatok(s[1], vesztesPont, masodikCsapatGol));
                }
            }
        }
        Collections.sort(lista);
        for (Csapatok i : lista) {
            System.out.println(i.toString());
        }
    }
}
