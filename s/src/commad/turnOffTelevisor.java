package commad;

import device.ElectronicaDevice;

public class turnOffTelevisor implements Commad {
    private ElectronicaDevice device;
    public turnOffTelevisor(ElectronicaDevice device){
        this.device = device;
    }
    @Override
    public void execute() {
        device.off();
    }
    @Override
    public void undo() {
     device.on();  
    }
}
