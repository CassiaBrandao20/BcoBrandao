package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class FXMLDocumentController_T2 {
Double vldisp=1000.00, saque, deposito, saldo;
    
    @FXML private Button button;
    @FXML private Button button3;
    @FXML private TextField cxvl;
    @FXML private Button button1;
    @FXML
    private TextField cxsaldo;
    
    @FXML void sacar(ActionEvent event) {
    saque=Double.valueOf(cxvl.getText());
    vldisp=vldisp-saque;
    cxsaldo.setText(verificaVldisp(vldisp));

    }

    void fcfafa(ActionEvent event) {

    }

    @FXML
    void handleButtonAction(ActionEvent event) {

    }

    void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void start(Stage stage) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @FXML
    private void depositar(ActionEvent event) {
    deposito=Double.valueOf(cxvl.getText());
    vldisp=vldisp+deposito;
    cxsaldo.setText("Saldo: "+vldisp);
    }

    private String verificaVldisp(Double saldo) {
        String verif = null;
        if (vldisp >= 0){
            verif=("Saldo: "+vldisp);
        }else{
            Alert alert = new Alert(AlertType.ERROR);
            alert.setHeaderText("SALDO INSUFICIENTE!");
            alert.setTitle("SALDO NEGATIVO");
            alert.setContentText("VALOR SAQUE MAXIMO PERMITIDO: "+(vldisp+saque));
            alert.show();
        }    
        return verif;
    }
    
    public void saldodisp(){
        this.vldisp = vldisp;
        vldisp=vldisp+deposito-saque;
    }

    private void visusaldo(ActionEvent event) {

    }

    @FXML
    private void visusaldo(MouseEvent event) {
  
    }

}