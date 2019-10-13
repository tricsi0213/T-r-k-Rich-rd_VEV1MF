package katona;

public class Katona {
    private int tamado_ero;
    private int vedo_ero;

    public Katona() {
        this.tamado_ero = 5;
        this.vedo_ero = 5;
    }

    public Katona(int tamado_ero, int vedo_ero) {
        this.tamado_ero = tamado_ero;
        this.vedo_ero = vedo_ero;
    }
    
    public int getTamado_ero() {
        return tamado_ero;
    }

    public void setTamado_ero(int tamado_ero) {
        this.tamado_ero = tamado_ero;
    }

    public int getVedo_ero() {
        return vedo_ero;
    }

    public void setVedo_ero(int vedo_ero) {
        this.vedo_ero = vedo_ero;
    }

    @Override
    public String toString() {
        return "TE: " + tamado_ero + " VE: " + vedo_ero;
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
        final Katona other = (Katona) obj;
        if (this.tamado_ero != other.tamado_ero) {
            return false;
        }
        if (this.vedo_ero != other.vedo_ero) {
            return false;
        }
        return true;
    }
    
    
    
}
