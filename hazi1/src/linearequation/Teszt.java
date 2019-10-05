package linearequation;

public class Teszt {
    public static void main(String[] args) {
        LinearEquation[] t = new LinearEquation[3];
        t[0] = new LinearEquation(5, 6, 8, 7, 2, 6);
        t[1] = new LinearEquation(9, 12, 45, 7, 65, 3);
        t[2] = new LinearEquation(6, 5, 1, 6, 7, 10);
        
        for (int i = 0; i < t.length; i++) {
            System.out.println(t[i].toString());
        }
    }
}
