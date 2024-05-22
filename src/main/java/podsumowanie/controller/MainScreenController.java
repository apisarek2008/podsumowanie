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
		FXMLLoader menuScreen = new FXMLLoader(this.getClass().getResource("/fxml/MenuScreen.fxml"));
		Pane pane = null;
		try {
			pane = menuScreen.load();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		mainStackPane.getChildren().add(pane);

	}
}
