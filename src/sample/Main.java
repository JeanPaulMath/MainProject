package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.sql.*;

public class Main extends Application {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        //connecting to H2 database
        Class.forName("org.h2.Driver");
        Connection conn = DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test","sa","");

        //sample select Statement from test table that is provided by H2
        Statement stmt = conn.createStatement();
        ResultSet resultSet = stmt.executeQuery("SELECT  * FROM  TEST");

        While(resultSet.next()); {
            System.out.println(resultSet.getString("NAME"));
        }
        System.out.println("yeet");


        conn.close();


        launch(args);
    }

    private static void While(boolean next) {

    }





    //primary stage method that displays the sample fxml file
    @Override
    public void start(Stage primaryStage) throws Exception {

        Parent root = FXMLLoader.load(getClass().getResource("ProductTracker.fxml"));
        primaryStage.setTitle("Product Tracker");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();

    }


}
