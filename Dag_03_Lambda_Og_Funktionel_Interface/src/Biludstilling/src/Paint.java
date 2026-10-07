package Biludstilling.src;

import javafx.scene.paint.Color;

public class Paint {

    private String name;
    private Color color;

    public Paint(String name, Color color) {
        this.name = name;
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    @Override
    public String toString() {
        return name;
    }
}