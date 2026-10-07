package Lambda.eksempelklassen;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PersonApp {

	public static void main(String[] args) {

		List<Person> list = List.of(
				new Person("Bent", 25), new Person("Susan", 34),
				new Person("Mikael", 60), new Person("Klaus", 44),
				new Person("Birgitte", 17), new Person("Liselotte", 9));

		List<Person> persons = new ArrayList<Person>(list);
		System.out.println(persons);
		System.out.println();

		System.out.println("Printed with List.forEach():");
		persons.forEach(p -> System.out.println(p.getName()));
		System.out.println();

		persons.forEach(p -> p.incAge());
		System.out.println(persons);
		System.out.println();

		persons.forEach(p -> {
			p.incAge();
			p.setName(p.getName() + " "+ "Jensen");
		});
		System.out.println(persons);
		System.out.println();

		System.out.println("Sorted with List.sort() on age:");
		persons.sort((p1, p2) -> p1.getAge() - p2.getAge());
		System.out.println(persons);
		System.out.println();

		System.out.println("After use of List.removeIf():");
		persons.removeIf(p -> p.getAge() < 18 || p.getAge() > 60);
		System.out.println(persons);
		System.out.println();


	}


}
