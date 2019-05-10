/**
 * Sample Skeleton for 'GiocoView.fxml' Controller Class
 */

package it.gov.itisfeltrinelli.gioco.gui;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class GiocoController {

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="btnStart"
    private Button btnStart; // Value injected by FXMLLoader

    @FXML // fx:id="txtTentativi"
    private TextField txtTentativi; // Value injected by FXMLLoader

    @FXML // fx:id="txtNumero"
    private TextField txtNumero; // Value injected by FXMLLoader

    @FXML // fx:id="btnIndovina"
    private Button btnIndovina; // Value injected by FXMLLoader

    @FXML // fx:id="txtStatus"
    private TextField txtStatus; // Value injected by FXMLLoader

    @FXML
    void onIndovina(ActionEvent event) {

    }

    @FXML
    void onStart(ActionEvent event) {
    	
    }

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert btnStart != null : "fx:id=\"btnStart\" was not injected: check your FXML file 'GiocoView.fxml'.";
        assert txtTentativi != null : "fx:id=\"txtTentativi\" was not injected: check your FXML file 'GiocoView.fxml'.";
        assert txtNumero != null : "fx:id=\"txtNumero\" was not injected: check your FXML file 'GiocoView.fxml'.";
        assert btnIndovina != null : "fx:id=\"btnIndovina\" was not injected: check your FXML file 'GiocoView.fxml'.";
        assert txtStatus != null : "fx:id=\"txtStatus\" was not injected: check your FXML file 'GiocoView.fxml'.";

    }
}
