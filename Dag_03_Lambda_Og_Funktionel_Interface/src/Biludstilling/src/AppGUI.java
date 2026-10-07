package Biludstilling.src;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import java.util.ArrayList;

public class AppGUI extends Application {

    private GridPane gridPane;
    private Pane drawPane;
    private Scene scene;

    private ComboBox<Student> comboBoxStudents;
    private ComboBox<Paint> comboBoxPaint;
    private ComboBox<Integer> comboBoxDoors;
    private ComboBox<Integer> comboBoxWheels;

    private Cars23V cars23V;
    private Cars25Y cars25Y;
    private ArrayList<Student> students;
    private ArrayList<Paint> paint;

    @Override
    public void start(Stage stage) {

        gridPane = new GridPane();
        drawPane = new Pane();
        scene = new Scene(gridPane);

        initStudents();
        initPaint();
        initControls();

        stage.setTitle("Biludstilling 25Y");
        stage.setScene(scene);
        stage.show();
    }

    private void initStudents() {
        cars23V = new Cars23V(drawPane);
        cars25Y = new Cars25Y(drawPane);
        students = cars25Y.getStudents();
    }

    private void initPaint() {

        paint = new ArrayList<>();
        paint.add(new Paint("Red", Color.RED));
        paint.add(new Paint("Green", Color.GREEN));
        paint.add(new Paint("Blue", Color.CORNFLOWERBLUE));
        paint.add(new Paint("Gray", Color.SLATEGRAY));
    }

    private void initControls() {

        ChangeListener<Object> changeListener = (o, ov, nv) -> changeCar();
        gridPane.setPadding(new Insets(10));
        gridPane.setHgap(10);
        gridPane.setVgap(10);
        drawPane.setPrefHeight(440);

        Label labelStudents = new Label("Choose student:");
        comboBoxStudents = new ComboBox<>();
        comboBoxStudents.getItems().setAll(students);
        comboBoxStudents.getSelectionModel().selectFirst();
        comboBoxStudents.valueProperty().addListener(changeListener);
        comboBoxStudents.setPrefWidth(120);
        gridPane.add(labelStudents, 0, 0);
        gridPane.add(comboBoxStudents, 0, 1);

        Label labelPaint = new Label("Choose color:");
        comboBoxPaint = new ComboBox<>();
        comboBoxPaint.getItems().setAll(paint);
        comboBoxPaint.getSelectionModel().selectFirst();
        comboBoxPaint.valueProperty().addListener(changeListener);
        comboBoxPaint.setPrefWidth(120);
        gridPane.add(labelPaint, 1, 0);
        gridPane.add(comboBoxPaint, 1, 1);

        Label labelDoors = new Label("Number of doors:");
        comboBoxDoors = new ComboBox<>();
        comboBoxDoors.getItems().setAll(1, 2, 3, 4);
        comboBoxDoors.getSelectionModel().selectFirst();
        comboBoxDoors.valueProperty().addListener(changeListener);
        comboBoxDoors.setPrefWidth(120);
        gridPane.add(labelDoors, 2, 0);
        gridPane.add(comboBoxDoors, 2, 1);

        Label labelWheels = new Label("Number of wheels:");
        comboBoxWheels = new ComboBox<>();
        comboBoxWheels.getItems().setAll(1, 2, 3, 4);
        comboBoxWheels.getSelectionModel().selectFirst();
        comboBoxWheels.valueProperty().addListener(changeListener);
        comboBoxWheels.setPrefWidth(120);
        gridPane.add(labelWheels, 3, 0);
        gridPane.add(comboBoxWheels, 3, 1);

        gridPane.add(drawPane, 0, 2, 4, 1);

        changeCar();
    }

    private void changeCar() {

        Student student = comboBoxStudents.valueProperty().getValue();
        Paint paint = comboBoxPaint.valueProperty().getValue();
        int doors = comboBoxDoors.valueProperty().getValue();
        int wheels = comboBoxWheels.valueProperty().getValue();

        Car car = new Car(paint.getColor(), doors, wheels);
        student.drawCar(car);
    }
}