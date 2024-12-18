package ingsoft.patrones.visitor;

public class Circle implements Shape {
  private double radius;

  public Circle(double radius) {
    this.radius = radius;
  }

  public double getRadius() {
    return this.radius;
  }
  @Override
  public double getArea() {
    return Math.PI * radius * radius;
  }

  public void accept(ShapeVisitor visitor) {
      visitor.visit(this);
  }
}
