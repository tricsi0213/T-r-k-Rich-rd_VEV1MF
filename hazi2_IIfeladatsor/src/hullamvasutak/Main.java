package hullamvasutak;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main implements Comparator<Hullamvasut>{
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        Hullamvasut[] tomb = new Hullamvasut[Integer.parseInt(line)];
        
        for (int i = 0; i < tomb.length; i++) {
            line = sc.nextLine();
            System.out.println(line);
            tomb[i] = new Hullamvasut(line.split(";")[0], line.split(";")[1],
            Integer.parseInt(line.split(";")[2]), Integer.parseInt(line.split(";")[3]));
        }
        
        Arrays.sort(tomb, new Main());
        
        for (int i = 0; i < tomb.length; i++) {
            System.out.println(tomb[i].toString());
        }
    }

    @Override
    public int compare(Hullamvasut o1, Hullamvasut o2) {
        if(o1.getVarakozasi_ido() == o2.getVarakozasi_ido())
        {
            if(o1.getLegkisebb_magassag() == o2.getLegkisebb_magassag())
            {
                return o1.getHullamvasut_neve().compareTo(o2.getHullamvasut_neve());
            }
            else
                return Integer.compare(o2.getLegkisebb_magassag(), o1.getLegkisebb_magassag());
        }
        else
            return Integer.compare(o1.getVarakozasi_ido(), o2.getVarakozasi_ido());
    }
}
