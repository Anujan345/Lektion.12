package src.Opgave4;

public class App {
    public static void main(String[] args) {
        Elvare el1 = new Elvare(3,"El");
        System.out.println(el1.beregnMoms());
        Elvare el2 = new Elvare(12,"El");
        System.out.println(el2.beregnMoms());

        Spiritus s1 = new Spiritus(10,"Øl");
        AdapterImplements a1s1 = new AdapterImplements(s1);
        System.out.println(a1s1.beregnMoms());

        Adapterextends a2s1 = new Adapterextends(s1);
        System.out.println(a2s1.beregnMoms());
    }
}
