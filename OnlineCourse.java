/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package onlinecourse;

import javafx.application.Application;

import javafx.geometry.Pos;

import javafx.scene.Scene;

import javafx.scene.control.Button;

import javafx.scene.control.Label;

import javafx.scene.control.TextArea;

import javafx.scene.layout.Background;

import javafx.scene.layout.BackgroundFill;

import javafx.scene.layout.GridPane;

import javafx.scene.layout.StackPane;

import javafx.scene.paint.Color;

import javafx.stage.Stage;
 
public class OnlineCourse extends Application {
 
    Stage primaryStage;

    Label errorLabel;
 
    @Override

    public void start(Stage primaryStage) {

        this.primaryStage = primaryStage;
 
        // Creating a welcome label with friendly design

        Label welcomeLabel = new Label("Welcome to our online courses platform!");

        welcomeLabel.setStyle("-fx-font-size: 20pt; -fx-font-weight: bold; -fx-text-fill: #333333;");
 
        // Creating text areas and labels for user input

        TextArea nameInput = new TextArea();

        nameInput.setPrefColumnCount(35); // Increased size

        nameInput.setPrefRowCount(1);

        TextArea emailInput = new TextArea();

        emailInput.setPrefColumnCount(35); // Increased size

        emailInput.setPrefRowCount(1);

        TextArea idInput = new TextArea();

        idInput.setPrefColumnCount(35); // Increased size

        idInput.setPrefRowCount(1);

        Label nameLabel = new Label("Name:");

        nameLabel.setStyle("-fx-font-weight: bold; -fx-font-size: 14pt;"); // Bold and bigger

        Label emailLabel = new Label("Email:");

        emailLabel.setStyle("-fx-font-weight: bold; -fx-font-size: 14pt;"); // Bold and bigger

        Label idLabel = new Label("ID:");

        idLabel.setStyle("-fx-font-weight: bold; -fx-font-size: 14pt;"); // Bold and bigger
 
        // Creating button for submitting user input

        Button submitBtn = new Button();

        submitBtn.setText("Submit");

        submitBtn.setOnAction(e -> {

            if (isValidInput(nameInput.getText(), emailInput.getText(), idInput.getText())) {

                if (isValidID(idInput.getText())) {

                    int id = Integer.parseInt(idInput.getText().trim());

                    if (id > 100) {

                        openCoordinatorWindow();

                    } else {

                        openStudentWindow();

                    }

                } else {

                    showError("Invalid ID! Please enter an integer greater than 100.");

                }

            } else {

                showError("Please fill in all the fields.");

            }

        });
 
        // Creating grid pane and adding components

        GridPane gridPane = new GridPane();

        gridPane.setBackground(new Background(new BackgroundFill(Color.LAVENDER, null, null)));

        gridPane.addRow(0, welcomeLabel);

        gridPane.addRow(1, nameLabel, nameInput);

        gridPane.addRow(2, emailLabel, emailInput);

        gridPane.addRow(3, idLabel, idInput);

        gridPane.add(submitBtn, 1, 4);

        gridPane.setAlignment(Pos.CENTER);

        gridPane.setVgap(10);

        gridPane.setHgap(10);
 
        // Error label initialization

        errorLabel = new Label();

        errorLabel.setTextFill(Color.RED);

        gridPane.addRow(5, errorLabel);
 
        Scene scene = new Scene(gridPane, 600, 350); // Adjusted scene size
 
        primaryStage.setTitle("Online Courses Platform");

        primaryStage.setScene(scene);

        primaryStage.show();

    }
 
    // Method to validate ID input

    private boolean isValidID(String input) {

        try {

            int id = Integer.parseInt(input.trim());

            return id > 1;

        } catch (NumberFormatException e) {

            return false;

        }

    }
 
    // Method to validate user input

    private boolean isValidInput(String name, String email, String id) {

        return !name.trim().isEmpty() && !email.trim().isEmpty() && !id.trim().isEmpty();

    }
 
    // Method to show error message

    private void showError(String message) {

        errorLabel.setText(message);

    }
 
    private void openCoordinatorWindow() {

        Stage coordinatorStage = new Stage();
 
        Button btn1 = new Button();

        btn1.setText("Coordinator Button 1");
 
        Button btn2 = new Button();

        btn2.setText("Coordinator Button 2");
 
        StackPane root = new StackPane();

        root.getChildren().addAll(btn1, btn2);
 
        Scene scene = new Scene(root, 200, 150);
 
        coordinatorStage.setTitle("Coordinator Window");

        coordinatorStage.setScene(scene);

        coordinatorStage.show();

    }
 
