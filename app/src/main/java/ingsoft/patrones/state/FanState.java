package ingsoft.patrones.state;

public interface FanState {
    FanState turnDown();
    FanState turnUp();
    String getName();
}
