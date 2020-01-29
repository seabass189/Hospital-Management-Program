package javafxmltestapp;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class JavaFXMLTestApp extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));

        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("Hospital Management System");
        stage.show();
    }

    public static void connect() throws SQLException {
        String url = "jdbc:postgresql://database-1.cakeqdu3h1oe.us-west-1.rds.amazonaws.com:5432/";
        Properties props = new Properties();
        props.setProperty("user", "postgres");
        props.setProperty("password", "password");

        Connection conn = DriverManager.getConnection(url, props);
        String sqlStatement = "SELECT * FROM Public.Patients;";
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(sqlStatement);

        while (rs.next()) {
            System.out.println("1" + rs.getString(1));
            System.out.println(rs.getString(2));
            System.out.println(rs.getString(3));
            System.out.println(rs.getString(4));
            System.out.println(rs.getString(5));
        }
        conn.close();
    }

    /**
     * @param args the command line arguments
     * @throws SQLException
     */
    public static void main(String[] args) throws SQLException {
        launch(args);
    }

}
