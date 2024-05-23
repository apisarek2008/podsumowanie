package podsumowanie.controller;

import java.io.IOException;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.Pane;

public class MenuScreenController {

	private MainScreenController mainController;

	@FXML
	void openApplication() {
		FXMLLoader loadAppScreen = new FXMLLoader(this.getClass().getResource("/fxml/AppScreen.fxml"));
		Pane appScreen = null;
		try {
			appScreen = loadAppScreen.load();
		} catch (IOException e) {
			System.out.println("loadAppScreen.load() - failed");
			e.printStackTrace();
		}
		AppScreenController appController = loadAppScreen.getController();
		appController.setMainController(mainController);
		mainController.setScreen(appScreen);

	}

	@FXML
	void openOptions() {
		FXMLLoader loader = new FXMLLoader(this.getClass().getResource("/fxml/OptionsScreen.fxml"));
		Pane optScreen = null;
		try {
			optScreen = loader.load();
		} catch (IOException e) {
			e.printStackTrace();
		}
		OptionsScreenController optController = loader.getController();
		optController.setMainController(mainController);
		mainController.setScreen(optScreen);
		
	}

	@FXML
	void Exit() {
	Platform.exit();	
		
	}

	public void setMainController(MainScreenController mainController) {
		this.mainController = mainController;
	}

}
