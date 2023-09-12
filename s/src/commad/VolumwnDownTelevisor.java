package commad;

import device.ElectronicaDevice;

public class VolumwnDownTelevisor implements Commad {
    private ElectronicaDevice device;

    public VolumwnDownTelevisor (ElectronicaDevice device){
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