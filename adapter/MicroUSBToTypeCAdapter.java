package adapter ;

public class MicroUSBToTypeCAdapter  implements TypeC{
    private final MicroUSBCharger microUSBCharger;

    public MicroUSBToTypeCAdapter(MicroUSBCharger microUSBCharger) {
        if (microUSBCharger == null) {
            throw new IllegalArgumentException("MicroUSB зарядное устройство не может быть null!");
        }
        this.microUSBCharger = microUSBCharger;
    }

    @Override
    public void connectWithTypeCCable(){
        this.microUSBCharger.insert();
        this.microUSBCharger.power();
    }
}