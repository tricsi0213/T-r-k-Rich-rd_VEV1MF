package iskola;

import java.util.Arrays;

public class Orarend {
    private String nap;
    private Ora[] orak;
    private int oraszam;

    public Orarend(String nap) {
        this.nap = nap;
        this.oraszam = 0;
        this.orak = new Ora[12];
    }

    public String getNap() {
        return nap;
    }

    public void setNap(String nap) {
        this.nap = nap;
    }

    public Ora[] getOrak() {
        return orak;
    }

    public void setOrak(Ora[] orak) {
        this.orak = orak;
    }

    public int getOraszam() {
        return oraszam;
    }

    public void setOraszam(int oraszam) {
        this.oraszam = oraszam;
    }

    @Override
    public String toString() {
        return "Orarend " + nap + ", oraszam: " + oraszam;
    }
    
    public boolean oratHozzaad(Ora ora){
        if(this.oraszam == 12)
            return false;
        for (int i = 0; i < this.orak.length; i++) {
            Ora o = (Ora)this.orak[i];
            if(o != null)
            {
                if(o.getKezdes() == ora.getKezdes())
                    return false;
            }
        }
        this.orak[oraszam] = ora;
        this.oraszam++;
        return true;
    }
    
}
