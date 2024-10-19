package ingsoft.patrones.state;

public class HighState implements FanState{
    @Override
    public FanState turnUp() {
        return this;
    }
    @Override
    public FanState turnDown() {
        return new MediumState();
    }
    @Override
    public  String getName(){
        return "High";
    }
}
