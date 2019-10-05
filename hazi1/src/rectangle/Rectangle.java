package rectangle;

public class Rectangle {
    private double width;
    private double height;
    
    public Rectangle(){
        this.width = 1.0;
        this.height = 1.0;
    }
    
    public Rectangle(double x, double y){
        this.width = x;
        this.height = y;
    }
    
    public double getArea(){
        return this.width*this.height;
    }
    
    public double getPerimeter(){
        return (this.height+this.width)*2;
    }
    
    public String toString(){
        return "Szélesség: " + this.width + " Magasság: " + this.height + " Terület: " + this.getArea() + 
                " Kerület: " + this.getPerimeter();
    }
}
