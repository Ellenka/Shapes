package controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import model.Shape;
import model.Triangle;

import java.io.IOException;

import javafx.event.ActionEvent;

public class triangleController {
	@FXML
	private Button tSend;
	@FXML
	private Button tbButton;
	
	@FXML
	private TextField taText;
	@FXML
	private TextField tbText;
	@FXML
	private TextField tcText;

	// Event Listener on Button[#tSend].onAction
	@FXML
	public void triangleSent(ActionEvent event) {
	  double a = Double.parseDouble(taText.getText());
	  double b = Double.parseDouble(tbText.getText());
	  double c = Double.parseDouble(tcText.getText());
      Shape triangle = new Triangle("Triangle", a,b,c);
      System.out.println("The perimeter of "+triangle.getName()+ " is "+ triangle.getPerimeter());
      System.out.println("The area of "+ triangle.getName()+ " is "+ triangle.getArea());
	}
	// Event Listener on Button[#tbButton].onAction
	@FXML
	public void tBack(ActionEvent event) throws IOException {
	  Parent backView = FXMLLoader.load(getClass().getResource("/view/choice.fxml"));
      Scene backScene = new Scene (backView, 400, 400);
      Stage backWindow = (Stage) ((Node)event.getSource()).getScene().getWindow();
      backWindow.setScene(backScene);
      backWindow.show();
	}
}
