package controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import model.Circle;
import model.Shape;

import java.io.IOException;

import javafx.event.ActionEvent;

public class circleController {
	@FXML
	private Button cSend;
	@FXML
	private Button cbButton;
	@FXML
	private TextField cText;

	// Event Listener on Button[#cSend].onAction
	@FXML
	public void circleSent(ActionEvent event) {
		double rad = Double.parseDouble(cText.getText());
		Shape circle = new Circle("Circle", rad);
		System.out.println("The perimeter of "+circle.getName()+ " is "+ circle.getPerimeter());
		System.out.println("The area of "+ circle.getName()+ " is "+ circle.getArea());
		
	}
	// Event Listener on Button[#cbButton].onAction
	@FXML
	public void cBack(ActionEvent event) throws IOException {
	  Parent backView = FXMLLoader.load(getClass().getResource("/view/choice.fxml"));
      Scene backScene = new Scene (backView, 400, 400);
      Stage backWindow = (Stage) ((Node)event.getSource()).getScene().getWindow();
      backWindow.setScene(backScene);
      backWindow.show();
	}
}
