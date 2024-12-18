package ingsoft.patrones.builder;

public class BurguerBuilder {
    private BurguerPart burguerPart;

    public BurguerBuilder() {
        burguerPart = new Cheese();
    }

    public BurguerBuilder addMeat() {
        burguerPart = new Meat(burguerPart);
        return this;
    }

    public BurguerBuilder addBread() {
        burguerPart = new Bread(burguerPart);
        return this;
    }

    public BurguerPart build() {
        return burguerPart;
    }
}
