package Opgave2;

public abstract class Figur {
    //Enhver figur skal have et navn (med get/set-metoder), en tegn()-metode (som blot udskriver
    //navnet på figuren) og en getAreal()-metode.
    private String name;

    public Figur(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void tegn(){
        System.out.println(name);
    }

    public abstract double getAreal();

}
