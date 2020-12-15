package controller;

import base.Candidato;
import connection.BancoDeDados;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class CadastrarCandidatosController {

	@FXML
	private Button voltarButton;
	
	@FXML
	private Button sairButton;
	
	@FXML
	private TextField candidatoTextField;
	
	@FXML
	private TextField numeroCandidatoTextField;
	
	@FXML
	private Label mensagemVermelhaCadastroLabel;
	
	@FXML
	private Label mensagemVerdeCadastroLabel;
	
	@FXML
	private Button cadastrarCandidatoButton;

	public void sairButtonOnAction(ActionEvent event){
        Stage stage = (Stage) sairButton.getScene().getWindow();
        stage.close();
    }
	
	public void voltarButtonOnAction(ActionEvent event){
		Main.changeScreen("menu");
		limparCampoMensagensLabel();
    }
	
	public void limparCampoMensagensLabel() {
		mensagemVerdeCadastroLabel.setText("");
		mensagemVermelhaCadastroLabel.setText("");
	}
	
	public void cadastrarCandidatoButtonOnAction(ActionEvent event){
		try {
			String candidato = candidatoTextField.getText();
			int numero = Integer.parseInt(numeroCandidatoTextField.getText());
			Candidato cand = new Candidato(candidato, numero);
			BancoDeDados.adicionarCandidato(cand);
			mensagemVermelhaCadastroLabel.setText("");	
			mensagemVerdeCadastroLabel.setText(String.format("Candidato %s, número %d cadastrado.",candidato, numero ));

		}catch (NumberFormatException e){
			mensagemVerdeCadastroLabel.setText("");
			mensagemVermelhaCadastroLabel.setText("Entrada Inválida!");			
		}
    }
}
