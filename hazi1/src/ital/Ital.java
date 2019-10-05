package ital;

import java.util.Date;
import java.util.Objects;

public class Ital {
     protected String név;
     protected String kiszerelés;                
     private  static int ár = 10;                
     protected Date gyártásiDátum;
     
     public Ital(String név, String kiszerelés){
         this.név = név;
         this.kiszerelés = kiszerelés;
         this.gyártásiDátum = new Date();
     }

    public String getNév() {
        return név;
    }

    public String getKiszerelés() {
        return kiszerelés;
    }

    public static int getÁr() {
        return ár;
    }

    public Date getGyártásiDátum() {
        return gyártásiDátum;
    }

    public void setNév(String név) {
        this.név = név;
    }

    public void setKiszerelés(String kiszerelés) {
        this.kiszerelés = kiszerelés;
    }

    public static void setÁr(int ár) {
        Ital.ár = ár;
    }

    public void setGyártásiDátum(Date gyártásiDátum) {
        this.gyártásiDátum = gyártásiDátum;
    }
    
    public String toString(){
        return this.név + ", " + this.kiszerelés + ", " + this.ár + " Ft";
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
        final Ital other = (Ital) obj;
        if (!Objects.equals(this.név, other.név)) {
            return false;
        }
        if (!Objects.equals(this.kiszerelés, other.kiszerelés)) {
            return false;
        }
        if (!Objects.equals(this.ár, other.ár)) {
            return false;
        }
        return true;
    }
    
    public static int getArEuroban(){
        return Ital.getÁr()*330;
    }   
}
