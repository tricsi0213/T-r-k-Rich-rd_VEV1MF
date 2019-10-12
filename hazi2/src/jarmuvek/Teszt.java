package jarmuvek;

import java.util.Arrays;

public class Teszt {
    
    public static void maxSzallithatoTeherCsokkeno(Teherauto[] tomb){
        boolean voltcsere = true;
        Teherauto tmp;
        while(voltcsere)
        {
            voltcsere = false;
            for (int i = 0; i < tomb.length-1; i++) {
                if(tomb[i].getMaxSzallithatoTeher() < tomb[i+1].getMaxSzallithatoTeher())
                {
                    tmp = tomb[i];
                    tomb[i] = tomb[i+1];
                    tomb[i+1] = tmp;
                    voltcsere = true;
                }
            }
        }
        
        System.out.println(Arrays.toString(tomb));
    }
    
    public static Auto keresMaxMotorTeljesitmeny(Auto[] auto){
        Auto max = new Auto("", Integer.MIN_VALUE);
        for (int i = 0; i < auto.length; i++) { 
            if(!(auto[i] instanceof Teherauto) && auto[i].getMotorTeljesitmeny() > max.getMotorTeljesitmeny())
                max = auto[i];
        }
        return max;
    }
    
    public static void main(String[] args) {
        Auto[] auto = new Auto[] {
            new Auto("BKV-345", 90),
            new Auto("KDF-634", 120),
            new Auto("UHK-782", 170),
            new Auto("POD-567", 80),
            new Auto("ICE-412", 150),
            new Teherauto("FAX-834", 100, 200),
            new Teherauto("ABC-123", 110, 500),
            new Teherauto("OTP-934", 150, 1120),
            new Teherauto("ROW-349", 300, 3350),
            new Teherauto("SOK-782", 400, 5000),
        };
        
        Teherauto[] teherauto = new Teherauto[]{
            new Teherauto("KAN-745", 90, 50),
            new Teherauto("FOX-444", 500, 6000),
            new Teherauto("TOR-723", 435, 5000),
            new Teherauto("TOL-561", 550, 6300),
            new Teherauto("SOR-912", 200, 210),
            new Teherauto("SUX-112", 155, 210),
            new Teherauto("KIS-998", 185, 290),
            new Teherauto("TAX-777", 195, 310),
            new Teherauto("BON-007", 350, 600),
            new Teherauto("BAR-336", 385, 1550),
        };
        
        maxSzallithatoTeherCsokkeno(teherauto);
        System.out.println(keresMaxMotorTeljesitmeny(auto));
        
    }
}
