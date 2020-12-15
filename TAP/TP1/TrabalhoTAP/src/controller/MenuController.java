package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class MenuController {

	@FXML
	private Button sairButton;
	
	@FXML
	private Button cadastrarCandidatosButton;
	
	@FXML
	private Button cadastrarEleitoresButton;
	
	@FXML
	private Button editarCandidatosButton;
	
	@FXML
	private Button editarEleitoresButton;
	
	@FXML
	private Button iniciarVotacaoButton;
	
	public void sairButtonOnAction(ActionEvent event){
        Stage stage = (Stage) sairButton.getScene().getWindow();
        stage.close();
    }
	
	public void cadastrarEleitoresButtonOnAction(ActionEvent event) {
		Main.changeScreen("cadastrareleitores");
	}
	
	public void cadastrarCandidatosButtonOnAction(ActionEvent event) {
		Main.changeScreen("cadastrarcandidatos");
	}
		
	public void editarCandidatosButtonOnAction(ActionEvent event) {
		Main.changeScreen("editarcandidatos");
	}
	
	public void editarEleitoresButtonOnAction(ActionEvent event) {
		Main.changeScreen("editareleitores");
	}
	
	public void iniciarVotacaoButtonOnAction(ActionEvent event) {
		Main.changeScreen("votacao");
	}
}

