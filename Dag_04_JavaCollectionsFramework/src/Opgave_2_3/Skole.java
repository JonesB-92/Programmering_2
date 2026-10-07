package Opgave_2_3;

import java.util.*;

public class Skole {
    private String navn;

    //Link enkeltrettet
    //Opgave 2.3
    //Kopier klasserne over i en ny pakke i projektet og lav de ændringer der skal til, når
    //associeringen mellem Skole og Studerende i stedet realiseres som en Map idet studieNr
    //anvendes som nøgle i mappen. Anvend den konkrete type HashMap.
    private Map<Integer, Studerende> studerendeMap;

    public Skole(String navn, HashMap<Integer, Studerende> studerendeList) {
        this.navn = navn;
        this.studerendeMap = studerendeList;
    }

    public String getNavn() {
        return navn;
    }

    public Map<Integer, Studerende> getStuderendeMap() {
        return new HashMap<>(studerendeMap);
    }

    //evt.
//    public Collection<Studerende> getStuderendelist() {
//        return new ArrayList<>(studerendeList.values());
//    }

    public void addStuderende(Studerende studerende) {
        studerendeMap.put(studerende.getStudierNr(), studerende);
    }


    public void removeStuderende(Studerende studerende) {
        studerendeMap.remove(studerende.getStudierNr());
    }

    //Metoden gennemsnit skal beregne det samlede gennemsnit af alle karakter, for de
    //studerende på skolen.
    public double beregnGennemsnitMap() {
        double sumAfKarakterer = 0;
        int antalKarakterer = 0;

        for (int studienr : studerendeMap.keySet()) {
            for (Integer karakter : studerendeMap.get(studienr).getKarakterer()) {
                sumAfKarakterer += karakter;
                antalKarakterer++;
            }
        }
        if (antalKarakterer == 0) {
            return Double.NaN;
        } else {
            return sumAfKarakterer / antalKarakterer;
        }
    }

    public double beregnGennemsnit() {
        double sumAfKarakterer = 0;
        int antalKarakterer = 0;

        for (Studerende stud : studerendeMap.values()) {
            for (Integer karakter : stud.getKarakterer()) {
                sumAfKarakterer += karakter;
                antalKarakterer++;
            }
        }
        if (antalKarakterer == 0) {
            return 0;
        } else {
            return sumAfKarakterer / antalKarakterer;
        }
    }


    //• Metoden findStuderende skal returnerer en studerende med det angivne studieNr,
    //hvis en sådan studerende ikke findes, skal der returneres null
    public Studerende findStuderende(int studieNr) {
        return studerendeMap.get(studieNr);
    }

    @Override
    public String toString() {
        return navn;
    }

}

