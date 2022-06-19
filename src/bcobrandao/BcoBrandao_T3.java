/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bcobrandao;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Cassia
 */
public class BcoBrandao_T3 extends Application {
    
    private static Stage stage;
    
    public static void main(String[] args) {
        launch(args);
    }    
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/scenerbuilder/FXMLDocument_T3.fxml"));
        Scene scene = new Scene(root);
        stage.setTitle("BcoBrandao_T3");
        stage.setScene(scene);
        stage.show();
        setStage(stage);
    }
    
    public static Stage getStage(){
        return stage;
    }
    
    public static void setStage(Stage stage){
        BcoBrandao_T3.stage = stage;
    }
    
}

