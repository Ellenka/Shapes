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
import model.Square;

import java.io.IOException;

import javafx.event.ActionEvent;

public class squareController {
	@FXML
	private Button sSend;
	@FXML
	private Button sbButton;
	@FXML
    private TextField sText;


	// Event Listener on Button[#sSend].onAction
	@FXML
	public void squareSent(ActionEvent event) {
	  double side = Double.parseDouble(sText.getText());
      Shape square = new Square("Square", side);
      System.out.println("The perimeter of "+square.getName()+ " is "+ square.getPerimeter());
      System.out.println("The area of "+ square.getName()+ " is "+ square.getArea());
	}
	// Event Listener on Button[#sbButton].onAction
	@FXML
	public void sBack(ActionEvent event) throws IOException {
	  Parent backView = FXMLLoader.load(getClass().getResource("/view/choice.fxml"));
      Scene backScene = new Scene (backView, 400, 400);
      Stage backWindow = (Stage) ((Node)event.getSource()).getScene().getWindow();
      backWindow.setScene(backScene);
      backWindow.show();
	}
}
