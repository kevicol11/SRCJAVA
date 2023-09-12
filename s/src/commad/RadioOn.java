package commad;

import device.ElectronicaDevice;

public class RadioOn implements Commad {
    private ElectronicaDevice device;

   public RadioOn(ElectronicaDevice device){
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
