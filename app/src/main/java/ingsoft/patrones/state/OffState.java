package ingsoft.patrones.state;

public class OffState implements FanState {
    @Override
    public FanState turnUp() {
        return new LowState();
    }

    @Override
    public FanState turnDown() {
        return this;
    }
    @Override
    public String getName() {
        return "Off";
    }
}
