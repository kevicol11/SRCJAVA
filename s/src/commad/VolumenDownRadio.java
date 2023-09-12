package commad;

import device.ElectronicaDevice;

public class VolumenDownRadio implements Commad {
    private ElectronicaDevice device;

    public VolumenDownRadio (ElectronicaDevice device){
this.device = device;
}

    @Override
    public void execute() {
        device.volumenDum();
    }

    @Override
    public void undo() {
     device.volumenUp();
}
}