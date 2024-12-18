package ingsoft.patrones.visitor;

public class AreaCalculatorVisitor implements ShapeVisitor{

    private double totalArea = 0;
    @Override
    public void visit(Circle circle) {
        totalArea += Math.PI * circle.getRadius() * circle.getRadius();
    }
    @Override
    public void visit(Rectangle rectangle){
        totalArea += rectangle.getWidth() * rectangle.getHeight();
    }
    @Override
    public void visit(Triangle triangle){
        totalArea += (triangle.getBase() * triangle.getHeight()) / 2;
    }

    public double getTotalArea() {
        return totalArea;
    }
}
