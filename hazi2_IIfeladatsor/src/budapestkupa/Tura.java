package budapestkupa;

public class Tura {
    private int ev;
    private int honap;
    private int nap;
    private String tura_neve;
    private int ut_hossz;

    public Tura(int ev, int honap, int nap, String tura_neve, int ut_hossz) {
        this.ev = ev;
        this.honap = honap;
        this.nap = nap;
        this.tura_neve = tura_neve;
        this.ut_hossz = ut_hossz;
    }

    public int getEv() {
        return ev;
    }

    public void setEv(int ev) {
        this.ev = ev;
    }

    public int getHonap() {
        return honap;
    }

    public void setHonap(int honap) {
        this.honap = honap;
    }

    public int getNap() {
        return nap;
    }

    public void setNap(int nap) {
        this.nap = nap;
    }

    public String getTura_neve() {
        return tura_neve;
    }

    public void setTura_neve(String tura_neve) {
        this.tura_neve = tura_neve;
    }

    public int getUt_hossz() {
        return ut_hossz;
    }

    public void setUt_hossz(int ut_hossz) {
        this.ut_hossz = ut_hossz;
    }

    @Override
    public String toString() {
        return tura_neve;
    }
      
}
