package iskola;

import java.util.Scanner;

public class Teszt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nap = sc.next();
        int oraszam = sc.nextInt();
        Ora[] tomb = new Ora[oraszam];
        
        for (int i = 0; i < oraszam; i++) {
            tomb[i] = new Ora(sc.nextInt(), sc.next(), sc.nextInt());
        }
        
        Orarend orarend1 = new Orarend(nap);
        
        for (int i = 0; i < oraszam; i++) {
            System.out.println(orarend1.oratHozzaad(tomb[i]));
        }
        
        System.out.println(orarend1.toString());
        
        for (int i = 0; i < orarend1.getOraszam(); i++) {
            Ora o = (Ora)orarend1.getOrak()[i];
            System.out.println(o.toString());
        }
        
    }
}
