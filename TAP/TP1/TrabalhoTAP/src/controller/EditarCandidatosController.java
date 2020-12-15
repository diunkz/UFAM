package controller;

import connection.BancoDeDados;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class EditarCandidatosController {

	@FXML
	private Button voltarButton;
	
	@FXML
	private Button sairButton;
	
	@FXML
	private TextArea mostrarCandidatosTextArea;
	
	@FXML
	private ImageView refreshImage;
	@FXML
	private TextField idCandidatoTextField;
	
	@FXML
	private TextField nomeCandidatoTextField;
	
	@FXML
	private TextField numeroCandidatoTextField;
	
	@FXML
	private Button editarCandidatoButton;
	
	@FXML
	private Label mensagemVermelhaCadastroLabel;
	
	@FXML
	private Label mensagemVerdeCadastroLabel;
	
	public void sairButtonOnAction(ActionEvent event){
        Stage stage = (Stage) sairButton.getScene().getWindow();
        stage.close();
    }
	
	public void voltarButtonOnAction(ActionEvent event){
		Main.changeScreen("menu");
    }
	
	public void refreshImageOnAction() {
		mostrarCandidatosTextArea.setText(BancoDeDados.mostrarCandidatos());
		mensagemVermelhaCadastroLabel.setText("");
		mensagemVerdeCadastroLabel.setText("");
	}
	
	public void editarCandidatoButtonOnAction(ActionEvent e) {
		mensagemVermelhaCadastroLabel.setText("");
		mensagemVerdeCadastroLabel.setText("");
		try {
			int id = Integer.parseInt(idCandidatoTextField.getText());
			int numero = Integer.parseInt(numeroCandidatoTextField.getText());
			
			BancoDeDados.mudarCandidato(id, nomeCandidatoTextField.getText(), numero);
			mensagemVerdeCadastroLabel.setText(String.format("Candidato ID #%s atualizado!", idCandidatoTextField.getText()));
			
		}catch (NumberFormatException e1){
			mensagemVermelhaCadastroLabel.setText("Reveja os valores inseridos.");
		}
		if (idCandidatoTextField.getText().isEmpty()) {
			mensagemVermelhaCadastroLabel.setText("Preencha todos os campos.");
		}
	}
}
