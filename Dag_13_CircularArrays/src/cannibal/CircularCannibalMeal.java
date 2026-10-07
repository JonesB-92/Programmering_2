package cannibal;

public class CircularCannibalMeal {
    private Person[] pplToBeEaten;
    int head;
    int tail;
    int currentSize;

    public CircularCannibalMeal(int size) {
        this.pplToBeEaten = new Person[size];
        head = 0;
        tail = 0;
        currentSize = 0;
    }

    // Adds person to the cannibal dance meal
    void addPerson(Person p) {
        if (head == 0) {
            pplToBeEaten[head] = p;
        } else {

        }

        currentSize++;
    }


    // Removes and returns random person from the cannibal dance
    Person eatRandomPerson() {
    return null;

    }

    // Removes person "count" places from the last eaten
    Person eatNextPerson(int count) {
        return null;
    }

    // Prints all persons waiting to be served
    void printPersons() {
        for (Person p : pplToBeEaten) {
            System.out.println(p);
        }
    }

//    public class Person {
//        String navn;
//
//        public Person(String navn) {
//            this.navn = navn;
//        }
//
//        @Override
//        public String toString() {
//            return navn;
//        }
//    }
}
