package src.Opgave3;

public class app {
    public static void main(String[] args) {
        Person p1 = new Person("Anujan");
        Person p2 = new Person("Kris");

        PersonAdminstration A = PersonAdminstration.getPersonAdminstration();

        A.addPerson(p1);
        A.addPerson(p2);
        System.out.println(A.getP());
    }
}
