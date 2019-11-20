package feladat10;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Auto implements Comparable<Auto>{
    private String rendszam;
    private int teljesitmeny;
    private boolean automata;
    private static int peldanySzam;
    private List<String> extrak;

    public Auto(String rendszam, int teljesitmeny, boolean automata) {
        this.rendszam = rendszam;
        this.teljesitmeny = teljesitmeny;
        this.automata = automata;
        peldanySzam++;
        this.extrak = new ArrayList();
    }

    public String getRendszam() {
        return rendszam;
    }

    public int getTeljesitmeny() {
        return teljesitmeny;
    }

    public boolean isAutomata() {
        return automata;
    }

    public static int getPeldanySzam() {
        return peldanySzam;
    }

    public List<String> getExtrak() {
        return extrak;
    }

    public void setExtrak(List<String> extrak) {
        for (String i : extrak) {
            this.extrak.add(i);
        }
    }
    
    public void setExtrak(String s){
        this.extrak.add(s);
    }
    
    public void torolExtrak(String s){
        for (int i = 0; i < this.extrak.size(); i++) {
            if(this.extrak.get(i).equals(s)){
                this.extrak.remove(i);
            }
        }
    }
    
    @Override
    public String toString() {
        return "Auto{" + "rendszam=" + rendszam + ", teljesitmeny=" + teljesitmeny + ", automata=" + automata + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.rendszam);
        return hash;
    }
    
    @Override
    public boolean equals(Object obj) {
        if(obj == null || !(obj instanceof Auto))
            return false;
        return this.rendszam.equals(((Auto)obj).rendszam);
    }  

    @Override
    public int compareTo(Auto o) {
        return Integer.compare(this.teljesitmeny, o.getTeljesitmeny());
    }
    
    public boolean rendszamSzabalyos(){
        if(this.rendszam.length() != 6)
            return false;
        for (int i = 0; i < this.rendszam.length()-3; i++) {
            char c = this.rendszam.toLowerCase().charAt(i);
            if(c < 'a' || c > 'z')
                return false;
        }
        for (int i = 3; i < this.rendszam.length(); i++) {
            if(!(Character.isDigit(this.rendszam.charAt(i))))
                return false;
        }
        return true;
    }
}
