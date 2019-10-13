package budapestkupa;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main implements Comparator<Tura>{
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        
        Tura[] turak = new Tura[Integer.parseInt(line)];
        int resztav_osszege = 0;
        int resztavok_szama;
        int max_ut = Integer.MIN_VALUE;
        
        for (int i = 0; i < turak.length; i++) {
            line = sc.nextLine();
            resztavok_szama = (line.length() - line.replace(";", "").length());
            for (int j = 4; j <= resztavok_szama; j++) {
                resztav_osszege += Integer.parseInt(line.split(";")[j]);
            }
            turak[i] = new Tura(Integer.parseInt(line.split(";")[0]),
                                Integer.parseInt(line.split(";")[1]),
                                Integer.parseInt(line.split(";")[2]),
                                line.split(";")[3], resztav_osszege);
            if(max_ut < resztav_osszege)
                max_ut = resztav_osszege;
            resztav_osszege = 0;
        }
        
        Arrays.sort(turak, new Main());
        
        for (int i = 0; i < turak.length; i++) {
            if(turak[i].getUt_hossz() == max_ut)
            {
                System.out.print(turak[i].getEv() + ";");
                if(turak[i].getHonap() < 10)
                    System.out.print("0" + turak[i].getHonap() + ";");
                else
                    System.out.print(turak[i].getHonap() + ";");
                if(turak[i].getNap() < 10)
                    System.out.print("0" + turak[i].getNap() + ";");
                else
                    System.out.print(turak[i].getNap() + ";");
                System.out.println(turak[i].toString());
            }
        }
        
    }

    @Override
    public int compare(Tura o1, Tura o2) {
        if(o1.getEv() == o2.getEv())
        {
            if(o1.getHonap() == o2.getHonap())
            {
                if(o1.getNap() == o2.getNap())
                {
                    return o1.getTura_neve().compareTo(o2.getTura_neve());
                }
                else
                    return Integer.compare(o1.getNap(), o2.getNap());
            }
            else
                return Integer.compare(o1.getHonap(), o2.getHonap());
        }
        else
            return Integer.compare(o1.getEv(), o2.getEv());
    }
}
