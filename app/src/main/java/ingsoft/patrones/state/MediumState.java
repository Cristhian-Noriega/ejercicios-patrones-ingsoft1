package ingsoft.patrones.state;

public class MediumState implements FanState{

    @Override
    public FanState turnUp() {
        return new HighState();
    }

    @Override
    public FanState turnDown() {
        return new LowState();
    }
    @Override
    public String getName() {
        return "Medium";
    }
}
