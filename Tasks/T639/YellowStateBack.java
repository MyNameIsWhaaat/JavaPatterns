package Tasks.T639;

public class YellowStateBack implements TrafficlightState{
    @Override
    public void next(Trafficlight tl) {
        tl.setState(new GreenState());
    }

    @Override
    public String getColor() {
        return "Желтый";
    }
}
