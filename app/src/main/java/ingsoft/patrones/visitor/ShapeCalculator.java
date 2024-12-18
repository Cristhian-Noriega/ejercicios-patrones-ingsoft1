package ingsoft.patrones.visitor;

import java.util.List;

public class ShapeCalculator {
  public static double getTotalArea(List<Shape> shapes) {
    AreaCalculatorVisitor areaCalculatorVisitor = new AreaCalculatorVisitor();
    for (Shape shape : shapes) {
      shape.accept(areaCalculatorVisitor);
    }
    return areaCalculatorVisitor.getTotalArea();
  }
}
