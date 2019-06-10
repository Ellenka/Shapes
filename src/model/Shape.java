package model;

import javafx.scene.control.TextField;

public abstract class Shape {
  private String name;
  
  Shape(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
  
  
  public abstract double getPerimeter();
  public abstract double getArea();
  
  boolean isDouble(TextField input, String data) {
    try {
     double number = Double.parseDouble(input.getText());
     return true;
    } catch (NumberFormatException e) {
      System.out.println("Error: "+data +"is not a number");
      return false;
    }
  }

  @Override
  public String toString() {
    return "The figure is: " + getName()+", it's perimeter is: " + getPerimeter() + ", it's area is: "
        + getArea();
  }

  
}
