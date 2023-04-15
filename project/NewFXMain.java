package project;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
import View.ViewManager;
import javafx.application.Application;
import javafx.stage.Stage;


/**
 *
 * @author TAIBA
 */
public class NewFXMain extends Application {

    @Override
    public void start(Stage primaryStage) {
       ViewManager.openLoginPage();
       
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
