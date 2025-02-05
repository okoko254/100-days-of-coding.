package com.hostelmanagement;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.List;

public class Hostelmanagement extends Application {

    // List to store tenants and their payment details
    private final List<Tenant> tenants = new ArrayList<>();
    private ListView<String> tenantListView; // Declare tenantListView here

    @Override
    public void start(Stage stage) {
        // Initialize tenantListView
        tenantListView = new ListView<>();
        // Labels and Input Fields
        Label headingLabel = new Label("Hostel Application");
        headingLabel.setStyle("-fx-font-size: 24px; -fx-font-weight: bold;");

        Label roomLabel = new Label("Room:");
        TextField roomField = new TextField();

        Label nameLabel = new Label("Name:");
        TextField nameField = new TextField();

        Label monthLabel = new Label("Month:");
        TextField monthField = new TextField();

        Label amountLabel = new Label("Amount:");
        TextField amountField = new TextField();

        // Buttons
        Button addButton = new Button("Add Tenant");
        Button listPaymentsButton = new Button("List Payments");
        Button removeButton = new Button("Remove Tenant");
        Button saveAndQuitButton = new Button("Save and Quit");

        // Text Areas
        TextArea displayArea1 = new TextArea();
        displayArea1.setPrefHeight(100);
        displayArea1.setEditable(false);

        TextArea displayArea2 = new TextArea();
        displayArea2.setPrefHeight(100);
        displayArea2.setEditable(false);

        // Layout
        HBox tenantDetails = new HBox(10, roomLabel, roomField, nameLabel, nameField);
        HBox paymentDetails = new HBox(10, monthLabel, monthField, amountLabel, amountField);
        HBox buttonBar = new HBox(10, addButton, listPaymentsButton, removeButton, saveAndQuitButton);

        VBox root = new VBox(15, headingLabel, tenantDetails, paymentDetails, buttonBar, displayArea1, displayArea2);
        root.setPadding(new Insets(20));
        root.setStyle("-fx-background-color: lightblue;");

        // Event Handlers for Buttons

        // Add Tenant Button
        addButton.setOnAction(e -> {
            try {
                // Get input values
                String roomText = roomField.getText();
                String nameText = nameField.getText();
                String monthText = monthField.getText();
                String amountText = amountField.getText();

                if (roomText.isEmpty() || nameText.isEmpty() || monthText.isEmpty() || amountText.isEmpty()) {
                    displayArea1.setText("All fields must be filled out.");
                    return;
                }
                 // Validate that the name contains only alphabetic characters and spaces
        if (!nameText.matches("[a-zA-Z\\s]+")) {
            displayArea1.setText("Name must contain only alphabetic characters and spaces.");
            return;
        }

                int room = Integer.parseInt(roomText);
                double amount = Double.parseDouble(amountText);
                 // Check if the room is already occupied
        for (Tenant tenant : tenants) {
            if (tenant.getRoom() == room) {
                displayArea1.setText("Room " + room + " is already occupied.");
                return;
            }
        }
              

                // Add tenant to the list
                tenants.add(new Tenant(nameText, room, monthText, amount));
                tenantListView.getItems().add(nameText);

                displayArea1.setText("Tenant " + nameText + " added to Room " + room + " for the month " + monthText
                        + " with amount: " + amount);
                  // Clear input fields after adding tenant
                roomField.clear();
                nameField.clear();
                monthField.clear();
                amountField.clear();
            } catch (NumberFormatException ex) {
                displayArea1.setText("Please enter valid numeric values for room and amount.");
            }
        });

        // List Payments Button
        listPaymentsButton.setOnAction(e -> {
            StringBuilder displayText = new StringBuilder("Room\tName\tMonth\tAmount\n");
            for (Tenant tenant : tenants) {
                displayText.append(tenant.getRoom()).append("\t\t")
                        .append(tenant.getName()).append("\t\t")
                        .append(tenant.getMonth()).append("\t\t")
                        .append(tenant.getAmount()).append("\n");
            }
            displayArea1.setText(displayText.toString());
        });

        // Remove Tenant Button
        removeButton.setOnAction(e -> {
            String roomText = roomField.getText();
            if (roomText.isEmpty()) {
                displayArea1.setText("Room number must be entered.");
                return;
            }

            try {
                int room = Integer.parseInt(roomText);
                Tenant tenantToRemove = null;

                // Find the tenant in the list by room number
                for (Tenant tenant : tenants) {
                    if (tenant.getRoom() == room) {
                        tenantToRemove = tenant;
                        break;
                    }
                }

                if (tenantToRemove != null) {
                    tenants.remove(tenantToRemove);
                    tenantListView.getItems().remove(tenantToRemove.getName());
                    displayArea1.setText("Tenant removed from Room " + room);
                } else {
                    displayArea1.setText("Room " + room + " is empty.");
                }
            } catch (NumberFormatException ex) {
                displayArea1.setText("Please enter a valid room number.");
            }
        });

        // Save and Quit Button (for now it just exits the application)
        saveAndQuitButton.setOnAction(e -> {
            // In a real application, you would save the data to a file or database
            System.exit(0); // Exit the application
        });

        // Scene setup
        Scene scene = new Scene(root, 600, 400);
        stage.setScene(scene);
        stage.setTitle("Hostel Application Form");
        stage.show();
    }

    // Tenant class to store room, name, month, and amount
    static class Tenant {
        private final String name;
        private final int room;
        private final String month;
        private final double amount;

        public Tenant(String name, int room, String month, double amount) {
            this.name = name;
            this.room = room;
            this.month = month;
            this.amount = amount;
        }

        public String getName() {
            return name;
        }

        public int getRoom() {
            return room;
        }

        public String getMonth() {
            return month;
        }

        public double getAmount() {
            return amount;
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}

