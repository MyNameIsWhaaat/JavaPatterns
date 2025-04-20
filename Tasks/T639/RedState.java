package Tasks.T639;

public class RedState implements TrafficlightState{
    @Override
    public void next(Trafficlight tl) {
        tl.setState(new YellowStateBack());
    }

    @Override
    public String getColor() {
        return "Красный";
    }
}
