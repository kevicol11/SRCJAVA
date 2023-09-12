package commad;

import device.ElectronicaDevice;

public class VolumenUpTelevisor implements Commad{
     private ElectronicaDevice device;

    public VolumenUpTelevisor (ElectronicaDevice device){
this.device = device;
}

    @Override
    public void execute() {
        device.volumenUp();
    }

    @Override
    public void undo() {
     device.volumenDum();
}
}