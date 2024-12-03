package com.javafxpresentation;//project package
import javafx.application.Application;//base class which provides the start method
import javafx.scene.Scene;//reperesents visual content of the application 
import javafx.scene.control.*;//defines all buttons
import javafx.scene.layout.VBox;//defines vertical layout on a scene
import javafx.stage.Stage;//represents the window that holds all the comtents of the application


public class JavaFxPresentation extends Application //this class inherits the application class 
{
    @Override
    public void start(Stage primaryStage)//start method overriden from application class
    { 
// ComboBox example
ComboBox<String> comboBox = new ComboBox<>(); 
comboBox.getItems().addAll("Option 1", "Option 2", "Option 3"); 
comboBox.setValue("Option 1");

// displays 5 countries
comboBox.getItems().addAll("Kenya", "Uganda", "Nigeria","South Africa","Tanzania"); 




// CheckBox 
CheckBox checkBox1 = new CheckBox("CheckBox 1");
CheckBox checkBox2 = new CheckBox("CheckBox 2");

ToggleGroup radioGroup = new ToggleGroup(); 
RadioButton radioButton1 = new RadioButton("RadioButton 1"); 
radioButton1.setToggleGroup(radioGroup);
RadioButton radioButton2 = new RadioButton("RadioButton 2"); 
radioButton2.setToggleGroup(radioGroup);

//layout created and all components added on it
VBox Vbox = new VBox(comboBox, checkBox1, checkBox2, radioButton1, radioButton2); 
// scene created and a layout added on it
Scene scene = new Scene(Vbox, 300, 200);

primaryStage.setTitle("JavaFX interface");//title of primary stage is set
primaryStage.setScene(scene); //scene is set on the primary stage
primaryStage.show(); //displays all the contents of the primary stage
    }
    

    public static void main(String[] args) {
        launch(args);//launching calls the start method
    }
}
