package bankkartyaszam;

import java.util.Scanner;

public class Main {
    
    public static int convert(String s){
        int osszeg = 0;
        for (int i = 0; i < s.length(); i++) {
            if(i%2 == 0)
            {
                if(Character.getNumericValue(s.charAt(i))*2 > 9)
                    osszeg += Character.getNumericValue(s.charAt(i))*2 - 9;
                else
                    osszeg += Character.getNumericValue(s.charAt(i))*2;
            }
            else
                osszeg += Character.getNumericValue(s.charAt(i));
        }
        return osszeg;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line;
        while(!((line = sc.nextLine()).equals("vege"))) //while(sc.hasNextLine())
        {
            if(convert(line) % 10 == 0)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
