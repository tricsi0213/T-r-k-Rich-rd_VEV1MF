package angolmagyarszotar;

public class Szotar {
    private String angol_szo;
    private String magyar_szo;

    public Szotar(String angol_szo, String magyar_szo) {
        this.angol_szo = angol_szo;
        this.magyar_szo = magyar_szo;
    }

    public String getAngol_szo() {
        return angol_szo;
    }

    public void setAngol_szo(String angol_szo) {
        this.angol_szo = angol_szo;
    }

    public String getMagyar_szo() {
        return magyar_szo;
    }

    public void setMagyar_szo(String magyar_szo) {
        this.magyar_szo = magyar_szo;
    }

    @Override
    public String toString() {
        return angol_szo + ":" + magyar_szo;
    }
        
}
