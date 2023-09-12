package commad;
import device.ElectronicaDevice;
import java.util.List;

public class turnOffAllDevice implements Commad {
    List<ElectronicaDevice> allDevice;

    public turnOffAllDevice (List<ElectronicaDevice> newDevice){
        allDevice = newDevice;
     }
     @Override
     public void execute() {
     for(ElectronicaDevice device : allDevice){
       device.off();
     }  }
     
     @Override
     public void undo() {
     for(ElectronicaDevice device : allDevice){
       device.on();
     } 
     }
    }