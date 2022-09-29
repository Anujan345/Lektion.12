package src.Opgave5;


public class App {
    public static void main(String[] args) {
        Observerablebag o1 = new Observerablebag();
        o1.addString("Rød");
        o1.addString("Rød");
        o1.addString("Rød");
        o1.addString("Rød");
        o1.addString("Rød");

        o1.addString("Blå");
        o1.addString("Blå");
        o1.addString("Blå");
        o1.addString("Blå");
        o1.addString("Blå");

        o1.addString("Sort");
        o1.addString("Sort");
        o1.addString("Sort");
        o1.addString("Sort");
        o1.addString("Sort");

        System.out.println(o1.getcount("Rød"));
        System.out.println(o1.getcount("Blå"));
        System.out.println(o1.getcount("Sort"));

        o1.forEach((key)
                -> System.out.println(key +" Count "+ o1.getcount((String) key)));

    }
}
