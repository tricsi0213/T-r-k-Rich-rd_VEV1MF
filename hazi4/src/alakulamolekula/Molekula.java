package alakulamolekula;

import java.util.Map;
import java.util.TreeMap;

public class Molekula implements Comparable<Molekula>{
    private String molekulaNeve;
    private Map<String, Integer> alkotoElemek;

    public Molekula(String molekulaNeve) {
        this.molekulaNeve = molekulaNeve;
        this.alkotoElemek = new TreeMap();
    }

    public String getMolekulaNeve() {
        return molekulaNeve;
    }

    public Map<String, Integer> getAlkotoElemek() {
        return alkotoElemek;
    }

    public void setMolekulaNeve(String molekulaNeve) {
        this.molekulaNeve = molekulaNeve;
    }

    public void setAlkotoElemek(Map<String, Integer> alkotoElemek) {
        this.alkotoElemek = alkotoElemek;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.molekulaNeve);
        for (Map.Entry<String, Integer> i : this.alkotoElemek.entrySet()) {
            sb.append("\n" + i.getValue() + " " + i.getKey());
        }
        return sb.toString();
    }

    @Override
    public int compareTo(Molekula o) {
        return this.molekulaNeve.compareTo(o.getMolekulaNeve());
    }
}
