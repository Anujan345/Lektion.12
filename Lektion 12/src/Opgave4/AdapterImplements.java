package src.Opgave4;

public class AdapterImplements implements Vare1{
    private Spiritus spiritus;

    public AdapterImplements(Spiritus spiritus){
        this.spiritus=spiritus;
    }
    @Override
    public int getPris() {
        return this.spiritus.getPrisen();
    }

    @Override
    public void setPris(int pris) {
        this.spiritus.setPrisen(pris);
    }

    @Override
    public String getNavn() {
        return this.spiritus.getBetgenelse();
    }

    @Override
    public void setNavn(String navn) {
        this.spiritus.setBetgenelse(navn);
    }

    @Override
    public double beregnMoms() {
        return this.spiritus.hentMoms();
    }
}
