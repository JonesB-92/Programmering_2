package Lambda.ex2student;

import Lambda.ex1student.Ex1;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Ex2 extends Ex1 {

    public static void main(String[] args) {
        List<Runner> runners = new ArrayList<>();
        runners.addAll(List.of(
                new Runner("Ib", 30),
                new Runner("Per", 50),
                new Runner("Ole (ikke ginger Ole fra 25Y)", 27),
                new Runner("Ulla", 40),
                new Runner("Jens", 35),
                new Runner("Hans", 28)));
        System.out.println(runners);
        System.out.println();

        //a) Udskriv en linie for hver løber med name og lapTime ved at bruge List.forEach()
        //metoden med en Consumer lambda.
        System.out.println("a) List.forEach");
        runners.forEach(runner -> System.out.println(runner.getName() + " " + runner.getLapTime()));
        System.out.println();

        //b) Som a), men udskriv kun løberne med lapTime < 30.
        System.out.println("b) Kun løbere med laptime < 30: ");
        findAllRunners(runners, r -> r.getLapTime() < 30).forEach(runner -> System.out.println(runner.getName()));
        //ELLER
        runners.forEach(runner -> {
            if (runner.getLapTime() < 30) {
                System.out.println(runner.getName() + " " + runner.getLapTime());
            }
        });

        //c) Sorter løberne stigende efter lapTime ved at bruge List.sort() metoden med en
        //Comparator lambda. Udskriv løberne.
        System.out.println("\nc) sorter asc efter laptime");
        runners.sort((r1, r2) -> r1.getLapTime() - r2.getLapTime());
//        runners.sort(Comparator.comparingInt(Runner::getLapTime));
        runners.forEach(runner -> System.out.println(runner.getName() + " " + runner.getLapTime()));

    }

    public static List<Runner> findAllRunners(List<Runner> list, Predicate<Runner> filter) {
        List<Runner> runners = new ArrayList<>();

        for (Runner r : list) {
            if (filter.test(r))
                runners.add(r);
        }
        return runners;
    }


}