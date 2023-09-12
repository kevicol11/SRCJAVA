package commad;

import device.ElectronicaDevice;

public class RadioOff implements Commad {
    private ElectronicaDevice device;

   public RadioOff(ElectronicaDevice device){
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
