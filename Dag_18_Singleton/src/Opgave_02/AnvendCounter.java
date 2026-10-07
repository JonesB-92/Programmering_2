package Opgave_02;

public class AnvendCounter {
    public static void main(String[] args) {
        //Skriv en anden klasse AnvendCounter som anvender Counter.
        Counter cunt_erxD = Counter.getInstance();

        System.out.println(cunt_erxD.getValue()); // 0
        cunt_erxD.count(); // 1
        cunt_erxD.count(); // 2
        cunt_erxD.times2(); // 4

        System.out.println(cunt_erxD.getValue());
        System.out.println("Before: " + cunt_erxD.getValue());
        cunt_erxD.reset();
        System.out.println("After: " + cunt_erxD.getValue());

    }

}
