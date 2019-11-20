package osztalypenz;

import java.util.Objects;

public class Osztalypenz implements Comparable<Osztalypenz>{
    private String nev;
    private int osszeg;

    public Osztalypenz(String nev, int osszeg) {
        this.nev = nev;
        this.osszeg = osszeg;
    }

    public String getNev() {
        return nev;
    }

    public int getOsszeg() {
        return osszeg;
    }

    public void setOsszeg(int osszeg) {
        this.osszeg = osszeg;
    }
    
    @Override
    public int compareTo(Osztalypenz o) {
        if(this.osszeg == o.getOsszeg())
            return this.nev.compareTo(o.getNev());
        return (-1)*Integer.compare(this.osszeg, o.getOsszeg());
    }

    @Override
    public String toString() {
        return this.nev + ";" + this.osszeg;
    } 
}
