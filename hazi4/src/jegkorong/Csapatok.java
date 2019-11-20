package jegkorong;

public class Csapatok implements Comparable<Csapatok>{
    private String csapat;
    private int pont;
    private int lottGol;

    public Csapatok(String csapat, int pont, int lottGol) {
        this.csapat = csapat;
        this.pont = pont;
        this.lottGol = lottGol;
    }

    public String getCsapat() {
        return csapat;
    }

    public int getPont() {
        return pont;
    }

    public int getLottGol() {
        return lottGol;
    }

    public void setPont(int pont) {
        this.pont = pont;
    }

    public void setLottGol(int lottGol) {
        this.lottGol = lottGol;
    }

    @Override
    public String toString() {
        return this.csapat + ": " + this.pont + " points (" + this.lottGol + " scored goals)";
    } 

    @Override
    public int compareTo(Csapatok o) {
        if(this.pont == o.getPont())
        {
            if(this.lottGol == o.getLottGol())
            {
                return this.csapat.compareTo(o.getCsapat());
            }
            return Integer.compare(o.getLottGol(), this.lottGol);
        }
        return Integer.compare(o.getPont(), this.pont);
    }
}
