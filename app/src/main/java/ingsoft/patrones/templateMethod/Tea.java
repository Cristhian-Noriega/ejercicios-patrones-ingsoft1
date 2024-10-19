package ingsoft.patrones.templateMethod;

public class Tea extends Beverage {
  @Override()
  public String prepare() {
    return boilWater() +
           steepTeaBag() +
           pourInCup() +
           addLemon();
  }



  private String steepTeaBag() {
    return "Steeping the tea\n";
  }



  private String addLemon() {
    return "Adding lemon\n";
  }
}
