package feladat11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    
    public static double joKepesseguekEletkoranakAtlaga(Set<Szemely> h){
        double res = 0;
        int o = 0;
        for (Szemely i : h) {
            if(i instanceof Hallgato && ((Hallgato)i).joKepessegu())
            {
                res += i.getEletkor();
                o++;
            }
        }
        return res/o;
    }
    
    public static void main(String[] args) {
        Szemely sz1 = new Szemely("Mona Liza", 20, false);
        System.out.println(sz1.toString());
        Scanner sc = new Scanner(System.in);
        Szemely[] tomb = new Szemely[4];
        int elem = 0;
        for (int i = 0; i < 2; i++) {
            String[] s = sc.nextLine().split(" ");
            tomb[elem] = new Hallgato(s[0], Integer.parseInt(s[1]), Boolean.valueOf(s[2]), Double.parseDouble(s[3]));
            elem++;
        }
        for (int i = 0; i < 2; i++) {
            String[] s = sc.nextLine().split(" ");
            tomb[elem] = new Oktato(s[0], Integer.parseInt(s[1]), Boolean.valueOf(s[2]), s[3]);
            elem++;
        }
        
        
        /*for (Szemely i : tomb) {
            System.out.println(i.toString());
        }
        List<Szemely> list = new ArrayList();
        Collections.addAll(list, tomb);
        Egyetem egy = new Egyetem(list);
        Hallgato sz3 = new Hallgato("Mona Liza", 20, false, 2);
        egy.addHallgato(sz3);
        Hallgato sz2 = new Hallgato("Janos", 19, true, 3);
        egy.addHallgato(sz2);
        egy.itNoiOktatoi();
        System.out.println();
        System.out.println();
        for (Szemely i : list) {
            System.out.println(i.toString());
        }*/ 
    }
}
