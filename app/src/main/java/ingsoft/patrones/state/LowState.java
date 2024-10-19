package ingsoft.patrones.state;

public class LowState implements FanState{
    @Override
    public FanState turnUp() {
        return new MediumState();
    }
    @Override
    public FanState turnDown() {
        return new OffState();
    }
    @Override
    public String getName(){
        return "Low";
    }
}
