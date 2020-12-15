package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class FinalController {

	@FXML
	private Button sairButton;
	
	@FXML
	private Button verButton;
	
	@FXML
	private TextField vencedorTextField;
	
	public void sairButtonOnAction(ActionEvent event){
        Stage stage = (Stage) sairButton.getScene().getWindow();
        stage.close();
    }
	
	public void verButtonOnAction(ActionEvent event) {
		vencedorTextField.setText("Junkes Junior");
	}
	
	
}
