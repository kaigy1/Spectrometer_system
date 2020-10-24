package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import static javafx.fxml.FXMLLoader.*;

public class Main extends Application {

    public Button start_b;

    public static Stage stage;
    public static Parent frame1;
    public static Parent frame2;
    public static Parent frame3;
    public Button back3;

    public static Scene scene1;
    public static Scene scene2;
    public static Scene scene3;





    @Override
    public void start(Stage primary_stage) throws Exception{
        stage=primary_stage;
        System.out.println(stage);


        FXMLLoader loader = new FXMLLoader(getClass().getResource("start_page.fxml"));
         frame1 = load(getClass().getResource("start_page.fxml"));
         frame2 = load(getClass().getResource("counter.fxml"));
         frame3 = load(getClass().getResource("Final_graph.fxml"));

         //set scenes
        scene1= new Scene(frame1, 640, 400);
        scene2=new Scene(frame2, 922, 303);
        scene3=new Scene(frame3, 913, 495);

        Controller controller= new Controller();

        loader.setController(controller);

        primary_stage.setScene(scene1);
        primary_stage.show();

    }



    public void start_f() throws InterruptedException {
        /// Function that will run the application
        System.out.println("Stage:");
        System.out.println(stage);
        stage.setScene(scene2);
        TimeUnit.SECONDS.sleep(2);
        transition_scene_3();

    }

    public void transition_scene_3()
    {
        System.out.println(stage);
        stage.setScene(scene3);

    }

public void back_to_start()
{
    System.out.println("Stage_return:");
    System.out.println(stage);
    stage.setScene(scene1);
}

    public static void main(String[] args) {
        launch(args);
    }
}


