package com.guiculculator;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class GUICulculator extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Area and Perimeter Calculator");

        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10, 10, 10, 10));
        grid.setVgap(8);
        grid.setHgap(10);

        // Length Label and TextField
        Label lengthLabel = new Label("Length:");
        GridPane.setConstraints(lengthLabel, 0, 0);
        TextField lengthInput = new TextField();
        GridPane.setConstraints(lengthInput, 1, 0);

        // Width Label and TextField
        Label widthLabel = new Label("Width:");
        GridPane.setConstraints(widthLabel, 0, 1);
        TextField widthInput = new TextField();
        GridPane.setConstraints(widthInput, 1, 1);

        // Calculate Area Button
        Button areaButton = new Button("Calculate Area");

        // Calculate Perimeter Button
        Button perimeterButton = new Button("Calculate Perimeter");

        // Calculate Both Button
        Button bothButton = new Button("Calculate ");//calculates both

        // HBox to center the buttons
        HBox buttonBox = new HBox(10);
        buttonBox.setAlignment(Pos.CENTER);
        buttonBox.getChildren().addAll(areaButton, perimeterButton, bothButton);
        GridPane.setConstraints(buttonBox, 1, 2);

        // Result Labels
        Label areaLabel = new Label();
        GridPane.setConstraints(areaLabel, 1, 3);
        Label perimeterLabel = new Label();
        GridPane.setConstraints(perimeterLabel, 1, 4);

        areaButton.setOnAction(e -> {
            try {
                double length = Double.parseDouble(lengthInput.getText());
                double width = Double.parseDouble(widthInput.getText());
                double area = length * width;
                areaLabel.setText("Area: " + area);
            } catch (NumberFormatException ex) {
                areaLabel.setText("Invalid input");
            }
        });

        perimeterButton.setOnAction(e -> {
            try {
                double length = Double.parseDouble(lengthInput.getText());
                double width = Double.parseDouble(widthInput.getText());
                double perimeter = 2 * (length + width);
                perimeterLabel.setText("Perimeter: " + perimeter);
            } catch (NumberFormatException ex) {
                perimeterLabel.setText("Invalid input");
            }
        });

        bothButton.setOnAction(e -> {
            try {
                double length = Double.parseDouble(lengthInput.getText());
                double width = Double.parseDouble(widthInput.getText());
                double area = length * width;
                double perimeter = 2 * (length + width);
                areaLabel.setText("Area: " + area);
                perimeterLabel.setText("Perimeter: " + perimeter);
            } catch (NumberFormatException ex) {
                areaLabel.setText("Invalid input");
                perimeterLabel.setText("");
            }
        });

        grid.getChildren().addAll(lengthLabel, lengthInput, widthLabel, widthInput, buttonBox, areaLabel, perimeterLabel);

        Scene scene = new Scene(grid, 300, 200);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
