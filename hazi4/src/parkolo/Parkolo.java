package parkolo;

public class Parkolo implements Comparable<Parkolo>{
    private String cim;
    private int szabadHely;

    public Parkolo(String cim, int szabadHely) {
        this.cim = cim;
        this.szabadHely = szabadHely;
    }

    public String getCim() {
        return cim;
    }

    public int getSzabadHely() {
        return szabadHely;
    }
    
    @Override
    public String toString() {
        return this.cim + ": " + this.szabadHely + " szabad hely";
    }

    @Override
    public int compareTo(Parkolo o) {
        if(this.szabadHely == o.getSzabadHely())
            return this.cim.compareTo(o.getCim());
        return Integer.compare(o.getSzabadHely(), this.szabadHely);
    }
}
