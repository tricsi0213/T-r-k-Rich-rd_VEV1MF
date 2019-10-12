package triangle;

public class Teszt {
    public static void main(String[] args) {
        Triangle t = new Triangle(1, 1.5, 1, "yellow", true);
        System.out.println("Terület: " + t.getArea() + " Kerület: " + t.getPerimeter() + " Szín: " + t.getColor()
        + " Kitöltve: " + t.isFilled());
    }
}
