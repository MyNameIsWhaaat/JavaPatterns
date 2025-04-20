package Tasks.T639;

public class YellowState implements TrafficlightState{
    @Override
    public void next(Trafficlight tl) {
        tl.setState(new RedState());
    }

    @Override
    public String getColor() {
        return "Желтый";
    }
    
}
