package zarthelyieredmenyek;

public class Eredmeny implements Comparable<Eredmeny>{
    private String nev;
    private int pont;

    public Eredmeny(String nev, int pont) {
        this.nev = nev;
        this.pont = pont;
    }

    public String getNev() {
        return nev;
    }

    public int getPont() {
        return pont;
    }

    public void setPont(int pont) {
        this.pont = pont;
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null || !(obj instanceof Eredmeny))
            return false;
        if(!(this.nev.equals(((Eredmeny)obj).getNev())))
            return false;
        return true;
    }
    
    @Override
    public String toString() {
        return this.nev + ": " + this.pont + " pont";
    }

    @Override
    public int compareTo(Eredmeny o) {
        if(this.pont == o.getPont())
            return this.nev.compareTo(o.getNev());
        return Integer.compare(o.getPont(), this.pont);
    }
}
