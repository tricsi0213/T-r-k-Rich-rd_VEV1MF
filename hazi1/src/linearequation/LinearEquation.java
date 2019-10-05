package linearequation;

public class LinearEquation {
    private double a, b, c, d, e, f;
    
    public LinearEquation(double a, double b, double c, double d, double e, double f){
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getD() {
        return d;
    }

    public double getE() {
        return e;
    }

    public double getF() {
        return f;
    }
    
    public boolean isSolvable(){
        if((this.a * this.d - this.b * this.c) != 0)
            return true;
        else
            return false;
    }
    
    public double getX(){
        return (this.e*this.d-this.b*this.f)/(this.a*this.d-this.b*this.c);
    }
    
    public double getY(){
        return (this.a*this.f-this.e*this.c)/(this.a*this.d-this.b*this.c);
    }
    
    public String toString(){
        if(this.isSolvable())
        {
            return this.getX() + " " + this.getY();
        }
        else
            return "The equation has no solution.";
    }
}
