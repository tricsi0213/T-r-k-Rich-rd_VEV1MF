package katona;

public class Teszt {
    
    public static Katona megkuzd(Katona a, Katona b){
        if(a.getTamado_ero() > b.getVedo_ero())
            return a;
        if(b.getTamado_ero() > a.getVedo_ero())
            return b;
        else
            return a;
    }
    
    public static void main(String[] args) {
        Katona[] tomb = new Katona[]{
            new Nyilas(20, 50, 30),
            new Nyilas(10, 30, 50),
            new Landzsas(70, 30),
            new Landzsas(50, 40),
            new Landzsas(20, 70)
        };
        
        Katona gyoztes = tomb[0];
        for (int i = 1; i < tomb.length; i++) {
            gyoztes = megkuzd(gyoztes, tomb[i]);
            
        }
        
        System.out.println(gyoztes.toString());
    }
}
