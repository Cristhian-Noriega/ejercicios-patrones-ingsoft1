package ingsoft.patrones.templateMethod;

public abstract class Beverage {
  public final String prepare() {
    return boilWater() +
           brew() +
           pourInCup() +
           addCondiments();
  }

  private String boilWater() {
    return "Boiling water\n";
  }

  private String pourInCup() {
    return "Pouring into cup\n";  
  }

  protected abstract String brew();

  protected abstract String addCondiments();
}
