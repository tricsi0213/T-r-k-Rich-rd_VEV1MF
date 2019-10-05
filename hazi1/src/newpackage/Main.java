package newpackage;

public class Main {
    public static void main(String[] args) {
        Pont p1 = new Pont(5, 4);
        Pont p2 = new Pont(4, 1);
        Pont p3 = new Pont(8, 9);
        Pont p4 = new Pont(6, 6);
        p1.setPont(p1.getPontx(), p1.getPonty()+5);
        p2.setPont(p2.getPontx(), p2.getPonty()+5);
        p3.setPont(p3.getPontx()-3.4, p3.getPonty());
        p4.setPont(p4.getPontx()-3.4, p4.getPonty());
        System.out.println(p1.getPontx() + " " + p1.getPonty());
        System.out.println(p2.getPontx() + " " + p2.getPonty());
        System.out.println(p3.getPontx() + " " + p3.getPonty());
        System.out.println(p4.getPontx() + " " + p4.getPonty());
    }
}
