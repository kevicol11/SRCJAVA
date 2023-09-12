package commad;

import device.ElectronicaDevice;

public class VolumenUpRadio implements Commad {
    private ElectronicaDevice device;

    public VolumenUpRadio(ElectronicaDevice device){
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