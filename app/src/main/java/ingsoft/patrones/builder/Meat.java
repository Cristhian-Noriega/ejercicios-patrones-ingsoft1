package ingsoft.patrones.builder;

public class Meat implements BurguerPart {
    private BurguerPart part;

    public Meat(BurguerPart part) {
        this.part = part;
    }

    public String getDescription() {
        return this.part.getDescription() + "+Meet";
    }
    
    public double  getCost() {
        return this.part.getCost() + 5;
    }
}
