package feladat11;

public class Hallgato extends Szemely{
    private double atlag;

    public Hallgato(String nev, int eletkor, boolean ferfi, double atlag) {
        super(nev, eletkor, ferfi);
        this.atlag = atlag;
    }

    public double getAtlag() {
        return atlag;
    }

    @Override
    public String toString() {
        return "Hallgato{" + nev + '\n' + eletkor + '\n' + this.isFerfi() + '\n'
                + this.atlag + '}';
    }
    
    public boolean joKepessegu(){
        if(this.atlag >= 4)
            return true;
        return false;
    }
    
    public boolean joKepessegu(double d){
        if(this.atlag >= d)
            return true;
        return false;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null || !(obj instanceof Hallgato))
            return false;
        Hallgato h = (Hallgato)obj;
        if(!(this.getNev().equals(h.getNev())))
            return false;
        if(this.getEletkor() != h.getEletkor())
            return false;
        if(this.isFerfi() != h.isFerfi())
            return false;
        if(this.getAtlag() != h.getAtlag())
            return false;
        return true;
    }
    
    
    
    
}
