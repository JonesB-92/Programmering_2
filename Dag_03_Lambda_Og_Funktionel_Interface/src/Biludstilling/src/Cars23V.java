package Biludstilling.src;

import javafx.animation.*;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.scene.text.Text;
import javafx.util.Duration;
import java.util.ArrayList;

public class Cars23V {

    private Pane drawPane;
    private ArrayList<Student> students;

    public Cars23V(Pane drawPane) {
        this.drawPane = drawPane;
        students = new ArrayList<>();
        students.add(new Student("Emil", this::drawCarEmil));
        students.add(new Student("Mark", this::drawCarMark));
        students.add(new Student("Marlene", this::drawCarMarlene));
        students.add(new Student("Mikkel A", this::drawCarMikkelA));
        students.add(new Student("Minik", this::drawCarMinik));
        students.add(new Student("Steffen", this::drawCarSteffen));
    }

    public ArrayList<Student> getStudents() { return students; }

    public void drawCarEmil(Car car) {

        drawPane.getChildren().clear();

        int xAks = 50; //Variabel til at rykke det hele lidt l�ngere til h�jre eller venstre p� x-aksen.
        int yAks = 0; //Variabel til at rykke det hele lidt l�ngere op eller ned p� y-aksen.
        int xAksL = 100;

        //Alt inden i if "Stor" statement vil bestemme, hvordan en stor bil bliver tegnet.

        if (car.getSize() == "Big") {

            //BilDel 1-4 tegner selve karosseriet p� bilen

            Rectangle udstoedning = new Rectangle(-45 + xAksL, 190 + yAks, 100, 6);
            drawPane.getChildren().add(udstoedning);
            udstoedning.setFill(Color.BLACK);

            Rectangle BilDel1 = new Rectangle(100 + xAks, 100 + yAks, 200, 100);
            drawPane.getChildren().add(BilDel1);
            BilDel1.setFill(car.getColor());

            Rectangle BilDel2 = new Rectangle(20 + xAks, 150 + yAks, 360, 50);
            drawPane.getChildren().add(BilDel2);
            BilDel2.setFill(car.getColor());

            Polygon BilDel3 = new Polygon(50 + xAks, 150 + yAks, 100 + xAks, 100 + yAks, 100 + xAks, 150 + yAks);
            drawPane.getChildren().add(BilDel3);
            BilDel3.setFill(car.getColor());
            BilDel3.setStroke(car.getColor());

            Polygon BilDel4 = new Polygon(350 + xAks, 150 + yAks, 300 + xAks, 100 + yAks, 300 + xAks, 150 + yAks);
            drawPane.getChildren().add(BilDel4);
            BilDel4.setFill(car.getColor());
            BilDel4.setStroke(car.getColor());

            //BilVindue 1-2 tegner bilens forrude og bagrude.
            Polygon BilVindue1 = new Polygon(55 + xAks, 150 + yAks, 95 + xAks, 110 + yAks, 95 + xAks, 150 + yAks);
            drawPane.getChildren().add(BilVindue1);
            BilVindue1.setFill(Color.BLACK);

            Polygon BilVindue2 = new Polygon(345 + xAks, 150 + yAks, 305 + xAks, 110 + yAks, 305 + xAks, 150 + yAks);
            drawPane.getChildren().add(BilVindue2);
            BilVindue2.setFill(Color.BLACK);

            //Denne kodedel tegner fartstriber p� bilen, hvis der bliver valgt true.

            if (car.getStripes() == true) {
                Rectangle fartStriber = new Rectangle(20 + xAks, 155 + yAks, 360, 6);
                drawPane.getChildren().add(fartStriber);
                fartStriber.setFill(Color.BLACK);
                Rectangle fartStriber2 = new Rectangle(20 + xAks, 163 + yAks, 360, 6);
                drawPane.getChildren().add(fartStriber2);
                fartStriber2.setFill(Color.BLACK);
                Rectangle fartStriber3 = new Rectangle(20 + xAks, 171 + yAks, 360, 6);
                drawPane.getChildren().add(fartStriber3);
                fartStriber3.setFill(Color.BLACK);

            }

            //Denne kodedel bestemmer antal af d�re der bliver tegnet p� bilen og afstand imellem.

            int x2 = 155; //d�r kordinater (x,y)
            int y2 = 150;
            int b1 = 40; //Bredde og h�jde p� d�re
            int h1 = 40;

            if (car.getDoors() == 2) {
                for (int i = 0; i < car.getDoors(); i++) {
                    Rectangle doors = new Rectangle(x2, y2, b1, h1);
                    drawPane.getChildren().add(doors);
                    doors.setFill(car.getColor());
                    doors.setStroke(Color.BLACK);
                    Line doorHandle1 = new Line(x2 + 5, y2 + 5, x2 + 20, y2 + 5);
                    drawPane.getChildren().add(doorHandle1);
                    doorHandle1.setStroke(Color.BLACK);
                    Line doorHandle2 = new Line(x2 + 20, y2 + 5, x2 + 20, y2 + 8);
                    drawPane.getChildren().add(doorHandle2);
                    doorHandle2.setStroke(Color.BLACK);
                    x2 = x2 + 150;
                }
            } else {
                for (int i = 0; i < car.getDoors(); i++) {
                    Rectangle doors = new Rectangle(x2, y2, b1, h1);
                    drawPane.getChildren().add(doors);
                    doors.setFill(car.getColor());
                    doors.setStroke(Color.BLACK);
                    Line doorHandle1 = new Line(x2 + 5, y2 + 5, x2 + 20, y2 + 5);
                    drawPane.getChildren().add(doorHandle1);
                    doorHandle1.setStroke(Color.BLACK);
                    Line doorHandle2 = new Line(x2 + 20, y2 + 5, x2 + 20, y2 + 8);
                    drawPane.getChildren().add(doorHandle2);
                    doorHandle2.setStroke(Color.BLACK);
                    x2 = x2 + 50;
                }
            }


            //Denne kodedel bestemmer antallet af hjul der bliver tegnet og afstand imelllem.

            int x = 140; //Hjulets kordinater (x,y)
            int y = 200;
            int r = 25; //Hjulets st�rrelse
            int rC = 15; //Hjulets st�rrelse

            if (car.getWheels() == 2) {
                for (int i = 0; i < car.getWheels(); i++) {
                    Circle hjul = new Circle(x, y, r);
                    drawPane.getChildren().add(hjul);
                    hjul.setFill(Color.BLACK);
                    Circle hjul1 = new Circle(x, y, rC);
                    drawPane.getChildren().add(hjul1);
                    hjul1.setFill(Color.WHITE);
                    x = x + 220;
                }
            } else {

                for (int i = 0; i < car.getWheels(); i++) {
                    Circle hjul = new Circle(x, y, r);
                    drawPane.getChildren().add(hjul);
                    hjul.setFill(Color.BLACK);
                    Circle hjul1 = new Circle(x, y, rC);
                    drawPane.getChildren().add(hjul1);
                    hjul1.setFill(Color.WHITE);
                    x = x + 75;
                }
            }

            //Denne kodedel bestemmer antallet af vinduer der bliver tegnet og afstand imellem.

            int x1 = 155; //vindue kordinater (x,y)
            int y1 = 110;
            int br = 40; //Bredde og h�jde p� vindue
            int h = 40;

            if (car.getWindows() == 2) {
                for (int i = 0; i < car.getWindows(); i++) {
                    Rectangle vindue = new Rectangle(x1, y1, br, h);
                    drawPane.getChildren().add(vindue);
                    vindue.setFill(Color.BLACK);
                    x1 = x1 + 150;
                }
            } else {
                for (int i = 0; i < car.getWindows(); i++) {
                    Rectangle vindue = new Rectangle(x1, y1, br, h);
                    drawPane.getChildren().add(vindue);
                    vindue.setFill(Color.BLACK);
                    x1 = x1 + 50;
                }
            }

            //Fronten af bilen

            Rectangle frontHjul1 = new Rectangle(90 + xAks, 370 + yAks, 25, 50);
            drawPane.getChildren().add(frontHjul1);
            frontHjul1.setFill(Color.BLACK);

            Rectangle frontHjul2 = new Rectangle(290 + xAks, 370 + yAks, 25, 50);
            drawPane.getChildren().add(frontHjul2);
            frontHjul2.setFill(Color.BLACK);

            Rectangle frontDel1 = new Rectangle(100 + xAks, 300 + yAks, 200, 100);
            drawPane.getChildren().add(frontDel1);
            frontDel1.setFill(car.getColor());

            Rectangle frontDel2 = new Rectangle(110 + xAks, 310 + yAks, 180, 40);
            drawPane.getChildren().add(frontDel2);
            frontDel2.setFill(Color.BLACK);

            if (car.getStripes() == true) {
                Rectangle fartStriber = new Rectangle(100 + xAks, 355 + yAks, 200, 6);
                drawPane.getChildren().add(fartStriber);
                fartStriber.setFill(Color.BLACK);
                Rectangle fartStriber2 = new Rectangle(100 + xAks, 363 + yAks, 200, 6);
                drawPane.getChildren().add(fartStriber2);
                fartStriber2.setFill(Color.BLACK);
                Rectangle fartStriber3 = new Rectangle(100 + xAks, 371 + yAks, 200, 6);
                drawPane.getChildren().add(fartStriber3);
                fartStriber3.setFill(Color.BLACK);

            }

            Rectangle frontlys1 = new Rectangle(105 + xAks, 370 + yAks, 25, 25);
            drawPane.getChildren().add(frontlys1);
            frontlys1.setFill(Color.YELLOW);
            frontlys1.setStroke(Color.BLACK);

            Rectangle frontlys2 = new Rectangle(270 + xAks, 370 + yAks, 25, 25);
            drawPane.getChildren().add(frontlys2);
            frontlys2.setFill(Color.YELLOW);
            frontlys2.setStroke(Color.BLACK);

            //Denne kodedel tegner m�rket p� bilen udfra, hvilket String navn der bliver angivet.

            int mX = -2; //Mulighed for at r�kke p� hele m�rkes x og y koordinater.
            int mY = -10;

            if (car.getBrand() == "Volkswagen") {
                Circle volksC = new Circle(255 + mX, 387 + mY, 15);
                drawPane.getChildren().add(volksC);
                volksC.setFill(Color.BLUE);
                volksC.setStroke(Color.WHITE);
                Line ToyotaM1 = new Line(240 + mX, 380 + mY, 250 + mX, 400 + mY);
                drawPane.getChildren().add(ToyotaM1);
                ToyotaM1.setStroke(Color.WHITE);
                Line ToyotaM2 = new Line(250 + mX, 380 + mY, 260 + mX, 400 + mY);
                drawPane.getChildren().add(ToyotaM2);
                ToyotaM2.setStroke(Color.WHITE);
                Line ToyotaM3 = new Line(260 + mX, 380 + mY, 250 + mX, 400 + mY);
                drawPane.getChildren().add(ToyotaM3);
                ToyotaM3.setStroke(Color.WHITE);
                Line ToyotaM4 = new Line(270 + mX, 380 + mY, 260 + mX, 400 + mY);
                drawPane.getChildren().add(ToyotaM4);
                ToyotaM4.setStroke(Color.WHITE);


            } else if (car.getBrand() == "Mercedes") {
                Circle volksC = new Circle(255 + mX, 387 + mY, 15);
                drawPane.getChildren().add(volksC);
                volksC.setFill(Color.WHITE);
                volksC.setStroke(Color.BLACK);
                Line ToyotaM1 = new Line(255 + mX, 385 + mY, 245 + mX, 400 + mY);
                drawPane.getChildren().add(ToyotaM1);
                ToyotaM1.setStroke(Color.BLACK);
                Line ToyotaM2 = new Line(255 + mX, 385 + mY, 265 + mX, 400 + mY);
                drawPane.getChildren().add(ToyotaM2);
                ToyotaM2.setStroke(Color.BLACK);
                Line ToyotaM3 = new Line(255 + mX, 385 + mY, 255 + mX, 370 + mY);
                drawPane.getChildren().add(ToyotaM3);
                ToyotaM3.setStroke(Color.BLACK);
            }
        }

        //Alt i else if "Lille" bil bestemmer hvordan en lille bil bliver tegnet.

        else if (car.getSize() == "Lille") {

            Rectangle udstoedning = new Rectangle(5 + xAksL, 190 + yAks, 100, 6);
            drawPane.getChildren().add(udstoedning);
            udstoedning.setFill(Color.BLACK);

            Rectangle BilDel1 = new Rectangle(100 + xAksL, 100 + yAks, 100, 100);
            drawPane.getChildren().add(BilDel1);
            BilDel1.setFill(car.getColor());

            Rectangle BilDel2 = new Rectangle(20 + xAksL, 150 + yAks, 260, 50);
            drawPane.getChildren().add(BilDel2);
            BilDel2.setFill(car.getColor());

            Polygon BilDel3 = new Polygon(50 + xAksL, 150 + yAks, 100 + xAksL, 100 + yAks, 100 + xAksL, 150 + yAks);
            drawPane.getChildren().add(BilDel3);
            BilDel3.setFill(car.getColor());
            BilDel3.setStroke(car.getColor());

            Polygon BilDel4 = new Polygon(250 + xAksL, 150 + yAks, 200 + xAksL, 100 + yAks, 200 + xAksL, 150 + yAks);
            drawPane.getChildren().add(BilDel4);
            BilDel4.setFill(car.getColor());
            BilDel4.setStroke(car.getColor());

            Polygon BilVindue1 = new Polygon(55 + xAksL, 150 + yAks, 95 + xAksL, 110 + yAks, 95 + xAksL, 150 + yAks);
            drawPane.getChildren().add(BilVindue1);
            BilVindue1.setFill(Color.BLACK);

            Polygon BilVindue2 = new Polygon(245 + xAksL, 150 + yAks, 205 + xAksL, 110 + yAks, 205 + xAksL, 150 + yAks);
            drawPane.getChildren().add(BilVindue2);
            BilVindue2.setFill(Color.BLACK);


            if (car.getStripes() == true) {
                Rectangle fartStriber = new Rectangle(70 + xAks, 155 + yAks, 260, 6);
                drawPane.getChildren().add(fartStriber);
                fartStriber.setFill(Color.BLACK);
                Rectangle fartStriber2 = new Rectangle(70 + xAks, 163 + yAks, 260, 6);
                drawPane.getChildren().add(fartStriber2);
                fartStriber2.setFill(Color.BLACK);
                Rectangle fartStriber3 = new Rectangle(70 + xAks, 171 + yAks, 260, 6);
                drawPane.getChildren().add(fartStriber3);
                fartStriber3.setFill(Color.BLACK);
            }

            //Denne kodedel bestemmer antal af d�re der bliver tegnet p� bilen og afstand imellem

            int x2 = 155; //d�r kordinater (x,y)
            int y2 = 150;
            int b1 = 40; //Bredde og h�jde p� d�re
            int h1 = 40;

            for (int i = 0; i < car.getDoors(); i++) {
                Rectangle doors = new Rectangle(x2, y2, b1, h1);
                drawPane.getChildren().add(doors);
                doors.setFill(car.getColor());
                doors.setStroke(Color.BLACK);
                Line doorHandle1 = new Line(x2 + 5, y2 + 5, x2 + 20, y2 + 5);
                drawPane.getChildren().add(doorHandle1);
                doorHandle1.setStroke(Color.BLACK);
                Line doorHandle2 = new Line(x2 + 20, y2 + 5, x2 + 20, y2 + 8);
                drawPane.getChildren().add(doorHandle2);
                doorHandle2.setStroke(Color.BLACK);
                x2 = x2 + 50;
            }

            //Denne kodedel bestemmer antallet af hjul der bliver tegnet og afstand imellem

            int x = 180; //Hjulets kordinater (x,y)
            int y = 200;
            int r = 20; //Hjulets st�rrelse
            int rC = 10; //Hjulets st�rrelse

            if (car.getWheels() == 2) {
                for (int i = 0; i < car.getWheels(); i++) {
                    Circle hjul = new Circle(x, y, r);
                    drawPane.getChildren().add(hjul);
                    hjul.setFill(Color.BLACK);
                    Circle hjul1 = new Circle(x, y, rC);
                    drawPane.getChildren().add(hjul1);
                    hjul1.setFill(Color.WHITE);
                    x = x + 140;
                }
            } else if (car.getWheels() > 2) {
                for (int i = 0; i < car.getWheels(); i++) {
                    Circle hjul = new Circle(x, y, r);
                    drawPane.getChildren().add(hjul);
                    hjul.setFill(Color.BLACK);
                    Circle hjul1 = new Circle(x, y, rC);
                    drawPane.getChildren().add(hjul1);
                    hjul1.setFill(Color.WHITE);
                    x = x + 48;
                }
            }

            //Denne kodedel bestemmer antallet af vinduer der bliver tegnet og afstand imellem.

            int x1 = 205; //vindue kordinater (x,y)
            int y1 = 110;
            int br = 40; //Bredde og h�jde p� st�rre vinduer
            int h = 40;
            int brS = 17; //Bredde og h�jde p� sm� vinduer
            int hS = 40;

            if (car.getWindows() > 2) {
                for (int i = 0; i < car.getWindows(); i++) {
                    Rectangle vindue = new Rectangle(x1, y1, brS, hS);
                    drawPane.getChildren().add(vindue);
                    vindue.setFill(Color.BLACK);
                    x1 = x1 + 25;
                }
            } else {
                for (int i = 0; i < car.getWindows(); i++) {
                    Rectangle vindue = new Rectangle(x1, y1, br, h);
                    drawPane.getChildren().add(vindue);
                    vindue.setFill(Color.BLACK);
                    x1 = x1 + 50;
                }
            }

            //Fronten af bilen

            Rectangle frontHjul1 = new Rectangle(90 + xAks, 370 + yAks, 25, 40);
            drawPane.getChildren().add(frontHjul1);
            frontHjul1.setFill(Color.BLACK);

            Rectangle frontHjul2 = new Rectangle(255 + xAks, 370 + yAks, 25, 40);
            drawPane.getChildren().add(frontHjul2);
            frontHjul2.setFill(Color.BLACK);

            Rectangle frontDel1 = new Rectangle(100 + xAks, 300 + yAks, 170, 100);
            drawPane.getChildren().add(frontDel1);
            frontDel1.setFill(car.getColor());

            Rectangle frontDel2 = new Rectangle(110 + xAks, 310 + yAks, 150, 40);
            drawPane.getChildren().add(frontDel2);
            frontDel2.setFill(Color.BLACK);

            if (car.getStripes() == true) {
                Rectangle fartStriber = new Rectangle(100 + xAks, 355 + yAks, 170, 6);
                drawPane.getChildren().add(fartStriber);
                fartStriber.setFill(Color.BLACK);
                Rectangle fartStriber2 = new Rectangle(100 + xAks, 363 + yAks, 170, 6);
                drawPane.getChildren().add(fartStriber2);
                fartStriber2.setFill(Color.BLACK);
                Rectangle fartStriber3 = new Rectangle(100 + xAks, 371 + yAks, 170, 6);
                drawPane.getChildren().add(fartStriber3);
                fartStriber3.setFill(Color.BLACK);

            }
            Rectangle frontlys1 = new Rectangle(105 + xAks, 370 + yAks, 25, 25);
            drawPane.getChildren().add(frontlys1);
            frontlys1.setFill(Color.YELLOW);
            frontlys1.setStroke(Color.BLACK);

            Rectangle frontlys2 = new Rectangle(240 + xAks, 370 + yAks, 25, 25);
            drawPane.getChildren().add(frontlys2);
            frontlys2.setFill(Color.YELLOW);
            frontlys2.setStroke(Color.BLACK);

            //Denne kodedel tegner m�rket udfra den angivet String navn.

            int mX = -17; //Mulighed for at r�kke p� hele m�rkes x og y koordinater.
            int mY = -10;

            if (car.getBrand() == "Volkswagen") {
                Circle volksC = new Circle(255 + mX, 387 + mY, 15);
                drawPane.getChildren().add(volksC);
                volksC.setFill(Color.BLUE);
                volksC.setStroke(Color.WHITE);
                Line ToyotaM1 = new Line(240 + mX, 380 + mY, 250 + mX, 400 + mY);
                drawPane.getChildren().add(ToyotaM1);
                ToyotaM1.setStroke(Color.WHITE);
                Line ToyotaM2 = new Line(250 + mX, 380 + mY, 260 + mX, 400 + mY);
                drawPane.getChildren().add(ToyotaM2);
                ToyotaM2.setStroke(Color.WHITE);
                Line ToyotaM3 = new Line(260 + mX, 380 + mY, 250 + mX, 400 + mY);
                drawPane.getChildren().add(ToyotaM3);
                ToyotaM3.setStroke(Color.WHITE);
                Line ToyotaM4 = new Line(270 + mX, 380 + mY, 260 + mX, 400 + mY);
                drawPane.getChildren().add(ToyotaM4);
                ToyotaM4.setStroke(Color.WHITE);
            } else if (car.getBrand() == "Mercedes") {
                Circle volksC = new Circle(255 + mX, 387 + mY, 15);
                drawPane.getChildren().add(volksC);
                volksC.setFill(Color.WHITE);
                volksC.setStroke(Color.BLACK);
                Line ToyotaM1 = new Line(255 + mX, 385 + mY, 245 + mX, 400 + mY);
                drawPane.getChildren().add(ToyotaM1);
                ToyotaM1.setStroke(Color.BLACK);
                Line ToyotaM2 = new Line(255 + mX, 385 + mY, 265 + mX, 400 + mY);
                drawPane.getChildren().add(ToyotaM2);
                ToyotaM2.setStroke(Color.BLACK);
                Line ToyotaM3 = new Line(255 + mX, 385 + mY, 255 + mX, 370 + mY);
                drawPane.getChildren().add(ToyotaM3);
                ToyotaM3.setStroke(Color.BLACK);
            }
        }
    }

