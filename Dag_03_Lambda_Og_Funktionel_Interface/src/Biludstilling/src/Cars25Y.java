package Biludstilling.src;

import javafx.scene.Group;
import javafx.scene.layout.Pane;
import java.util.ArrayList;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.scene.text.Text;

public class Cars25Y {

    private Pane drawPane;
    private ArrayList<Student> students;

    public Cars25Y(Pane drawPane) {
        this.drawPane = drawPane;
        students = new ArrayList<>();
        students.add(new Student("Arthur", this::drawCarArthur));
        students.add(new Student("Jim", this::drawCarJim));
        students.add(new Student("Jonas", this::drawCarJonas));
        students.add(new Student("Lasse", this::drawCarLasse));
        students.add(new Student("Mads", this::drawCarMads));
        students.add(new Student("Mikkel", this::drawCarMikkel));
        students.add(new Student("Ole", this::drawCarOle));
        students.add(new Student("Sebastian", this::drawCarSebastian));
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void drawCarArthur(Car car) {

        drawPane.getChildren().clear();

        int centerX = 200;
        int centerY = 200;

        for (int i = 0; i < car.getWheels(); i++) {

            Circle circle = new Circle(centerX, centerY, 20);
            circle.setStroke(Color.BLACK);
            drawPane.getChildren().add(circle);
            centerX += 70;
        }


        Rectangle rektangel = new Rectangle(170, 100, 200, 100);
        rektangel.setFill(car.getColor());
        drawPane.getChildren().add(rektangel);

        int doorX = 190;
        for (int i = 0; i < car.getDoors(); i++) {
            Rectangle rektangel1 = new Rectangle(doorX, 105, 40, 40);
            rektangel1.setFill(Color.AQUAMARINE);
            drawPane.getChildren().add(rektangel1);
            Rectangle rektangel2 = new Rectangle(doorX, 150, 40, 48);
            rektangel2.setFill(Color.PINK);
            drawPane.getChildren().add(rektangel2);
            doorX += 70;
        }

        Polygon polygon = new Polygon(190, 150, 40, 40, 40, 40);
        polygon.setFill(Color.WHITESMOKE);
        drawPane.getChildren().add(polygon);
    }

    public void drawCarJim(Car car) {

        drawPane.getChildren().clear();

        int basewidth = 50;
        int bodyHeight = 100;

        int centerX = 125;
        int centerY = 200;

        int vehicleWidth = basewidth + car.getWheels() * 50;

        Rectangle rectangle = new Rectangle(vehicleWidth, bodyHeight);
        rectangle.setX(78);
        rectangle.setY((drawPane.getPrefHeight() - bodyHeight) / 2);
        rectangle.setFill(car.getColor());
        rectangle.setStroke(Color.BLACK);
        drawPane.getChildren().add(rectangle);

        int centerD = 100;

        for (int i = 0; i < car.getDoors(); i++) {
            Rectangle rectangle1 = new Rectangle(centerD, 155, 40, 70);
            rectangle1.setFill(Color.AQUA);
            rectangle1.setStroke(Color.BLACK);
            drawPane.getChildren().add(rectangle1);
            centerD += 50;

        }

        for (int i = 0; i < car.getWheels(); i++) {
            Circle circle = new Circle(centerX + i * 50, centerY + 50, 22);
            circle.setFill(Color.BLUE);
            circle.setStroke(Color.BLACK);
            drawPane.getChildren().add(circle);
        }
    }

    public void drawCarJonas(Car car) {

        drawPane.getChildren().clear();

        int centerX = 125;

        int vehicleLength = 100;

        Rectangle rectangle = new Rectangle(50, 150, vehicleLength * car.getWheels() + 50, 50);
        rectangle.setFill(car.getColor());
        rectangle.setStroke(Color.BLACK);
        drawPane.getChildren().add(rectangle);

        double x = 75, y = 100;

        for (int i = 0; i < car.getDoors(); i++) {
            Rectangle door = new Rectangle(x, y, 100, 100);
            door.setFill(car.getColor());
            door.setStroke(Color.BLACK);
            drawPane.getChildren().add(door);
            Rectangle window = new Rectangle(x + 20, y + 20, 60, 40);
            window.setFill(car.getWindowColor());
            window.setStroke(Color.BLACK);
            drawPane.getChildren().add(window);
            x += 100;
        }

        for (int i = 0; i < car.getWheels(); i++) {
            Circle circle = new Circle(centerX, 200, 30);
            circle.setStroke(Color.BLACK);
            circle.setFill(Color.DARKGRAY);
            drawPane.getChildren().add(circle);
            Circle innerCircle = new Circle(centerX, 200, 25);
            innerCircle.setFill(Color.LIGHTGREY);
            innerCircle.setStroke(Color.BLACK);
            drawPane.getChildren().add(innerCircle);
            centerX += 100;
        }
    }

    public void drawCarLasse(Car car) {

        drawPane.getChildren().clear();
        drawWheelsLasse(car);
        drawBodyLasse(car);
    }

    public void drawBodyLasse(Car car) {

        int bodyStartX = 25;
        int bodyLength = 50;
        int bodyStartY = 75;
        int bodyHeightY = 25;

        for (int i = 0; i < car.getWheels() / 2; i++) {

            Polygon carSeats = new Polygon(bodyStartX + 12.5, 75, bodyStartX + 20, 75, bodyStartX + 17, 65, bodyStartX + 12.5, 65);
            carSeats.setFill(Color.SADDLEBROWN);

            Polygon carFront = new Polygon(bodyStartX + bodyLength, bodyStartY, bodyStartX + bodyLength + 30, bodyHeightY + bodyStartY, bodyStartX + bodyLength, bodyHeightY + bodyStartY);
            carFront.setFill(car.getColor());
            carFront.setStroke(car.getColor());

            Rectangle body = new Rectangle(bodyStartX, bodyStartY, bodyLength, bodyHeightY);
            body.setStroke(car.getColor());
            body.setFill(car.getColor());


            drawPane.getChildren().addAll(body, carSeats, carFront);
            bodyStartX += bodyLength;
        }

        Polygon carSpoilerHolder = new Polygon(25.0, 75.0, 30.0, 75.0, 20.0, 60.0, 17, 60);
        carSpoilerHolder.setFill(car.getColor());
        carSpoilerHolder.setStroke(car.getColor());

        Ellipse carSpoilerTop = new Ellipse(18, 60, 6, 2);
        carSpoilerTop.setFill(car.getColor());
        carSpoilerTop.setStroke(car.getColor());


        drawPane.getChildren().addAll(carSpoilerHolder, carSpoilerTop);
    }

    public void drawWheelsLasse(Car car) {

        int circleRadius = 10;
        int circleWidth = 5;
        int circleY = 100;
        int circleX = 50;

        for (int i = 0; i < car.getWheels() / 2; i++) {
            Circle innercircle = new Circle(circleX, circleY, circleRadius);
            Circle outerCircle = new Circle(circleX, circleY, circleRadius + circleWidth);
            outerCircle.setStroke(Color.BLACK);
            outerCircle.setFill(Color.BLACK);
            innercircle.setStroke(Color.GOLD);
            innercircle.setFill(Color.GOLD);
            drawPane.getChildren().addAll(outerCircle, innercircle);
            circleX += 50;
        }
    }

    public void drawCarMads(Car car) {

        drawPane.getChildren().clear();

        int xvalue = 100;

        Rectangle bilramme = new Rectangle(65, 40, 150, 25);
        bilramme.setFill(car.getColor());
        drawPane.getChildren().add(bilramme);

        Rectangle tag = new Rectangle(105, 20, 50, 20);
        tag.setFill(car.getColor());
        drawPane.getChildren().add(tag);


        for (int i = 0; i < car.getWheels(); i++) {

            Circle circle = new Circle(xvalue, 70, 15);
            drawPane.getChildren().add(circle);
            circle.setFill(Color.BLUE);
            xvalue += 80;

        }
    }

    public void drawCarMikkel(Car car) {

        drawPane.getChildren().clear();

        double centerX = 117.5;
        double centerD = 97.5;

        double carWidth = car.getWheels() * 130;
        double dørHeight = 50;
        double dørWidth = 0;
        if (car.getWheels() == 4) {
            dørWidth = 40;
        } else if (car.getWheels() == 3) {
            dørWidth = 30;
        } else if (car.getWheels() == 2) {
            dørWidth = 20;
        }

        double dørcenterD = 100;

        double carRoof = carWidth - 55;

        Rectangle rektangel1 = new Rectangle(5, 230, carWidth, 50);
        rektangel1.setFill(car.getColor());
        drawPane.getChildren().add(rektangel1);

        Rectangle rektangel2 = new Rectangle(60, 200, carRoof, 50);
        rektangel2.setFill(car.getColor());
        drawPane.getChildren().add(rektangel2);

        for (int d = 0; d < car.getDoors(); d++) {
            Rectangle dør = new Rectangle(centerD, 215, dørWidth, dørHeight);
            dør.setFill(Color.RED);
            dør.setStroke(Color.BLACK);
            drawPane.getChildren().add(dør);
            if (car.getWheels() == 4) {
                centerD += 100;
            }
            if (car.getWheels() == 3) {
                centerD += 80;
            }
            if (car.getWheels() == 2) {
                centerD += 40;
            }

        }
        for (int i = 0; i < car.getWheels(); i++) {
            Circle hjul = new Circle(centerX, 300, 30);
            hjul.setFill(Color.ORANGE);
            hjul.setStroke(Color.BLACK);
            drawPane.getChildren().add(hjul);
            centerX += 100;
        }
    }

    public void drawCarOle(Car car) {

        drawPane.getChildren().clear();

        int centerX = 210;

        Line line = new Line(150, 250, 75, 260);
        drawPane.getChildren().add(line);

        Polygon Kran = new Polygon();
        Kran.setFill(car.getColor());
        Kran.getPoints().addAll(new Double[]{
                250.0, 335.0,
                260.0, 325.0,
                155.0, 245.0,
                145.0, 255.0,
        });
        Group root = new Group(Kran);
        drawPane.getChildren().add(Kran);

        Circle bilFrontTop = new Circle(454, 339, 14);
        bilFrontTop.setFill(Color.SADDLEBROWN);
        bilFrontTop.setStroke(Color.BLACK);
        // bilFrontTop.setArcHeight(5);

        drawPane.getChildren().add(bilFrontTop);

        Rectangle bilBund = new Rectangle(150, 325, 310, 75);
        bilBund.setFill(car.getColor());
        bilBund.setStroke(Color.BLACK);
        drawPane.getChildren().add(bilBund);

        Rectangle bilTop = new Rectangle(275, 235, 100, 75);
        bilTop.setFill(car.getColor());
        bilTop.setStroke(Color.BLACK);
        drawPane.getChildren().add(bilTop);

        Rectangle bilMellem = new Rectangle(273, 310, 110, 15);
        bilMellem.setFill(car.getColor());
        bilMellem.setStroke(Color.BLACK);
        drawPane.getChildren().add(bilMellem);

        Rectangle bilFrontBund = new Rectangle(450, 390, 15, 15);
        bilFrontBund.setFill(car.getColor());
        bilFrontBund.setStroke(Color.BLACK);
        drawPane.getChildren().add(bilFrontBund);

        Rectangle snot = new Rectangle(400, 318, 40, 7);
        snot.setFill(car.getColor());
        snot.setStroke(Color.BLACK);
        drawPane.getChildren().add(snot);


        Rectangle vindue = new Rectangle(285, 245, 75, 65);
        vindue.setFill(Color.CORNFLOWERBLUE);
        vindue.setStroke(Color.BLACK);
        drawPane.getChildren().add(vindue);

        Rectangle dør = new Rectangle(285, 325, 75, 65);
        dør.setFill(Color.LIGHTGREEN);
        dør.setStroke(Color.BLACK);
        drawPane.getChildren().add(dør);

        Polygon øjne = new Polygon(360, 265, 375, 245, 375, 310, 360, 310);
        øjne.setFill(Color.WHITE);
        øjne.setStroke(Color.BLACK);
        drawPane.getChildren().add(øjne);

        Ellipse øjet = new Ellipse(370, 295, 3, 10);
        øjet.setFill(Color.GREEN);
        øjet.setStroke(Color.BLACK);
        øjet.setStrokeWidth(1);
        drawPane.getChildren().add(øjet);

        Text text = new Text(295, 350, "Tow Mater");
        text.setFill(Color.WHITE);
        text.setStroke(Color.WHITE);
        text.setStrokeWidth(2);
        drawPane.getChildren().add(text);

        for (int i = 0; i < car.getWheels() / 2; i++) {

            Circle hjul = new Circle(centerX, 400, 30);
            hjul.setStroke(Color.BLACK);
            hjul.setStrokeWidth(10);
            hjul.setFill(Color.SILVER);
            drawPane.getChildren().add(hjul);
            centerX += 200;
        }
    }

    public void drawCarSebastian(Car car) {

        drawPane.getChildren().clear();

        double x = 50;
        double y = 50;

        double carHeight = 75;
        double edge = 10;
        double wheelRadius = 25;
        double wheelDiameter = wheelRadius * 2;
        double carWidth = car.getWheels() * 0.5 * (wheelDiameter + edge);
        double halfEdge = edge / 2;
        double windowHeight = carHeight - wheelRadius - 2 * edge;
        double windowWidth = carWidth / car.getWindows() - edge;
        double cabinLength = 50;
        double cabinStart = x + carWidth;

        // Places the background wheels
        for (double i = wheelRadius; i < carWidth - wheelRadius; i += wheelDiameter + edge) {
            Circle hjul = new Circle(i + wheelRadius / 2 + x, y + carHeight, wheelRadius);
            hjul.setFill(Color.BLACK);
            hjul.setStroke(Color.DARKGRAY);
            drawPane.getChildren().add(hjul);
        }

        // Draw the main body
        Rectangle body = new Rectangle(carWidth + cabinLength, carHeight);
        body.setFill(car.getColor());
        body.setStroke(Color.BLACK);
        body.setX(x);
        body.setY(y);
        drawPane.getChildren().add(body);

        // Draw the cabin door
        Rectangle doorWindow = new Rectangle(cabinStart + halfEdge, y + halfEdge, cabinLength / 3, windowHeight);
        doorWindow.setFill(Color.LIGHTBLUE);

        Rectangle door = new Rectangle(cabinStart + halfEdge, y + halfEdge, cabinLength / 3, carHeight - edge);
        door.setStroke(Color.BLACK);
        door.setFill(null);

        drawPane.getChildren().addAll(doorWindow, door);

        // Draw the cabin window
        Rectangle cabinWindow = new Rectangle(cabinStart + 2 * (cabinLength / 3), y + halfEdge, cabinLength / 3, windowHeight * 1.5);
        cabinWindow.setFill(Color.LIGHTBLUE);

        drawPane.getChildren().add(cabinWindow);

        // Places the foreground wheels.
        for (double i = 0; i < carWidth; i += wheelDiameter + edge) {
            Circle hjul = new Circle(i + wheelRadius / 2 + x, y + carHeight, wheelRadius);
            hjul.setFill(Color.BLACK);
            hjul.setStroke(Color.DARKGRAY);

            drawPane.getChildren().add(hjul);
        }

        // Places the windows
        for (double i = 0; i < carWidth - halfEdge; i += windowWidth + edge) {
            Rectangle bodyWindow = new Rectangle(i + halfEdge + x, y + halfEdge, windowWidth, windowHeight);
            bodyWindow.setFill(Color.LIGHTBLUE);
            bodyWindow.setStroke(Color.BLACK);

            drawPane.getChildren().add(bodyWindow);
        }
    }
}
