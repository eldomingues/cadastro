package cadastro.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class inicialController implements Initializable{

	
	public void initialize(URL location, ResourceBundle resource ) {
		
	}
	
	@FXML
	Button btnAdiciona = new Button();
	
	@FXML
	Button btnListar = new Button();
	
	@FXML
	Button btnSair = new Button();
	
	@FXML
	Label lblTitulo = new Label();
	
	@FXML
	public void adicionar(ActionEvent event) throws IOException {
		Parent cadastro = FXMLLoader.load(getClass().getResource("/fxml/FXMLadiciona.fxml"));
		Scene cadastroScene = new Scene(cadastro);
		Stage cadastroTela = (Stage)((Node) event.getSource()).getScene().getWindow();
		
		cadastroTela.setScene(cadastroScene);
		cadastroTela.show();
	}
}
