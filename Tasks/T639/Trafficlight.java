package Tasks.T639;

public class Trafficlight {
    private TrafficlightState curSt;

    public Trafficlight(){
        this.curSt = new GreenState();
    }

    public void setState(TrafficlightState st){
        this.curSt = st;
    }

    public void next(){
        System.out.println(curSt.getColor());
        curSt.next(this);
    }
}
