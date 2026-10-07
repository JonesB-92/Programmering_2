import cannibal.CircularCannibalMeal;
import cannibal.Person;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircularCannibalMealTest {
    Person p1, p2, p3, p4, p5, p6, p7, p8, p9, p10;
    CircularCannibalMeal mealCircle;

    @BeforeEach
    void setUp() {
        mealCircle = new CircularCannibalMeal(10);

        p1 = new Person("Uwagandi");
        p2 = new Person("Gorak");
        p3 = new Person("Zundra");
        p4 = new Person("Makulu");
        p5 = new Person("Tharnok");
        p6 = new Person("Kragath");
        p7 = new Person("Vandura");
        p8 = new Person("Ogrima");
        p9 = new Person("Tukral");
        p10 = new Person("Nargu");

    }

    @Test
    void addPerson() {
    }

    @Test
    void eatRandomPerson() {
    }

    @Test
    void eatNextPerson() {
    }

    @Test
    void printPersons() {
    }
}