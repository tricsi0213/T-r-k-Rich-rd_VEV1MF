package algebra;

public class Teszt {
    public static void main(String[] args) {
        QuadraticEquation[] t = new QuadraticEquation[3];
        t[0] = new QuadraticEquation(1, 2, 5);
        t[1] = new QuadraticEquation(2, 5, 2);
        t[2] = new QuadraticEquation(1, 4, 4);
        
        for (int i = 0; i < t.length; i++) {
            System.out.println(t[i].toString());
        }
    }
}
