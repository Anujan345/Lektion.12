package src.Opgave2;

public class App {
    public static void main(String[] args) {
        Counter c = Counter.getcounter();
        c.count();
        System.out.println(c.getCounter());
        c.counterdouble();
        System.out.println(c.getCounter());
        c.resetcounter();
        System.out.println(c.getCounter());
    }
}
