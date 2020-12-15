package controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.event.ActionEvent;

import java.io.File;
import java.util.ResourceBundle;

import connection.BancoDeDados;

import java.net.URL;

public class LoginController implements Initializable {

    @FXML
    private Button cancelButton;
    @FXML
    private Label loginMessageLabel;
    @FXML
    private ImageView brandingImageView;
    @FXML
    private ImageView lockImageView;
    @FXML
    private PasswordField enterPasswordField;
    @FXML
    private TextField usernameTextField;
    
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle){
    	
        File brandingFile = new File("src/Images/logo.png");
        Image brandingImage = new Image(brandingFile.toURI().toString());
        brandingImageView.setImage(brandingImage);

        File lockFile = new File("src/Images/lock.png");
        Image lockImage = new Image(lockFile.toURI().toString());
        lockImageView.setImage(lockImage);
    }

    public boolean verificarLogin() {
    	BancoDeDados bd = new BancoDeDados(usernameTextField.getText(), enterPasswordField.getText());
    	if(bd.conecta()) {
    		return true;
    	}else {
    		return false;
    	}
    }

    public void loginButtonOnAction(ActionEvent event){
    	if(usernameTextField.getText().isBlank() == false && enterPasswordField.getText().isBlank() == false) {
    		if(verificarLogin()) {
    			loginMessageLabel.setText("Login bem sucedido!.");
    			Main.changeScreen("menu");
    		}else {
    			loginMessageLabel.setText("Usuário ou Senha Inválidos.");
    		}
    	}else {
    		loginMessageLabel.setText("Insira os dados corretamente!");
    	}
    }

    public void cancelButtonOnAction(ActionEvent event){
        Stage stage = (Stage) cancelButton.getScene().getWindow();
        stage.close();
    }
}