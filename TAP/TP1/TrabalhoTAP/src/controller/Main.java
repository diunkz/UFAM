package controller;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Main extends Application {
	
	private static Stage stage;
	
	private static Scene loginScene;
	private static Scene menuScene;
	private static Scene cadastrarEleitoresScene;
	private static Scene cadastrarCandidatosScene;
	private static Scene editarCandidatosScene;
	private static Scene editarEleitoresScene;
	private static Scene votacaoScene;
	private static Scene finalScene;
	
    @Override
    public void start(Stage primaryStage) throws Exception{
    	stage = primaryStage;
    	
        Parent fxmlLogin = FXMLLoader.load(getClass().getResource("../view/login.fxml"));
        loginScene = new Scene(fxmlLogin, 520, 400);
        
        Parent fxmlMenu = FXMLLoader.load(getClass().getResource("../view/menu.fxml"));
        menuScene = new Scene(fxmlMenu, 600, 400);
        
        Parent fxmlCadastrarEleitores = FXMLLoader.load(getClass().getResource("../view/cadastrareleitores.fxml"));
        cadastrarEleitoresScene = new Scene(fxmlCadastrarEleitores, 600, 400);
        
        Parent fxmlCadastrarCandidatos = FXMLLoader.load(getClass().getResource("../view/cadastrarcandidatos.fxml"));
        cadastrarCandidatosScene = new Scene(fxmlCadastrarCandidatos, 600, 400);
        
        Parent fxmlEditarCandidatos = FXMLLoader.load(getClass().getResource("../view/editarcandidatos.fxml"));
        editarCandidatosScene = new Scene(fxmlEditarCandidatos, 600, 400);
        
        Parent fxmlEditarEleitores = FXMLLoader.load(getClass().getResource("../view/editareleitores.fxml"));
        editarEleitoresScene = new Scene(fxmlEditarEleitores, 600, 400);
        
        Parent fxmlVotacao = FXMLLoader.load(getClass().getResource("../view/votacao.fxml"));
        votacaoScene = new Scene(fxmlVotacao, 600, 400);
        
        Parent fxmlFinal = FXMLLoader.load(getClass().getResource("../view/final.fxml"));
        finalScene = new Scene(fxmlFinal, 600, 400);
        
        primaryStage.initStyle(StageStyle.UNDECORATED);
        primaryStage.setScene(loginScene);
        primaryStage.show();
    }
    
    public static void changeScreen(String scr) {
    	switch(scr) {
	    	case "login":
	    		stage.setScene(loginScene);
	    		break;
	    	case "menu":
	    		stage.setScene(menuScene);
	    		break;
	    	case "cadastrareleitores":
	    		stage.setScene(cadastrarEleitoresScene);
	    		break;
	    	case "cadastrarcandidatos":
	    		stage.setScene(cadastrarCandidatosScene);
	    		break;
	    	case "editarcandidatos":
	    		stage.setScene(editarCandidatosScene);
	    		break;
	    	case "editareleitores":
	    		stage.setScene(editarEleitoresScene);
	    		break;
	    	case "votacao":
	    		stage.setScene(votacaoScene);
	    		break;
	    	case "final":
	    		stage.setScene(finalScene);
	    		break;
    	}
    }
	    		
	    		


    public static void main(String[] args) {
        launch(args);
    }
}