    public void drawCarMark(Car car) {

        drawPane.getChildren().clear();

        int antalHjul = car.getWheels();

        for (int j = 0; j < antalHjul; j++) {
            Circle circle = new Circle(70 * j + 65, 240, 30);
            drawPane.getChildren().add(circle);
            circle.setFill(Color.BLACK);
            circle.setStroke(Color.BLACK);
        }

        Polygon p1 = new Polygon(20, 140, 100, 80, 320, 140);
        drawPane.getChildren().add(p1);
        p1.setFill(car.getColor());

        Rectangle r1 = new Rectangle(20, 140, 300, 100);
        drawPane.getChildren().add(r1);
        r1.setFill(car.getColor());

        int doer = 60;

        int antalDoere = car.getDoors();

        for (int i = 0; i < antalDoere; i++) {
            Rectangle r2 = new Rectangle(60 * i + 60, 150, 40, 70);
            drawPane.getChildren().add(r2);
            r2.setFill(Color.SLATEGRAY);
            r2.setStroke(Color.BLACK);
        }

        Text logo = new Text(22, 200, "T");
        drawPane.getChildren().add(logo);
    }

    public void drawCarMarlene(Car car) {

        drawPane.getChildren().clear();

        //farvevariabler
        Color darkgrey = Color.DARKGREY;
        Color black = Color.BLACK;
        Color window = Color.ALICEBLUE;
        Color dimgray = Color.DIMGRAY;
        Color lightSlateGray = Color.LIGHTSLATEGRAY;
        Color lightGoldenrodYellow = Color.LIGHTGOLDENRODYELLOW;
        Color sandyBrown = Color.SANDYBROWN;
        Color red = Color.RED;
        Color yellow = Color.YELLOW;
        Color orange = Color.ORANGE;
        Color darkBlue = Color.DARKBLUE;
        Color blue = Color.BLUE;
        Color lightBlue = Color.LIGHTBLUE;
        Color midnightBlue = Color.MIDNIGHTBLUE;
        Color aliceBlue = Color.ALICEBLUE;

        int paneWidth = (int) drawPane.getWidth();


        Rectangle sky = new Rectangle(0, 0, 500, 280);
        Rectangle ground = new Rectangle(0, 280, 500, 40);

        ground.setFill(dimgray);


        Arc arcFront = new Arc(150, 250, 100, 100, 0, 180);
        arcFront.setFill(car.getColor());
        arcFront.setType(ArcType.ROUND);

        Arc arcBack = new Arc(340, 250, 110, 100, 0, 180);
        arcBack.setFill(car.getColor());
        arcBack.setType(ArcType.ROUND);

        Arc arcTop = new Arc(250, 170, 100, 70, 0, 360);
        arcTop.setFill(car.getColor());
        arcTop.setType(ArcType.ROUND);

        Arc arcTrunck = new Arc();
        arcTrunck.setCenterX(340);
        arcTrunck.setCenterY(250);
        arcTrunck.setRadiusX(100);
        arcTrunck.setRadiusY(90);
        arcTrunck.setStartAngle(10);
        arcTrunck.setLength(60);
        arcTrunck.setType(ArcType.OPEN);
        arcTrunck.setStroke(car.getColor());
        arcTrunck.setStrokeWidth(5);
        arcTrunck.setFill(null);


        Circle lightFront = new Circle(60, 230, 10);
        lightFront.setStroke(lightSlateGray);

        Circle lightBack = new Circle(440, 230, 10);
        lightBack.setStroke(lightSlateGray);

        Circle sun = new Circle();
        sun.setRadius(30);

        // En path til sun
        Path path = new Path();
        path.getElements().add(new MoveTo(50, 50));
        path.getElements().add(new QuadCurveTo(180, 0, 530, 80));


        drawPane.getChildren().addAll(sky, ground, sun, arcFront, arcTop, arcBack, lightFront, arcTrunck, lightBack);

        // Opret en Timeline for lys
        Timeline carLight = new Timeline(new KeyFrame(Duration.ZERO, new KeyValue(lightFront.fillProperty(), lightGoldenrodYellow)), new KeyFrame(Duration.ZERO, new KeyValue(lightBack.fillProperty(), red)), new KeyFrame(Duration.seconds(1), new KeyValue(lightFront.fillProperty(), sandyBrown)), new KeyFrame(Duration.seconds(1), new KeyValue(lightBack.fillProperty(), black)), new KeyFrame(Duration.seconds(2), new KeyValue(lightFront.fillProperty(), lightGoldenrodYellow)), new KeyFrame(Duration.seconds(2), new KeyValue(lightBack.fillProperty(), red))

        );

        Timeline skyLight = new Timeline(new KeyFrame(Duration.ZERO, new KeyValue(sun.fillProperty(), red)), new KeyFrame(Duration.ZERO, new KeyValue(sky.fillProperty(), midnightBlue)), new KeyFrame(Duration.seconds(1), new KeyValue(sun.fillProperty(), orange)), new KeyFrame(Duration.seconds(1), new KeyValue(sky.fillProperty(), lightBlue)), new KeyFrame(Duration.seconds(2), new KeyValue(sun.fillProperty(), yellow)), new KeyFrame(Duration.seconds(3.5), new KeyValue(sky.fillProperty(), lightBlue)), new KeyFrame(Duration.seconds(5), new KeyValue(sun.fillProperty(), orange)), new KeyFrame(Duration.seconds(5), new KeyValue(sky.fillProperty(), blue)), new KeyFrame(Duration.seconds(7), new KeyValue(sun.fillProperty(), red)), new KeyFrame(Duration.seconds(7), new KeyValue(sky.fillProperty(), midnightBlue)));

        carLight.setCycleCount(100);
        skyLight.setCycleCount(1);

        //aninmation af bagklap
        RotateTransition rotate = new RotateTransition(Duration.seconds(7), arcTrunck);
        rotate.setByAngle(-40);
        rotate.setCycleCount(1);

        TranslateTransition translateTransition = new TranslateTransition(Duration.seconds(7), arcTrunck);
        translateTransition.setByY(-40);
        translateTransition.setByX(-20);
        translateTransition.setCycleCount(1);

        //suns path ani
        PathTransition pathTransition = new PathTransition(Duration.seconds(7), path, sun);
        pathTransition.setCycleCount(1);


        // Start animationen
        carLight.play();
        rotate.play();
        translateTransition.play();
        pathTransition.play();
        skyLight.play();

        for (int i = 0; i < car.getDoors(); i++) {
            Rectangle door = new Rectangle(110 + i * 70, 162, 60, 76);
            Rectangle doorWindow = new Rectangle(115 + i * 70, 165, 50, 40);


            door.setFill(car.getColor());
            door.setStroke(black);


            doorWindow.setFill(window);
            doorWindow.setStroke(car.getColor());
            drawPane.getChildren().addAll(door, doorWindow);
        }

        //hjul
        for (int i = 0; i < car.getWheels(); i++) {
            Circle hjul = new Circle(110 + i * 90, 270, 25);
            drawPane.getChildren().add(hjul);
            hjul.setFill(darkgrey);
            hjul.setStroke(black);
            hjul.setStrokeWidth(10);

        }
    }

