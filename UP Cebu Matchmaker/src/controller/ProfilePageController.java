package controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;

import java.io.IOException;
import java.util.ArrayList;

import javafx.event.ActionEvent;

import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Hyperlink;

public class ProfilePageController {
	@FXML
	private Label usernameLbl;
	@FXML
	private Label usernameHead;
	@FXML
	private Hyperlink editLink;
	@FXML
	private Label nameLbl;
	@FXML
	private Label ageLbl;
	@FXML
	private Hyperlink matchesLink;
	
	private int id;

	// Event Listener on Hyperlink[#matchesLink].onAction
	@FXML
	public void matchesLinkClick(ActionEvent event) throws IOException {
		// TODO Autogenerated
		FXMLLoader loader = new FXMLLoader();
		Parent root = loader.load(getClass().getResource("/view/MatchesPage.fxml").openStream());
		MatchesPageController matchesPageController = (MatchesPageController) loader.getController();
		matchesPageController.setUsername(usernameLbl.getText());
		Stage stage = (Stage) matchesLink.getScene().getWindow();
		stage.setTitle("Matches");
		Scene scene = new Scene(root);
		scene.getStylesheets().add("/theme/pastel.css");
		stage.setScene(scene);
		stage.show();
	}
	
	public void setUser(ArrayList<String> info) {
		usernameLbl.setText(info.get(3));
		usernameHead.setText(info.get(3));
		nameLbl.setText(info.get(0) + " " + info.get(1));
		ageLbl.setText(info.get(2));
	}
	
	public void setId(int id) {
		this.id = id;
	}
}
