package device;

public class Radio implements ElectronicaDevice {
    private int volumen = 0;
    private String name;
    public Radio(String name){
        this.name = name;
    }
    @Override
    public void off() {
        System.out.println(name + " RADIO ENCENDER ");
        
    }
    @Override
    public void on() {
        System.out.println(name +" RADIO APAGAR ");
        
    }
    @Override
    public void volumenUp() {
        volumen++;
        System.out.println(name +" RADIO SUBIR VOLUMEN "+ volumen);
        
    }
    @Override
    public void volumenDum() {
        volumen--;
        System.out.println(name +" RADIO BAJAR VOLUMEN "+ volumen);
        
    }
}
