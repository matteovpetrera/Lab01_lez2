package it.polito.tdp.Lab01;

import java.net.URL;
import java.util.Collections;
import java.util.List;
import java.util.ResourceBundle;

import it.polito.tdp.Lab01.model.Parole;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class FXMLController {
	
	Parole elenco ;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnInserisci;

    @FXML
    private Button btnReset;

    @FXML
    private TextField txtParola;

    @FXML
    private TextArea txtResult;

    @FXML
    void doInsert(ActionEvent event) {
    	String output = null;
    	String parola = this.txtParola.getText();
    	elenco.addParola(parola);
    	List<String> listaParole = elenco.getElenco();
    	Collections.sort(listaParole);
    	output = daListaAString(listaParole);
    	this.txtResult.setText(output);
    }

    @FXML
    void doReset(ActionEvent event) {
    	
    	elenco.reset();
    	this.txtResult.setText("");
    	
    }
    
    public String daListaAString(List<String> listaParole) {
    	String output = null;
    	for(String p: listaParole) {
    		if(output==null) {
    			output = p;
    		}
    		else if (output!=null){
    			output = output+"\n"+p;
    		}
    	}
    	return output;
    }
    
    @FXML
    void initialize() {
        assert btnInserisci != null : "fx:id=\"btnInserisci\" was not injected: check your FXML file 'Scene.fxml'.";
        assert btnReset != null : "fx:id=\"btnReset\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtParola != null : "fx:id=\"txtParola\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtResult != null : "fx:id=\"txtResult\" was not injected: check your FXML file 'Scene.fxml'.";
        
        elenco = new Parole() ;
    }

}
