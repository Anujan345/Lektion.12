package Opgave4;

public class Foedevare extends Vare{

    public Foedevare(int pris, String navn) {
        super(pris, navn);
    }

    @Override
    public double beregnMoms() {
        return super.getPris() * 0.05;
    }
}
