package com.bmichecker;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class BMIChecker extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("BMI Calculator");

        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10, 10, 10, 10));
        grid.setVgap(8);
        grid.setHgap(10);

        // Height Label and TextField
        Label heightLabel = new Label("Height (m):");
        GridPane.setConstraints(heightLabel, 0, 0);
        TextField heightInput = new TextField();
        GridPane.setConstraints(heightInput, 1, 0);

        // Weight Label and TextField
        Label weightLabel = new Label("Weight (kg):");
        GridPane.setConstraints(weightLabel, 0, 1);
        TextField weightInput = new TextField();
        GridPane.setConstraints(weightInput, 1, 1);

        // Calculate Button
        Button calculateButton = new Button("Calculate BMI");
        GridPane.setConstraints(calculateButton, 1, 2);

        // Result Label
        Label resultLabel = new Label();
        GridPane.setConstraints(resultLabel, 1, 3);

        calculateButton.setOnAction(e -> {
            try {
                double height = Double.parseDouble(heightInput.getText());
                double weight = Double.parseDouble(weightInput.getText());
                double bmi = weight / (height * height);
                resultLabel.setText("BMI: " + String.format("%.2f", bmi));
            } catch (NumberFormatException ex) {
                resultLabel.setText("Invalid input");
            }
        });

        grid.getChildren().addAll(heightLabel, heightInput, weightLabel, weightInput, calculateButton, resultLabel);

        Scene scene = new Scene(grid, 300, 200);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
