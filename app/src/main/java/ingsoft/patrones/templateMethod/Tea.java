package ingsoft.patrones.templateMethod;

public class Tea extends Beverage {

  @Override
  protected String brew() {
    return "Steeping the tea\n";
  } 

  @Override
  protected String addCondiments() {
    return "Adding lemon\n";
  }
}

