package podsumowanie.controller;

import javafx.fxml.FXML;

public class AppScreenController {

	MainScreenController mainController;
	
	@FXML
	public void BackToMenu() {
		mainController.Menu();
	}

	public void setMainController(MainScreenController mainController) {
		this.mainController = mainController;
	}

	
	
	
	

}
