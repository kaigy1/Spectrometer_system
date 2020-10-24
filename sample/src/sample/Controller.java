package sample;

import java.awt.event.*;
import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;


public class Controller {


    public Button start_b;
    public Parent scene1;
    public Parent scene2;
    public Parent scene3;
    public Stage stage;




    public Parent frame2 = FXMLLoader.load(getClass().getResource("Final_graph.fxml"));

    public Controller() throws IOException {
    }


    public void set_scene1(Parent scene1)
    {
        this.scene1=scene1;
    }
    public void set_scene2(Parent scene2)
    {
        this.scene2=scene2;
    }
    public void set_scene3(Parent scene3)
    {
        this.scene3=scene3;
    }

    public void start_f() {
 /// Function that will run the application

        System.out.println("scene1.getLayoutX()");

//        Scene scene = new Scene(scene2,600,600);
//
//        stage.setScene(scene);
//        stage.show();

    }



}

