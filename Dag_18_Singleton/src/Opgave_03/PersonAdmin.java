package Opgave_03;

import java.util.HashSet;
import java.util.Set;

public class PersonAdmin {
    private Set<Person> personSet;
    //Singleton
    private static PersonAdmin instance;

    private PersonAdmin() {
        personSet = new HashSet<>();
    }

    public void addPerson(Person person) {
        personSet.add(person);
    }

    public Set<Person> getPersoner() {
        return new HashSet<>(personSet);
    }

    public void remove(Person person) {
        if (personSet.remove(person)) { // contains instead?
            System.out.println("Personen " + person.getName() + " er blevet fjernet fra listen.");
        } else System.out.println("Personen " + person.getName() + " blev ikke fjernet");
    }

    // Static metode for at få fat i singleton instance
    public static PersonAdmin getInstance() {
        if (instance == null) {
            instance = new PersonAdmin();
        }
        return instance;
    }
}
