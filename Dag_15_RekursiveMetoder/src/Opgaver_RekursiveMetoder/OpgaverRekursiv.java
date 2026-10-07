package Opgaver_RekursiveMetoder;

public class OpgaverRekursiv {
    //Opgave 1
    //Skriv en rekursiv metode public static int factorial(int n) der beregner n!,
    //n>=0.
    //Den rekursive definition er givet ved
    //Termineringsregel: n! = 1, n=0
    //Rekurrensregel: n! = n*(n-1)!, n>0
    public int factorial(int n) {
        int result;
        if (n <= 0) {
            result = 1;
        } else {
            result = n * factorial(n - 1);
        }
        return result;
    }

    //Opgave 2
    //Skriv en rekursiv metode public static int power(int n, int p) der beregner
    //n^p, p>=0.
    //Den rekursive definition er givet ved
    //Termineringsregel: n^p = 1, p=0
    //Rekurrensregel: n^p = n * (n^(p - 1)), p>0
    public static int power(int n, int p) {
        int result;
        if (p == 0) {
            result = 1;
        } else {
            result = n * power(n, (p - 1));
        }
        return result;
    }


    // Opgave 2.1 der beregner det samme, men ud fra følgende definition
    // Termineringsregel: n^p = 1, p=0
    // Rekurrensregel:
    // n^p = n^(p - 1) * n, p > 0 og p er ulige
    // n^p = (n^2)^(pdiv2), p>0 og p er lige
    public static int power2(int n, int p) {
        int result;

        if (p == 0) {
            result = 1;
        } else if (p % 2 != 0) {
            result = n * (power2(n, (p - 1)));
        } else {
            // 3^8 = (3^2)^(8/2) = (9)^4
//            result = power2(n * n, p / 2);
            result = power2(power(n, 2), p / 2);
        }
        return result;
    }

    //Opgave 3
    //Skriv en rekursiv metode public static int product(int a, int b) der
    //beregner a*b hvor a og b er to hele tal større end eller lig med nul. Metoden skal anvende
    //definitionen
    //Termineringsregel: a * b = 0, a = 0
    //Rekurrensregel: a * b = (a - 1) * b + b, a>0
    //og må ikke benytte Javas indbyggede gangeoperation ”*”
    public static int product(int a, int b) {
        int result;
        if (a == 0 || b == 0) {
            result = 0;
        } else {
            result = product((a - 1), b) + b;
        }
        return result;
    }

    // Opgave 3.1
    //Antag derefter at din maskine kun kan fordoble og halvere hele tal samt lægge dem
    //sammen. Skriv en rekursiv metode, som beregner a*b og som udnytter følgende definition:
    //Termineringsregel: a * b = 0, a = 0
    //Rekurrensregel: a * b = (a - 1) * b + b, a >= 1 og a er ulige
    // a * b = (a / 2) * (2 * b), a > 1 og a er lige
    //Javas indbyggede gange- og divisionsoperation må kun benyttes til at gange og dividere med 2.
    public static int productRus(int a, int b) {
        int result;

        if (a == 0) {
            result = 0;
        } else if (a > 1 && a % 2 == 0) {
            result = productRus((a / 2), (2 * b));
        } else {
            result = productRus((a - 1), b) + b;
        }
        return result;
    }
    //Sammenlign antal beregninger i product og productRus som funktion af a og/eller b.

    //product(19,3) = O(a)
    //productRus(19,3) = O(log(a))


    //Opgave 4
    //Skriv en rekursiv metode, der returnerer s med karaktererne i omvendt rækkefølge. For eksempel skal kaldet
    //reverse(”RANSLIRPA”) = ”APRILSNAR”
    //Beskriv først den rekursive definition for at vende en String. Programmer dernæst den
    //rekursive metode
    //Termineringsregel: stop ved s.length - 1
    //Rekurrensregel:
    // start med sidste bogstav og smid det forrest i result
    public static String reverse(String s) {
        String result;
        int lastIndex = s.length() - 1;

        if (s.length() <= 1) {
            result = s;
        } else {
            result = s.substring(lastIndex) + reverse(s.substring(0, lastIndex));
        }
        return result;
    }

    //Opgave 5 *
    //Skriv en rekursiv metode der implemeterer Euclids algoritme der finder største fælles divisor af to positive heltal.
    // Den største fælles divisor af to tal er det største heltal, der går op i begge tal. Euclids algoritme
    // 'Største Fælles Divisor' sfd(a,b) er defineret ved:
    //Termineringsregel: b       hvis b<=a og b går op i a
    //Rekurrensregel:
    // sfd(b,a)      hvis a < b
    // Sfd(b, a%b)   ellers
    public static int sfd(int a, int b) {
        int result;
        if (b == 0) {
            result = a;
        } else if (a >= b && a % b == 0) {
            result = b;
        } else if (a < b) {
            result = sfd(b, a);
        } else { //if(a > b)
            result = sfd(b, a % b);
        }
        return result;
    }

    //Opgave 6 * (Lidt drilsk)
    //En dominobrik har målene 2*1. En n-strimmel er et bræt af længde n og bredde 2. Find en
    //formel, der udtrykker antal måder, hvorpå en n-strimmel kan dækkes af dominobrikker.
    //Anvend rekursion og udtryk formlen som funktion af n.
    // Fibonacci
    public static int domino(int n) {
        int result;
        if(n <= 2) {
            result = Math.max(n,0);
        }
        else {
            result = domino(n-1) + domino(n-2);
        }
        return result;
    }
}
