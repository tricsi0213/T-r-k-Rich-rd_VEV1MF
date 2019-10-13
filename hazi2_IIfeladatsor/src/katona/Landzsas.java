package katona;

public class Landzsas extends Katona{

    public Landzsas(int tamado_ero, int vedo_ero) {
        super(tamado_ero, vedo_ero);
    }

    @Override
    public String toString() {
        return "Landzsas: TE: " + this.getTamado_ero() + " VE: " + this.getVedo_ero();
    }
    
    
    
}
