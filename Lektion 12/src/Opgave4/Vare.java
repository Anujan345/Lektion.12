package Opgave4;

public abstract class Vare implements Vare1 {
    private int pris;
    private String navn;

    public Vare(int pris, String navn){
        this.navn = navn;
        this.pris = pris;
    }

    @Override
    public int getPris() {
        return pris;
    }

    @Override
    public void setPris(int pris) {
        this.pris = pris;
    }

    @Override
    public String getNavn() {
        return navn;
    }

    @Override
    public void setNavn(String navn) {
        this.navn = navn;
    }

    @Override
    public double beregnMoms(){
        return 0.0;
    }


}
