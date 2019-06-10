package model;

public class Square extends Shape {
  private double side;

  public Square(String name, double side) {
    super(name);
    this.side = side;
    
  }

  @Override
  public
  double getPerimeter() {
    return 4*side;
  }

  @Override
  public
  double getArea() {
    return Math.pow(side, 2);
  }

}
