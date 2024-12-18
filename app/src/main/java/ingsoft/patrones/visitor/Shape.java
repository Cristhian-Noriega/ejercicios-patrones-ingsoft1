package ingsoft.patrones.visitor;

public interface Shape {
  double getArea();

  void accept(ShapeVisitor visitor);
}
