import commad.RadioOff;
import commad.RadioOn;
import commad.VolumenUpRadio;
import commad.VolumenUpTelevisor;
import commad.turnOffTelevisor;
import commad.turnOnTelevisor;
import device.DiviceButton;
import device.ElectronicaDevice;
import device.Radio;
import device.Television;

public class App {
    public static void main(String[] args) throws Exception {
       ElectronicaDevice televisonOne = new Television("SAMSUNG");

       turnOnTelevisor  onCommad = new turnOnTelevisor(televisonOne);

       DiviceButton onPressd; 
       onPressd = new DiviceButton(onCommad);
       onPressd.press();

       turnOffTelevisor offCommad = new turnOffTelevisor(televisonOne);
       onPressd = new DiviceButton(offCommad);
       onPressd.press();

       VolumenUpTelevisor volumenUp = new VolumenUpTelevisor(televisonOne);
       onPressd = new DiviceButton (volumenUp);
       onPressd.press();
       onPressd.press();
       onPressd.press();
       ElectronicaDevice RadioUno = new Radio("HUAWEI");

       RadioOn  onCommand = new RadioOn(RadioUno);

       DiviceButton onPresssd; 
       onPresssd = new DiviceButton(onCommand);
       onPresssd.press();

       RadioOff offCommand = new RadioOff(RadioUno);
       onPresssd = new DiviceButton(offCommand);
       onPresssd.press();

       VolumenUpRadio volumenUpRadio1 = new VolumenUpRadio(RadioUno);
       onPresssd = new DiviceButton (volumenUpRadio1);
       onPresssd.press();
       onPresssd.press();
       onPresssd.press();
       

    }
}
