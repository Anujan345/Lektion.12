package Opgave3;

import java.util.*;

public class PersonAdminstration {
    private static PersonAdminstration personAdminstration;
    private Set<Person> p;

    private PersonAdminstration() {
        p = new HashSet<>();
    }

    public static PersonAdminstration getPersonAdminstration(){
        if (personAdminstration == null){
            personAdminstration = new PersonAdminstration();
        }
        return personAdminstration;
    }

    public void addPerson(Person person){
        p.add(person);
    }

    public HashSet<Person> getP() {
        return new HashSet<>(p);
    }

    public void removePerson(Person person){
        if (p.contains(person)) {
            p.remove(person);
        }
    }
}
