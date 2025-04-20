package Tasks.T639;

public class GreenState implements TrafficlightState{
    @Override
    public void next(Trafficlight tl) {
        tl.setState(new YellowState());
    }

    @Override
    public String getColor() {
        return "Зеленый";
    }
    
}
