package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class VotacaoController {
	
	@FXML
	private Button voltarButton;
	
	@FXML
	private Button sairButton;
	
	@FXML
	private Button votarButton;
	
	@FXML
	private Button finalizarVotacaoButton;
	
	@FXML
	private TextField tituloTextField;
	
	@FXML
	private TextField numeroCandidatoTextField;
	
	public void sairButtonOnAction(ActionEvent event){
        Stage stage = (Stage) sairButton.getScene().getWindow();
        stage.close();
    }
	
	public void voltarButtonOnAction(ActionEvent event){
		Main.changeScreen("menu");
    }
	
	public void finalizarVotacaoButtonOnAction(ActionEvent event) {
		Main.changeScreen("final");
	}
	
}
