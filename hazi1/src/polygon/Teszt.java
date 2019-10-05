package polygon;

public class Teszt {
    public static void main(String[] args) {
        RegularPolygon poly1 = new RegularPolygon();
        RegularPolygon poly2 = new RegularPolygon(6,4);
        RegularPolygon poly3 = new RegularPolygon(10,4,5.6,7.8);
        
        System.out.println(poly1.toString());
        
        System.out.println(poly1.getPerimeter() + " " + poly1.getArea());
        System.out.println(poly2.getPerimeter() + " " + poly2.getArea());
        System.out.println(poly3.getPerimeter() + " " + poly3.getArea());
    }
}
