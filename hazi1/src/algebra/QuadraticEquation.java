package algebra;

public class QuadraticEquation {
    private int a;
    private int b;
    private int c;
    
    public QuadraticEquation(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }
    
    public int getDiscriminant(){
        return this.b * this.b - 4 * this.a * this.c;
    }
    
    public double getRoot1(){
        if(this.getDiscriminant() >= 0)
        {
            return ((-this.b + Math.sqrt(this.getDiscriminant())) / 2 * this.a);
        }
        return 0;
    }
    
    public double getRoot2(){
        if(this.getDiscriminant() >= 0)
        {
            return ((-this.b - Math.sqrt(this.getDiscriminant())) / 2 * this.a);
        }
        return 0;
    }
    
    public String toString(){
        if(this.getDiscriminant() > 0)
        {
            return "Root1 = " + this.getRoot1() + " Root2 = " + this.getRoot2();
        }
        else if(this.getDiscriminant() == 0)
        {
            return "Root = " + this.getRoot1();
        }
        else
            return "The equation has no roots.";
    }
}
