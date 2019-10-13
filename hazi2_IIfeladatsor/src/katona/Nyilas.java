package katona;

public class Nyilas extends Katona{
    private int lotav;

    public Nyilas(int tamado_ero, int vedo_ero, int lotav) {
        super(tamado_ero, vedo_ero);
        this.lotav = lotav;
    }

    public int getLotav() {
        return lotav + this.getTamado_ero();
    }

    public void setLotav(int lotav) {
        this.lotav = lotav;
    }

    @Override
    public String toString() {
        return "Nyilas: TE: " + this.getLotav() + " VE: " + this.getVedo_ero();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Nyilas other = (Nyilas) obj;
        if (this.lotav != other.lotav) {
            return false;
        }
        if(this.getTamado_ero() != other.getTamado_ero()){
            return false;
        }
        if(this.getVedo_ero() != other.getVedo_ero()){
            return false;
        }
        return true;
    }
      
    
    
}
