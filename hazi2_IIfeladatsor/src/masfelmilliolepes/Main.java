package masfelmilliolepes;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main implements Comparator<Turista>{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        
        Turista[] turistak = new Turista[Integer.parseInt(line)];
        int kek = 0;
        int helyi = 0;
        
        for (int i = 0; i < turistak.length; i++) {
            line = sc.nextLine();
            kek = line.split(";")[1].length() - line.split(";")[1].replace("K", "").length();
            helyi = line.split(";")[1].length() - line.split(";")[1].replace("P", "").length();
            helyi += line.split(";")[1].length() - line.split(";")[1].replace("S", "").length();
            helyi += line.split(";")[1].length() - line.split(";")[1].replace("Z", "").length();
            turistak[i] = new Turista(line.split(";")[0],  kek, helyi);
            kek = 0;
            helyi = 0;
        }
        
        Arrays.sort(turistak, new Main());
        
        for (int i = 0; i < turistak.length; i++) {
            System.out.println(turistak[i].toString()); 
        }
        
    }

    @Override
    public int compare(Turista o1, Turista o2) {
        if(o1.getKek_jelzes() == o2.getKek_jelzes())
        {
            if(o1.getHelyi_jelzes() == o2.getHelyi_jelzes())
            {
                return o1.getNev().compareTo(o2.getNev());
            }
            else
                return Integer.compare(o2.getHelyi_jelzes(), o1.getHelyi_jelzes());
        }
        else
            return Integer.compare(o2.getKek_jelzes(), o1.getKek_jelzes());
    }
}
