package podsumowanie.controller;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;

public class MenuScreenController {
	
	@FXML
	private Button btnApplication;
	@FXML
	private Button btnOption;
	@FXML
	private Button btnExit;
	
	
	@FXML
	void openApplication() {
		FXMLLoader loadAppScreen = new FXMLLoader(this.getClass().getResource("/fxml/AppScreen.fxml"));
		try {
			Pane pane = loadAppScreen.load();
		} catch (IOException e) {
			System.out.println("loadAppScreen.load() - failed");
			e.printStackTrace();
		}
		
		
	}
	
	@FXML
	void openOptions() {
		
	}
	
	@FXML
	void Exit() {
		
	}
	
	
	

}
