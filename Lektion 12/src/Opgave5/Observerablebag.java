package src.Opgave5;

import java.util.*;
import java.util.function.Consumer;

public class Observerablebag implements Bag,Iterable{
    HashMap<String,Integer> hashMap;
    ArrayList<Observer> observers = new ArrayList<>();

    public Observerablebag(){
        hashMap = new HashMap<>();
    }

    @Override
    public void addString(String s) {
        if (hashMap.containsKey(s)){
            hashMap.put(s, hashMap.get(s)+1);
        }else{
            hashMap.put(s, 1);
        }
        notifyObserver(s, hashMap.get(s));
    }

    @Override
    public void removeString(String s) {
        if (hashMap.containsKey(s)){
            hashMap.remove(s);
        }
    }

    @Override
    public int getcount(String s) {
        return hashMap.get(s);
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        if (!observers.contains(o)){
            observers.remove(o);
        }
    }

    @Override
    public void notifyObserver(String s,int antal) {
        for(Observer o : observers){
         o.update(s,antal);
        }
    }


    @Override
    public void forEach(Consumer action) {
        Iterable.super.forEach(action);
    }

    @Override
    public Iterator iterator() {
        return hashMap.keySet().iterator();
    }
}
