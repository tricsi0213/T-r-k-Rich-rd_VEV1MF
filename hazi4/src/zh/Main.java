package zh;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Hallgato[] tomb = new Hallgato[Integer.parseInt(sc.nextLine())];
        for (int i = 0; i < tomb.length; i++) {
            String[] s = sc.nextLine().split(" ");
            if(s[1].equals("igaz"))
                tomb[i] = new Hallgato(Integer.parseInt(s[0]), true);
            else
                tomb[i] = new Hallgato(Integer.parseInt(s[0]), false);
        }
        for (Hallgato i : tomb) {
            if(i.dolgozatotIr().megfelelt() && i.dolgozatotIr().megfelelt())
                System.out.println("Megfelelt!");
            else
                System.out.println("Nem felelt meg!");
        }
    }
}
