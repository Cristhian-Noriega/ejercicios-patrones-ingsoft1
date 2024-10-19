package ingsoft.patrones.templateMethod;

public abstract class Beverage {
  public abstract String prepare();
  private String boilWater() {
    return "Boiling water\n";
  };
  private String pourInCup() {
    return "Pouring into cup\n";
  }
  public abstract addCondiment();

  public abstract
}