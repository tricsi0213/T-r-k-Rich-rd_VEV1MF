package kopapirollo;

import java.util.Random;
import java.util.Scanner;

public class KoPapirOllo {
    
    public static String kiNyert(String jatekos){
        String gep = veletlenSzam();
        if(jatekos.equals(gep))
            return "Döntetlen";
        if(jatekos.equals("ko"))
        {
            if(gep.equals("ollo"))
                return "Jatekos nyert.";
            if(gep.equals("papir"))
                return "Jatekos vesztett.";
        }
        if(jatekos.equals("papir"))
        {
            if(gep.equals("ko"))
                return "Jatekos nyert.";
            if(gep.equals("ollo"))
                return "Jatekos vesztett.";
        }
        if(jatekos.equals("ollo"))
        {
            if(gep.equals("papir"))
                return "Jatekos nyert.";
            if(gep.equals("ko"))
                return "Jatekos vesztett.";
        }
        return "default";
    }
    
    public static String veletlenSzam(){
        Random rand = new Random();
        int res = rand.nextInt(3);
        switch(res){
            case 0:
                return "ko";
            case 1:
                return "papir";
            case 2:
                return "ollo";
        }
        return "default";
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line;
        while(!((line = sc.nextLine()).equals("vege"))){
            if(!(line.equals("ko")) && !(line.equals("papir")) && !(line.equals("ollo")))
            {
                continue;
            }
            System.out.println(kiNyert(line));
        }
    }
}
