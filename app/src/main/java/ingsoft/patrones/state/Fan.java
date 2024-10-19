package ingsoft.patrones.state;

public class Fan {
  private static final int OFF = 0;
  private static final int LOW = 1;
  private static final int MEDIUM = 2;
  private static final int HIGH = 3;

  private FanState state = new OffState();

    private void setState(FanState state) {
      this.state = state;
    }
    public String getState() {
        return this.state.getName();
    }

  public void turnUp() {
     setState(state.turnUp());
  }

  public void turnDown() {
      setState(state.turnDown());
  }

}