package podsumowanie.controller;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;

public class MainScreenController {

	@FXML
	private StackPane mainStackPane;

	@FXML
	void initialize() {
		Menu();

	}

	public void Menu() {
		FXMLLoader menuScreen = new FXMLLoader(this.getClass().getResource("/fxml/MenuScreen.fxml"));
		Pane pane = null;
		try {
			pane = menuScreen.load();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		MenuScreenController menuSController = menuScreen.getController();
		menuSController.setMainController(this);
		setScreen(pane);
	}

	public void setScreen(Pane pane) {
		mainStackPane.getChildren().clear();
		mainStackPane.getChildren().add(pane);
	}
}
