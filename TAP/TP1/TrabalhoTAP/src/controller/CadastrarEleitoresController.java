package controller;

import base.Eleitor;
import connection.BancoDeDados;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class CadastrarEleitoresController {

	@FXML
	private Button voltarButton;
	
	@FXML
	private Button sairButton;
	
	@FXML
	private TextField eleitorTextField;
	
	@FXML
	private TextField tituloTextField;
	
	@FXML
	private Label mensagemVermelhaCadastroLabel;
	
	@FXML
	private Label mensagemVerdeCadastroLabel;
	
	@FXML
	private Button cadastrarEleitorButton;

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
	
	public void cadastrarEleitorButtonOnAction(ActionEvent event){
		try {
			String eleitor = eleitorTextField.getText();
			int numero = Integer.parseInt(tituloTextField.getText());
			Eleitor eleit = new Eleitor(eleitor, numero);
			BancoDeDados.adicionarEleitor(eleit);
			mensagemVermelhaCadastroLabel.setText("");	
			mensagemVerdeCadastroLabel.setText(String.format("Eleitor %s, título %d cadastrado.",eleitor, numero ));

		}catch (NumberFormatException e){
			mensagemVerdeCadastroLabel.setText("");
			mensagemVermelhaCadastroLabel.setText("Entrada Inválida!");			
		}
    }
}
