/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import bcobrandao.BcoBrandao_T1;
import bcobrandao.BcoBrandao_T2;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Cassia
 */
public class FXMLDocumentController_T1 implements Initializable {

Integer agencia, conta;
String senha;
    
    @FXML private Label label1;
    @FXML private Button button11;
    @FXML private TextField cxagencia;
    @FXML private TextField cxconta;
    @FXML private TextField cxsenha;
    private Scene scene;

    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void acessar(ActionEvent event) throws IOException {
        agencia=Integer.valueOf(cxagencia.getText());
        conta=Integer.valueOf(cxconta.getText());
        senha=String.valueOf(cxsenha.getText());
        if(agencia.equals(1234) && conta.equals(567890)){
            BcoBrandao_T2 tela2 = new BcoBrandao_T2();
            fecha();
            try {
                tela2.start(new Stage());
            } catch (Exception ex) {
                Logger.getLogger(FXMLDocumentController_T2.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            
        }else{
            Alert alert = new Alert(AlertType.ERROR);
            alert.setHeaderText("ERRO");
            alert.setTitle("ACESSO NEGADO");
            alert.setContentText("AGENCIA E/OU CONTA INVALIDO");
            alert.show();
        }
        
        
    }
    public void fecha(){
        BcoBrandao_T1.getStage().close();
    }


}
