package vendeglatas;

public class Kocsma extends VendeglatoipariEgyseg{
    private String[] sorlap;

    public Kocsma(String[] sorlap, String nev, int ferohelyekSzama) {
        super(nev, ferohelyekSzama, true);
        this.sorlap = sorlap;
    }

    public String[] getSorlap() {
        return sorlap;
    }

    @Override
    public String toString() {
        return "Kocsma{" + "sorlap=" + sorlap + '}';
    }
      
}
