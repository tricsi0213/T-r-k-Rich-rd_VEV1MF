package feladat10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    
    public static List<Teherauto> meghaladjaA20Tonnat(Auto[] tomb){
        List<Teherauto> lista = new ArrayList();
        
        for (int i = 0; i < tomb.length; i++) {
            if(tomb[i] instanceof Teherauto && ((Teherauto)tomb[i]).getTeherbiras() > 20000){
                lista.add((Teherauto)tomb[i]);
            }
        }
        return lista;
    }
    
    public static void kiirLegnagyobbTeljesitmeny(List<Auto> lista){
        Collections.sort(lista);
        if(lista.size() <= 3){
            for (Auto i : lista) {
                System.out.println(i.toString());
            }
        }
        else{
            for (int i = lista.size() - 1; i > lista.size()-4; i--) {
                System.out.println(lista.get(i).toString());
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Auto a1 = new Auto(sc.nextLine(), 100, true);
        System.out.println(a1.toString());
        Auto[] tomb = new Auto[4];
        int elem = 0;
        for (int i = 0; i < 2; i++) {
            String s[] = sc.nextLine().split(" ");
            tomb[elem] = new Auto(s[0], Integer.parseInt(s[1]), Boolean.valueOf(s[2]));
            elem++;
        }
        for (int i = 0; i < 2; i++) {
            String s[] = sc.nextLine().split(" ");
            tomb[elem] = new Teherauto(s[0], Integer.parseInt(s[1]), Boolean.valueOf(s[2]), Integer.parseInt(s[3]));
            elem++;
        }
        
        /*System.out.println(Auto.getPeldanySzam());*/
    }
}
