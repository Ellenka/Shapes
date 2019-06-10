package controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

import javafx.event.ActionEvent;

public class choiceController  {
	@FXML
	private Button cbutton;
	@FXML
	private Button sbutton;
	@FXML
	private Button tbutton;

	// Event Listener on Button[#cbutton].onAction
	@FXML
	public void circleChoice(ActionEvent event) throws IOException {
	  Parent circleView = FXMLLoader.load(getClass().getResource("/view/circle.fxml"));
	  Scene circleScene = new Scene(circleView, 400, 400);
	  Stage circleWindow = (Stage) ((Node)event.getSource()).getScene().getWindow();
	  circleWindow.setScene(circleScene);
	  circleWindow.show();
	 
	    }
	@FXML
	public void squareChoice(ActionEvent event) throws IOException {
	  Parent squareView = FXMLLoader.load(getClass().getResource("/view/square.fxml"));
	  Scene squareScene = new Scene (squareView, 400, 400);
	  Stage squareWindow = (Stage) ((Node)event.getSource()).getScene().getWindow();
	  squareWindow.setScene(squareScene);
	  squareWindow.show();
	  
	}
	@FXML
	public void triangleChoice(ActionEvent event) throws IOException {
	  Parent triangleView = FXMLLoader.load(getClass().getResource("/view/triangle.fxml"));
	  Scene triangleScene = new Scene (triangleView, 400,400);
	  Stage triangleWindow = (Stage) ((Node)event.getSource()).getScene().getWindow();
	  triangleWindow.setScene(triangleScene);
	  triangleWindow.show();
	  
	  
	}
   
	}


