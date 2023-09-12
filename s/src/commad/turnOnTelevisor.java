package commad;

import device.ElectronicaDevice;

public class turnOnTelevisor implements Commad{
     private ElectronicaDevice device;
    public turnOnTelevisor(ElectronicaDevice device){
        this.device = device;
    }
    @Override
    public void execute() {
        device.on();
    }
    @Override
    public void undo() {
     device.off();  
}
}
