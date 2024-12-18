package ingsoft.patrones.templateMethod;

public class Coffee extends Beverage {

  @Override
  protected String brew() {
    return "Brewing coffee grinds\n";
  }

  @Override
  protected String addCondiments() {
    return "Adding sugar and milk\n";
  }
}
