package feladat11;

public class Oktato extends Szemely{
    private String tanszek;

    public Oktato(String nev, int eletkor, boolean ferfi, String tanszek) {
        super(nev, eletkor, ferfi);
        this.tanszek = tanszek;
    }

    public String getTanszek() {
        return tanszek;
    }
    
    @Override
    public String toString() {
        return "Oktato{" + nev + "tanszek=" + tanszek + '}';
    }
    
    @Override
    public boolean equals(Object obj) {
        if(obj == null || !(obj instanceof Oktato))
            return false;
        Oktato o = (Oktato)obj;
        if(!(this.getNev().equals(o.getNev())))
            return false;
        if(this.getEletkor() != o.getEletkor())
            return false;
        if(this.isFerfi() != o.isFerfi())
            return false;
        if(!(this.getTanszek().equals(o.getTanszek())))
            return false;
        return true;
    }
}
