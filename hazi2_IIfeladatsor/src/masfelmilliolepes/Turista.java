package masfelmilliolepes;

public class Turista {
    private String nev;
    private int kek_jelzes;
    private int helyi_jelzes;

    public Turista(String nev, int kek_jelzes, int helyi_jelzes) {
        this.nev = nev;
        this.kek_jelzes = kek_jelzes;
        this.helyi_jelzes = helyi_jelzes;
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public int getKek_jelzes() {
        return kek_jelzes;
    }

    public void setKek_jelzes(int kek_jelzes) {
        this.kek_jelzes = kek_jelzes;
    }

    public int getHelyi_jelzes() {
        return helyi_jelzes;
    }

    public void setHelyi_jelzes(int helyi_jelzes) {
        this.helyi_jelzes = helyi_jelzes;
    }

    @Override
    public String toString() {
        return nev;
    }
    
    
    
}
