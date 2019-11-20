package feladat11;

import java.util.Collections;
import java.util.List;

public class Egyetem {
    private List<Szemely> list;

    public Egyetem(List<Szemely> list) {
        this.list = list;
    }
    
    public Egyetem(Szemely... sz){
        for (Szemely i : sz) {
            this.list.add(i);
        }
    }
    
    public Egyetem(Hallgato... h){
        for (Hallgato i : h) {
            this.list.add(i);
        }
    }
    
    public Egyetem(Oktato... o){
        for (Oktato i : o) {
            this.list.add(i);
        }
    }
    
    public void addHallgato(Hallgato h){
        this.list.add(h);
    }
    
    public void addOktato(Oktato o){
        this.list.add(o);
    }
    
    public void removeHallgato(Hallgato h){
        for (Szemely i : this.list) {
            if(i instanceof Hallgato && ((Hallgato)i).equals(h)){
                this.list.remove(i);
                break;
            }
        }
    }
    
    public void removeOktato(Oktato o){
        for (Szemely i : this.list) {
            if(i instanceof Oktato && ((Oktato)i).equals(o)){
                this.list.remove(i);
                break;
            }
        }
    }
    
    public void kiirLegfiatalabbHallgato(){
        int hallgatok = 0;
        for (Szemely i : this.list) {
            if(i instanceof Hallgato)
                hallgatok++;
        }
        if(hallgatok <= 3)
        {
            for (Szemely i : this.list) {
                if(i instanceof Hallgato)
                    System.out.println(((Hallgato)i).toString());
            }
        }
        else{
            Collections.sort(list);
            int kiirt = 0;
            for (Szemely i : list) {
                if(i instanceof Hallgato)
                {
                    System.out.println(((Hallgato)i).toString());
                    kiirt++;
                }
                if(kiirt == 3)
                    break;
            }
        }
    }
    
    public void itNoiOktatoi(){
        for (Szemely i : this.list) {
            if(i instanceof Oktato && !((Oktato)i).isFerfi() && ((Oktato)i).getTanszek().equals("Szamitastudomany"))
            {
                StringBuilder sb = new StringBuilder();
                sb.append(((Oktato)i).getNev()).append('!');
                ((Oktato)i).setNev(sb.toString());
            }
        }
    }
    
    @Override
    public String toString() {
        return "Egyetem{" + "list=" + list + '}';
    }
}
