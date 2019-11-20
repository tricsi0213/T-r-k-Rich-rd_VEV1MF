package zh;

import java.util.Random;

public class Hallgato {
    private int mennyitKeszult;
    private boolean sokatTanul;

    public Hallgato(int mennyitKeszult, boolean sokatTanul) {
        this.mennyitKeszult = mennyitKeszult;
        this.sokatTanul = sokatTanul;
    }
    
    public Dolgozat dolgozatotIr(){
        if(this.sokatTanul)
            return new Dolgozat((new Random().nextInt(4)+4) * this.mennyitKeszult);
        if(!this.sokatTanul)
            return new Dolgozat((new Random().nextInt(6)) * this.mennyitKeszult);
        System.out.println("Nem írt");
        return new Dolgozat(-1);
    }
}
