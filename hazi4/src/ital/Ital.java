package ital;

import java.util.Objects;

public class Ital implements Comparable<Ital>{
    protected String nev;
    protected String kiszereles;
    protected int ar;

    public Ital(String nev, String kiszereles, int ar) {
        this.nev = nev;
        this.kiszereles = kiszereles;
        this.ar = ar;
    }

    public String getNev() {
        return nev;
    }

    public String getKiszereles() {
        return kiszereles;
    }

    public int getAr() {
        return ar;
    }

    @Override
    public String toString() {
        return this.getNev() + ", " + this.getKiszereles() + ", " +
                this.getAr() + " Ft";
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null || !(obj instanceof Ital))
            return false;
        Ital i = (Ital)obj;
        if(!(this.nev.equals(i.getNev())))
            return false;
        if(!(this.kiszereles.equals(i.getKiszereles())))
            return false;
        return true;
    }

    @Override
    public int compareTo(Ital o) {
        return Integer.compare(this.ar, o.getAr());
    }
    
    
}
