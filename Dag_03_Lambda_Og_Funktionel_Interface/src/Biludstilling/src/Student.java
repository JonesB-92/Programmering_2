package Biludstilling.src;

public class Student {
    private String name;
    private Pencil pencil;

    public Student(String name, Pencil pencil) {
        this.name = name;
        this.pencil = pencil;
    }

    public void drawCar(Car car) {
        pencil.drawCar(car);
    }

    @Override
    public String toString() {
        return name;
    }
}