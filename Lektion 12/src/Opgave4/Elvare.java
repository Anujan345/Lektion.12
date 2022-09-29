package Opgave4;

public class Elvare extends Vare{

    public Elvare(int pris, String navn) {
        super(pris, navn);
    }



    @Override
    public double beregnMoms() {
        return super.getPris() * 0.3 < 3 ? 3 : super.getPris()*0.3;
    }
}