    public void drawCarMikkelA(Car car) {

        drawPane.getChildren().clear();

        int numberOfWheels = car.getWheels();
        int numberOfDoors = car.getDoors();

        Rectangle rectangle = new Rectangle(50, 100, 225, 75);
        Polygon polygon = new Polygon(50, 100, 50, 50, 100, 100);
        Circle c1 = new Circle(80, 175, 25);
        Circle c2 = new Circle(250, 175, 25);
        Circle c3 = new Circle(140, 175, 25);
        Circle c4 = new Circle(190, 175, 25);
        Rectangle d1 = new Rectangle(70, 110, 20, 65);
        Rectangle d2 = new Rectangle(130, 110, 20, 65);
        Rectangle d3 = new Rectangle(200, 110, 20, 65);
        Rectangle d4 = new Rectangle(250, 110, 20, 65);
        Rectangle u = new Rectangle(40, 150, 50, 15);
        drawPane.getChildren().add(u);
        u.setFill(Color.GREY);

        for (int i = 1; i <= numberOfWheels; i++) {
            if (i == 1) {
                drawPane.getChildren().add(c1);
            } else if (i == 2) {
                drawPane.getChildren().add(c2);
            } else if (i == 3) {
                drawPane.getChildren().add(c3);
            } else if (i == 4) {
                drawPane.getChildren().add(c4);
            }
        }

        drawPane.getChildren().add(polygon);
        drawPane.getChildren().add(rectangle);
        rectangle.setFill(car.getColor());

        d1.setFill(Color.ROYALBLUE);
        d2.setFill(Color.ROYALBLUE);
        d3.setFill(Color.ROYALBLUE);
        d4.setFill(Color.ROYALBLUE);

        for (int i = 1; i <= numberOfDoors; i++) {
            if (i == 1) {
                drawPane.getChildren().add(d1);
            } else if (i == 2) {
                drawPane.getChildren().add(d2);
            } else if (i == 3) {
                drawPane.getChildren().add(d3);
            } else if (i == 4) {
                drawPane.getChildren().add(d4);
            }
        }
    }

