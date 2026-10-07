package Lambda.ex1student;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Ex1 {

    public static void main(String[] args) {
        List<Person> persons = List.of(
                new Person("Bent", 25), new Person("Susan", 34),
                new Person("Mikael", 60), new Person("Klaus", 44),
                new Person("Birgitte", 17), new Person("Liselotte", 9));
        for (Person person : persons) {
            System.out.println(person);
        }

        System.out.println();

        //Indsæt kode der anvender metoden findFirst() med et lambda udtryk til at løse a-d.
        //a) Finder den første person i listen af personer med alderen 44
        System.out.println("Findfirst age 44: " + findFirst(persons, person -> person.getAge() == 44));

        //b) Finder den første person i listen af personer med et navn der starter med 'S
        System.out.println("\nFindfirst name starts with 'S': " + findFirst(persons, person -> person.getName().substring(0, 1).equalsIgnoreCase("s")));
        //ELLER
        System.out.println("\nFindfirst name starts with 'S': " + findFirst(persons, person -> person.getName().toLowerCase().startsWith("s")));

        //c) Finder den første person i listen af personer med et navn der indeholder mere end et ’i’
        System.out.println("\nc) Findfirst name contains i == 2: fuldstændig hjemmelavet 🙄" + findFirst(persons, person -> person.getName().toLowerCase().chars().filter(ch -> ch == 'i').count() > 1));
        //ELLER hjemmelavet
        System.out.println("\nc) Findfirst name contains i == 2 ÆGTE hjemmelavet: " + findFirst(persons, person -> {
            String name = person.getName();

            int i = 0;
            int count = 0;
            boolean personFound = false;

            while (!personFound && i < name.length()) {
                if (name.substring(i, i + 1).equalsIgnoreCase("i")) {
                    count++;
                    if (count > 1) {
                        personFound = true;
                    }
                }
                i++;
            }
            return personFound;
        }));

        //ELLER chat
        System.out.println("\nc) Findfirst name contains i == 2 chatten: " + findFirst(persons, person -> {

            String name = person.getName();
            int count = 0;
            //Færre variable/betingelser at holde styr på
            for (int i = 0; i < name.length(); i++) {
                //Bedre med charAt, da substring altid laver et nyt String objekt!!
                char ch = name.charAt(i);
                if (ch == 'i' || ch == 'I') {
                    count++;
                    if (count > 1) {
                        return true; // early exit, no need for extra flag
                    }
                }
            }
            return false;
        }));

        //ELLER chatten igen - boolean flipflop
        System.out.println("\nc) Findfirst name contains i == 2 chatten 2.0: " + findFirst(persons, person -> {

            String name = person.getName().toLowerCase();
            boolean foundOne = false;
            for (int i = 0; i < name.length(); i++) {
                char ch = name.charAt(i);
                if (ch == 'i') {
                    //Første gang vi finder 'i' er foundOne herinde false, men anden gang vi finder 'i'
                    //og går ind i scopet, er den true!!
                    if (foundOne) {
                        return true; // we already saw one before → now it's 2+
                    }// men i 1. iteration herude bliver den sat til true
                    foundOne = true; // mark that we’ve seen the first one
                }
            }
            return false; // never found a second 'i'
        }));

        //d) Finder den første person i listen af personer med en alder der er lig længden af navnet.
        System.out.println("\nd) Findfirst alder == længde af navn: " + findFirst(persons, person -> {
            int nameLength = person.getName().length();
            return nameLength == person.getAge();
        }));

        System.out.println("FindAll ----------------------------------------------------------------");

        System.out.println("\ne) findAll age < 30: " + findAll(persons, p -> p.getAge() < 30));

        //f) Find alle personer der har et navn der indeholder bogstavet 'i'.
        System.out.println("\nf) findAll .contains(i): " + findAll(persons, p -> p.getName().toLowerCase().contains("i")));

        //g) Find alle personer der har et navn der starter med 'S'.
        System.out.println("\ng) findAll .startsWith(s): " + findAll(persons, p -> p.getName().startsWith("S")));

        //h) Find alle personer der har et navn der (sic!?) med længde 5.
        System.out.println("\nh) findAll med .length = 5: " + findAll(persons, p -> p.getName().length() == 5));

        //i) Find alle personer der har et navn med længde på mindst 6 og alder under 40
        System.out.println("\ni) findAll med .length > 5 && alder < 40: " + findAll(persons, p -> p.getName().length() > 5 && p.getAge() < 40));

    }


    /**
     * Returns from the list the first person
     * that satisfies the predicate.
     * Returns null, if no person satisfies the predicate.
     */
    public static Person findFirst(List<Person> list, Predicate<Person> filter) {
        for (Person p : list) {
            if (filter.test(p))
                return p;
        }
        return null;
    }

    //e) Programmer en findAll()metode. Metodens signatur og implementation skal passe
    //til et kald svarende til List<Person> list1 = findAll(persons, p -> p.getAge() < 30);

    /**
     * Returns from the list a List<Person>
     * that satisfies the predicate
     * Returns null, if no person satisfies the predicate.
     */
    public static List<Person> findAll(List<Person> list, Predicate<Person> filter) {
        List<Person> persons = new ArrayList<>();

        for (Person p : list) {
            if (filter.test(p))
                persons.add(p);
        }
        return persons;
    }


    //		Den første person der hedder Klaus
//		System.out.println(findFirst(persons, p -> p.getName().equals("Klaus")));
//		Den første person der har et navn med længden 4
//		System.out.println(findFirst(persons, p -> p.getName().length() ==4 ));

//		Indsæt kode herunder der kalder metoderne findFirst og findAll som beskrevet i opgave 1
}
