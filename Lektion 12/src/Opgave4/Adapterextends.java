package src.Opgave4;

public class Adapterextends extends Vare{
    Spiritus spiritus;

    public Adapterextends(Spiritus spiritus){
        super(spiritus.getPrisen(), spiritus.getBetgenelse());
        this.spiritus = spiritus;
    }

    @Override
    public String getNavn() {
        return spiritus.getBetgenelse();
    }

    @Override
    public int getPris() {
        return spiritus.getPrisen();
    }

    @Override
    public void setPris(int pris) {
        spiritus.setPrisen(pris);
    }

    @Override
    public void setNavn(String navn) {
        spiritus.setBetgenelse(navn);
    }

    @Override
    public double beregnMoms() {
        return spiritus.hentMoms();
    }
}
