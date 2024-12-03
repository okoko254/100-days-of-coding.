package com.celsiusconverter;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class CelsiusConverter extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Celsius to Fahrenheit Converter");

        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10, 10, 10, 10));
        grid.setVgap(8);
        grid.setHgap(10);

        // Celsius Label and TextField
        Label celsiusLabel = new Label("Celsius:");
        GridPane.setConstraints(celsiusLabel, 0, 0);
        TextField celsiusInput = new TextField();
        GridPane.setConstraints(celsiusInput, 1, 0);

        // Convert Button
        Button convertButton = new Button("Convert");
        GridPane.setConstraints(convertButton, 1, 1);

        // Result Label
        Label resultLabel = new Label();
        GridPane.setConstraints(resultLabel, 1, 2);

        convertButton.setOnAction(e -> {
            try {
                double celsius = Double.parseDouble(celsiusInput.getText());
                double fahrenheit = (celsius * 9/5) + 32;
                resultLabel.setText("Fahrenheit: " + fahrenheit);
            } catch (NumberFormatException ex) {
                resultLabel.setText("Invalid input");
            }
        });

        grid.getChildren().addAll(celsiusLabel, celsiusInput, convertButton, resultLabel);

        Scene scene = new Scene(grid, 300, 200);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
