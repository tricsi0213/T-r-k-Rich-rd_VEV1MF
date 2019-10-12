package vendeglatas;

public class Etterem extends VendeglatoipariEgyseg{
    private String[] etlap;

    public Etterem(String[] etlap, String nev, int ferohelyekSzama) {
        super(nev, ferohelyekSzama, false);
        this.etlap = etlap;
    }

    public String[] getEtlap() {
        return etlap;
    }

    @Override
    public String toString() {
        return "Etterem{" + "etlap=" + etlap + '}';
    }
      
}
