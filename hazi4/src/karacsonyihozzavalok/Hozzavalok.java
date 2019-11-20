package karacsonyihozzavalok;

public class Hozzavalok implements Comparable<Hozzavalok>{
    private String hozzavaloNeve;
    private int mennyiseg;

    public Hozzavalok(String hozzavaloNeve, int mennyiseg) {
        this.hozzavaloNeve = hozzavaloNeve;
        this.mennyiseg = mennyiseg;
    }

    public String getHozzavaloNeve() {
        return hozzavaloNeve;
    }

    public int getMennyiseg() {
        return mennyiseg;
    }

    public void setMennyiseg(int mennyiseg) {
        this.mennyiseg = mennyiseg;
    }

    @Override
    public String toString() {
        return this.hozzavaloNeve + ";" + this.mennyiseg;
    }

    @Override
    public int compareTo(Hozzavalok o) {
        if(this.mennyiseg == o.getMennyiseg())
            return this.hozzavaloNeve.compareTo(o.getHozzavaloNeve());
        return Integer.compare(o.getMennyiseg(), this.mennyiseg);
    }
    
    
}
