package podsumowanie.controller;

import javafx.fxml.FXML;

public class OptionsScreenController {

	private MainScreenController mainController;

	@FXML
	public void actBackToMenu() {
		mainController.Menu();
	}

	public void setMainController(MainScreenController mainController) {
		this.mainController = mainController;
	}
}