    public void drawCarMinik(Car car) {

        drawPane.getChildren().clear();

        int firstWheelX = 100;
        int firstWheelY = 200;
        int wheels = car.getWheels();
        int[] numbWheel = new int[wheels];

        int firstDoorX = 110;
        int firstDoorY = 130;
        int doors = car.getDoors();
        int[] numbDoor = new int[doors];

        Rectangle body = new Rectangle(70, 150, 150, 50);
        drawPane.getChildren().add(body);
        body.setFill(car.getColor());

        Rectangle body2 = new Rectangle(100, 120, 80, 30);
        drawPane.getChildren().add(body2);
        body2.setFill(car.getColor());

        for (int i = 0; i < numbDoor.length; i++) {
            Rectangle door = new Rectangle(firstDoorX, firstDoorY, 15, 30);
            drawPane.getChildren().add(door);
            door.setFill(Color.DEEPPINK);
            door.setStroke(Color.BLACK);
            firstDoorX += 15;
        }
        for (int i = 0; i < numbWheel.length; i++) {
            Circle wheel = new Circle(firstWheelX, firstWheelY, 15);
            drawPane.getChildren().add(wheel);
            wheel.setFill(Color.DEEPPINK);
            wheel.setStroke(Color.BLACK);
            firstWheelX += 30;
        }
    }

    public void drawCarSteffen(Car car) {

        drawPane.getChildren().clear();

        int numberOfWheels = car.getWheels();
        int wheelSize = 20;
        int wheelX = 90;
        double[] carSize = {50, 285, 60, 255, 95, 240, 195, 240, 275, 255, 285, 285};
        Color wheelColor = Color.GREY;

        Line window = new Line(195, 240, 155, 220);
        Circle man = new Circle(145, 240, 10);

        window.setStroke(Color.CORNFLOWERBLUE);
        man.setFill(Color.TAN);
        Polygon car1 = new Polygon(carSize);
        car1.setFill(car.getColor());
        drawPane.getChildren().add(man);
        drawPane.getChildren().add(car1);

        drawPane.getChildren().add(window);
        for (int i = 0; i < numberOfWheels; i++) {
            Circle wheel1 = new Circle(wheelX, 285, wheelSize);
            wheel1.setStroke(Color.BLACK);
            wheel1.setFill(wheelColor);
            wheelX = wheelX + 50;
            drawPane.getChildren().add(wheel1);

        }
    }
}
