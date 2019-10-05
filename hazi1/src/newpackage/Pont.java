package newpackage;

public class Pont {
    private double x;
    private double y;
    
    public Pont(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    public double getPontx(){
        return x;
    }
    
    public double getPonty(){
        return y;
    }
    
    public void setPont(double x, double y){
        this.x = x;
        this.y = y;
    }
}
