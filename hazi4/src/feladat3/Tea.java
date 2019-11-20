package feladat3;

import java.util.Objects;

public class Tea implements Rendezheto{
    public String nev;
    public int ar;
    
    public Tea(String s, int j){
        this.nev = s;
        this.ar = j;
    }

    @Override
    public boolean egyenlo(Object o) {
        if(o == null || !(o instanceof Tea))
            return false;
        Tea obj = (Tea)o;
        return this.nev.equals(obj.nev) && this.ar == obj.ar;
    }

    @Override
    public boolean nagyobbMint(Object o) {
        if(o == null || !(o instanceof Tea))
            return false;
        Tea obj = (Tea)o;
        return this.ar > obj.ar;
    }

    @Override
    public boolean kisebbMint(Object o) {
        if(o == null || !(o instanceof Tea))
            return false;
        Tea obj = (Tea)o;
        return this.ar < obj.ar;
    }
}
