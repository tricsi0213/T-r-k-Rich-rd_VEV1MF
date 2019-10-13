package angolmagyarszotar;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main implements Comparator<Szotar>{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        
        Szotar[] szotar = new Szotar[Integer.parseInt(line)];
        
        for (int i = 0; i < szotar.length; i++) {
            line = sc.nextLine();
            szotar[i] = new Szotar(line.split(":")[0], line.split(":")[1]);
        }
        
        Arrays.sort(szotar, new Main());
        
        for (int i = 0; i < szotar.length; i++) {
            System.out.println(szotar[i].toString());
        }
        
    }

    @Override
    public int compare(Szotar o1, Szotar o2) {
        if(o1.getAngol_szo().equals(o2.getAngol_szo()))
        {
            return o1.getMagyar_szo().compareTo(o2.getMagyar_szo());
        }
        else
            return o1.getAngol_szo().compareTo(o2.getAngol_szo());
    }
}
