package alakzatok;

public class Circle extends GeometricShape{
    private double radius;
    
    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    public double getArea(){
        return Math.pow(this.radius, 2)*Math.PI;
    }
    
    public double getPerimeter(){
        return 2*this.radius*Math.PI;
    }
    
    public double getDiameter(){
        return 2*this.radius;
    }
      
}