    private void openStudentWindow() {

        Stage studentStage = new Stage();
 
        Button registerCoursesBtn = new Button("Register Courses");

        registerCoursesBtn.setOnAction(e -> openRegisterCoursesWindow());
 
        Button showCoursesBtn = new Button("Show Courses");

        showCoursesBtn.setOnAction(e -> openShowCoursesWindow());
 
        Button scheduleBtn = new Button("Schedule");

        scheduleBtn.setOnAction(e -> openScheduleWindow());
 
        Button returnBtn = new Button("Return");

        returnBtn.setOnAction(e -> studentStage.close());
 
        GridPane gridPane = new GridPane();

        gridPane.setBackground(new Background(new BackgroundFill(Color.LIGHTBLUE, null, null)));

        gridPane.addRow(0, new Label("Student Window"));

        gridPane.addRow(1, registerCoursesBtn);

        gridPane.addRow(2, showCoursesBtn);

        gridPane.addRow(3, scheduleBtn);

        gridPane.addRow(4, returnBtn);

        gridPane.setAlignment(Pos.CENTER);

        gridPane.setVgap(10);

        gridPane.setHgap(10);
 
        Scene scene = new Scene(gridPane, 300, 250);
 
        studentStage.setTitle("Student Window");

        studentStage.setScene(scene);

        studentStage.show();

    }
 
    private void openRegisterCoursesWindow() {

        Stage registerCoursesStage = new Stage();
 
        Button registerBtn = new Button("Register");

        Button returnBtn = new Button("Return");

        returnBtn.setOnAction(e -> registerCoursesStage.close());
 
        GridPane gridPane = new GridPane();

        gridPane.setBackground(new Background(new BackgroundFill(Color.LIGHTGREEN, null, null)));

        gridPane.addRow(0, new Label("Register Courses Window"));

        gridPane.addRow(1, registerBtn);

        gridPane.addRow(2, returnBtn);

        gridPane.setAlignment(Pos.CENTER);

        gridPane.setVgap(10);

        gridPane.setHgap(10);
 
        Scene scene = new Scene(gridPane, 300, 150);
 
        registerCoursesStage.setTitle("Register Courses");

        registerCoursesStage.setScene(scene);

        registerCoursesStage.show();

    }
 
    private void openShowCoursesWindow() {

        Stage showCoursesStage = new Stage();
 
        Button returnBtn = new Button("Return");

        returnBtn.setOnAction(e -> showCoursesStage.close());
 
        GridPane gridPane = new GridPane();

        gridPane.setBackground(new Background(new BackgroundFill(Color.LIGHTYELLOW, null, null)));

        gridPane.addRow(0, new Label("Available Courses Window"));

        gridPane.addRow(1, new Label("1. Logic Design"));

        gridPane.addRow(2, new Label("2. Programming"));

        gridPane.addRow(3, new Label("3. Math"));

        gridPane.addRow(4, new Label("4. Computer Organization"));

        gridPane.addRow(5, new Label("5. Embedded Systems"));

        gridPane.addRow(6, new Label("6. Advanced Programming"));

        gridPane.addRow(7, new Label("7. Computer Architecture"));

        gridPane.addRow(8, new Label("8. Real-time Embedded Systems"));

        gridPane.addRow(9, new Label("9. Data Structure"));

        gridPane.addRow(10, returnBtn);

        gridPane.setAlignment(Pos.CENTER);

        gridPane.setVgap(10);

        gridPane.setHgap(10);
 
        Scene scene = new Scene(gridPane, 400, 300);
 
        showCoursesStage.setTitle("Available Courses");

        showCoursesStage.setScene(scene);

        showCoursesStage.show();

    }
 
    private void openScheduleWindow() {

        Stage scheduleStage = new Stage();
 
        Button returnBtn = new Button("Return");

        returnBtn.setOnAction(e -> scheduleStage.close());
 
        GridPane gridPane = new GridPane();

        gridPane.setBackground(new Background(new BackgroundFill(Color.LIGHTCORAL, null, null)));

        gridPane.addRow(0, new Label("Schedule Window"));

        gridPane.addRow(1, new Label("Monday: Math, Computer Organization"));

        gridPane.addRow(2, new Label("Tuesday: Programming, Advanced Programming"));

        gridPane.addRow(3, new Label("Wednesday: Logic Design, Data Structure"));

        gridPane.addRow(4, new Label("Thursday: Embedded Systems, Computer Architecture"));

        gridPane.addRow(5, new Label("Friday: Real-time Embedded Systems"));

        gridPane.addRow(6, returnBtn);

        gridPane.setAlignment(Pos.CENTER);

        gridPane.setVgap(10);

        gridPane.setHgap(10);
 
        Scene scene = new Scene(gridPane, 400, 250);
 
        scheduleStage.setTitle("Schedule");

        scheduleStage.setScene(scene);

        scheduleStage.show();

    }
 
    public static void main(String[] args) {

        launch(args);

    }

}
