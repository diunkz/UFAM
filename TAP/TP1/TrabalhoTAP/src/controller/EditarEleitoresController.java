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

public class EditarEleitoresController {

	@FXML
	private Button voltarButton;
	
	@FXML
	private Button sairButton;
	
	@FXML
	private TextArea mostrarEleitoresTextArea;
	
	@FXML
	private ImageView refreshImage;
	@FXML
	private TextField idEleitorTextField;
	
	@FXML
	private TextField nomeEleitorTextField;
	
	@FXML
	private TextField numeroEleitorTextField;
	
	@FXML
	private Button editarEleitorButton;
	
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
		mostrarEleitoresTextArea.setText(BancoDeDados.mostrarEleitores());
		mensagemVermelhaCadastroLabel.setText("");
		mensagemVerdeCadastroLabel.setText("");
	}
	
	public void editarEleitorButtonOnAction(ActionEvent e) {
		mensagemVermelhaCadastroLabel.setText("");
		mensagemVerdeCadastroLabel.setText("");
		try {
			int id = Integer.parseInt(idEleitorTextField.getText());
			int numero = Integer.parseInt(numeroEleitorTextField.getText());
			
			BancoDeDados.mudarEleitor(id, nomeEleitorTextField.getText(), numero);
			mensagemVerdeCadastroLabel.setText(String.format("Eleitor ID #%s atualizado!", idEleitorTextField.getText()));
			
		}catch (NumberFormatException e1){
			mensagemVermelhaCadastroLabel.setText("Reveja os valores inseridos.");
		}
		if (idEleitorTextField.getText().isEmpty()) {
			mensagemVermelhaCadastroLabel.setText("Preencha todos os campos.");
		}
	}
}
