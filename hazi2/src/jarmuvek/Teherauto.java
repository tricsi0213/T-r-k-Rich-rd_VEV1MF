package jarmuvek;

public class Teherauto extends Auto{
    private int maxSzallithatoTeher;

    public Teherauto(String rendszam, int motorTeljesitmeny, int maxSzallithatoTeher) {
        super(rendszam, motorTeljesitmeny);
        this.maxSzallithatoTeher = maxSzallithatoTeher;
    }

    public int getMaxSzallithatoTeher() {
        return maxSzallithatoTeher;
    }

    @Override
    public String toString() {
        return "Teherauto{" + "maxSzallithatoTeher=" + maxSzallithatoTeher + '}';
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
        final Teherauto other = (Teherauto) obj;
        if (this.maxSzallithatoTeher != other.maxSzallithatoTeher) {
            return false;
        }
        return true;
    }
     
}
