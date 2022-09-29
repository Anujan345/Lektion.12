package src.Opgave2;

public class Counter {
    private int counter;
    private static Counter count=null;

    private Counter(){
        this.counter = 0;
    }

    public static Counter getcounter(){
        if(count == null){
            count = new Counter();
        }
        return count;
    }

    public void count(){
        counter++;
    }

    public void counterdouble(){
        counter = counter * 2;
    }

    public void resetcounter(){
        counter = 0;
    }

    public int getCounter() {
        return counter;
    }
}
