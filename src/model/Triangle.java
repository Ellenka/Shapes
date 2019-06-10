package model;

public class Triangle extends Shape {
  
  private double a;
  private double b;
  private double c;

  public Triangle(String name, double a, double b, double c) {
    super(name);
    this.a = a;
    this.b = b;
    this.c = c;
  }

  @Override
  public double getPerimeter() {
    return a+b+c;
  }

  @Override
  public double getArea() {
    return Math.sqrt(getPerimeter()*(getPerimeter()-a)*(getPerimeter()-b)+(getPerimeter()-c));
  }

}
