package feladat10;

public class Teherauto extends Auto{
    
    private int teherbiras;

    public Teherauto(String rendszam, int teljesitmeny, boolean automata, int teherbiras) {
        super(rendszam, teljesitmeny, automata);
        this.teherbiras = teherbiras;
    }

    public int getTeherbiras() {
        return teherbiras;
    }
    
    @Override
    public String toString() {
        return "Teherauto{" + "rendszam=" + this.getRendszam() + ", teljesitmeny=" 
               + this.getTeljesitmeny() + ", automata=" + this.isAutomata()
               + ", teherbiras=" + teherbiras + '}';
    }
    
    
}
